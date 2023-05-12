package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessTokensResponse extends StObject {
  
  /**
    * A list of personal access tokens (PATs) associated with the calling user identity.
    */
  var items: AccessTokenSummaries
  
  /**
    * A token returned from a call to this API to indicate the next batch of results to return, if any.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListAccessTokensResponse {
  
  inline def apply(items: AccessTokenSummaries): ListAccessTokensResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessTokensResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccessTokensResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: AccessTokenSummaries): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: AccessTokenSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
