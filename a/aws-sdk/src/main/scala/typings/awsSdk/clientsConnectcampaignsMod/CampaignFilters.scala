package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignFilters extends StObject {
  
  var instanceIdFilter: js.UndefOr[InstanceIdFilter] = js.undefined
}
object CampaignFilters {
  
  inline def apply(): CampaignFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignFilters]
  }
  
  extension [Self <: CampaignFilters](x: Self) {
    
    inline def setInstanceIdFilter(value: InstanceIdFilter): Self = StObject.set(x, "instanceIdFilter", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdFilterUndefined: Self = StObject.set(x, "instanceIdFilter", js.undefined)
  }
}
