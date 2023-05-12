package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAlternateContactRequest extends StObject {
  
  /**
    * Specifies the 12 digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you do not specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account, and the specified account ID must be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId; it must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, then don't specify this parameter, and call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsAccountMod.AccountId] = js.undefined
  
  /**
    * Specifies which of the alternate contacts to delete. 
    */
  var AlternateContactType: typings.awsSdk.clientsAccountMod.AlternateContactType
}
object DeleteAlternateContactRequest {
  
  inline def apply(AlternateContactType: AlternateContactType): DeleteAlternateContactRequest = {
    val __obj = js.Dynamic.literal(AlternateContactType = AlternateContactType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAlternateContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAlternateContactRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
  }
}
