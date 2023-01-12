package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseAccountRequest extends StObject {
  
  /**
    * Retrieves the Amazon Web Services account Id for the current CloseAccount API request. 
    */
  var AccountId: typings.awsSdk.clientsOrganizationsMod.AccountId
}
object CloseAccountRequest {
  
  inline def apply(AccountId: AccountId): CloseAccountRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseAccountRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseAccountRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
