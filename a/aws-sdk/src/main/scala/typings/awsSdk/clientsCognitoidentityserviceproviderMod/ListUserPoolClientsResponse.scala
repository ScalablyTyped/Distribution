package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserPoolClientsResponse extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  
  /**
    * The user pool clients in the response that lists user pool clients.
    */
  var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined
}
object ListUserPoolClientsResponse {
  
  inline def apply(): ListUserPoolClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserPoolClientsResponse]
  }
  
  extension [Self <: ListUserPoolClientsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserPoolClients(value: UserPoolClientListType): Self = StObject.set(x, "UserPoolClients", value.asInstanceOf[js.Any])
    
    inline def setUserPoolClientsUndefined: Self = StObject.set(x, "UserPoolClients", js.undefined)
    
    inline def setUserPoolClientsVarargs(value: UserPoolClientDescription*): Self = StObject.set(x, "UserPoolClients", js.Array(value*))
  }
}
