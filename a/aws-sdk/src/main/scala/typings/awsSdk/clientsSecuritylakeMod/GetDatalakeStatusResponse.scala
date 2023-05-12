package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeStatusResponse extends StObject {
  
  /**
    * The list of enabled accounts and enabled sources.
    */
  var accountSourcesList: AccountSourcesList
  
  /**
    * Lists if there are more results available. The value of nextToken is a unique pagination token for each page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.  Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[SafeString] = js.undefined
}
object GetDatalakeStatusResponse {
  
  inline def apply(accountSourcesList: AccountSourcesList): GetDatalakeStatusResponse = {
    val __obj = js.Dynamic.literal(accountSourcesList = accountSourcesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatalakeStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setAccountSourcesList(value: AccountSourcesList): Self = StObject.set(x, "accountSourcesList", value.asInstanceOf[js.Any])
    
    inline def setAccountSourcesListVarargs(value: AccountSources*): Self = StObject.set(x, "accountSourcesList", js.Array(value*))
    
    inline def setNextToken(value: SafeString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
