package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteOutput extends StObject {
  
  var Site: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Site] = js.undefined
}
object UpdateSiteOutput {
  
  inline def apply(): UpdateSiteOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSiteOutput]
  }
  
  extension [Self <: UpdateSiteOutput](x: Self) {
    
    inline def setSite(value: Site): Self = StObject.set(x, "Site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "Site", js.undefined)
  }
}
