package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatalakeStatusRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for which a static snapshot of the current Amazon Web Services Region, including enabled accounts and log sources, is retrieved.
    */
  var accountSet: js.UndefOr[InputSet] = js.undefined
  
  /**
    * The maximum limit of accounts for which the static snapshot of the current Region, including enabled accounts and log sources, is retrieved.
    */
  var maxAccountResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * Lists if there are more results available. The value of nextToken is a unique pagination token for each page. Repeat the call using the returned token to retrieve the next page. Keep all other arguments unchanged.  Each pagination token expires after 24 hours. Using an expired pagination token will return an HTTP 400 InvalidToken error.
    */
  var nextToken: js.UndefOr[SafeString] = js.undefined
}
object GetDatalakeStatusRequest {
  
  inline def apply(): GetDatalakeStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatalakeStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatalakeStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountSet(value: InputSet): Self = StObject.set(x, "accountSet", value.asInstanceOf[js.Any])
    
    inline def setAccountSetUndefined: Self = StObject.set(x, "accountSet", js.undefined)
    
    inline def setAccountSetVarargs(value: SafeString*): Self = StObject.set(x, "accountSet", js.Array(value*))
    
    inline def setMaxAccountResults(value: Integer): Self = StObject.set(x, "maxAccountResults", value.asInstanceOf[js.Any])
    
    inline def setMaxAccountResultsUndefined: Self = StObject.set(x, "maxAccountResults", js.undefined)
    
    inline def setNextToken(value: SafeString): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
