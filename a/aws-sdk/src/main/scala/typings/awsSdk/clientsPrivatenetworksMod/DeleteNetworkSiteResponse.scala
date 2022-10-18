package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkSiteResponse extends StObject {
  
  /**
    * Information about the network site.
    */
  var networkSite: js.UndefOr[NetworkSite] = js.undefined
}
object DeleteNetworkSiteResponse {
  
  inline def apply(): DeleteNetworkSiteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkSiteResponse]
  }
  
  extension [Self <: DeleteNetworkSiteResponse](x: Self) {
    
    inline def setNetworkSite(value: NetworkSite): Self = StObject.set(x, "networkSite", value.asInstanceOf[js.Any])
    
    inline def setNetworkSiteUndefined: Self = StObject.set(x, "networkSite", js.undefined)
  }
}
