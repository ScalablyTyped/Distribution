package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMembersRequest extends StObject {
  
  /**
    * The list of accounts to associate with the Security Hub administrator account. For each account, the list includes the account ID and optionally the email address.
    */
  var AccountDetails: AccountDetailsList
}
object CreateMembersRequest {
  
  inline def apply(AccountDetails: AccountDetailsList): CreateMembersRequest = {
    val __obj = js.Dynamic.literal(AccountDetails = AccountDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMembersRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMembersRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountDetails(value: AccountDetailsList): Self = StObject.set(x, "AccountDetails", value.asInstanceOf[js.Any])
    
    inline def setAccountDetailsVarargs(value: AccountDetails*): Self = StObject.set(x, "AccountDetails", js.Array(value*))
  }
}
