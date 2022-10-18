package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinksResponse extends StObject {
  
  /**
    * The links.
    */
  var Links: js.UndefOr[LinkList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetLinksResponse {
  
  inline def apply(): GetLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinksResponse]
  }
  
  extension [Self <: GetLinksResponse](x: Self) {
    
    inline def setLinks(value: LinkList): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    inline def setLinksVarargs(value: Link*): Self = StObject.set(x, "Links", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
