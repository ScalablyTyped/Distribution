package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNetworkSitesResponse extends StObject {
  
  /**
    * Information about the network sites.
    */
  var networkSites: js.UndefOr[NetworkSiteList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListNetworkSitesResponse {
  
  inline def apply(): ListNetworkSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNetworkSitesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNetworkSitesResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkSites(value: NetworkSiteList): Self = StObject.set(x, "networkSites", value.asInstanceOf[js.Any])
    
    inline def setNetworkSitesUndefined: Self = StObject.set(x, "networkSites", js.undefined)
    
    inline def setNetworkSitesVarargs(value: NetworkSite*): Self = StObject.set(x, "networkSites", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
