package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDistributionsByRealtimeLogConfigResult extends StObject {
  
  var DistributionList: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.DistributionList] = js.undefined
}
object ListDistributionsByRealtimeLogConfigResult {
  
  inline def apply(): ListDistributionsByRealtimeLogConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDistributionsByRealtimeLogConfigResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDistributionsByRealtimeLogConfigResult] (val x: Self) extends AnyVal {
    
    inline def setDistributionList(value: DistributionList): Self = StObject.set(x, "DistributionList", value.asInstanceOf[js.Any])
    
    inline def setDistributionListUndefined: Self = StObject.set(x, "DistributionList", js.undefined)
  }
}
