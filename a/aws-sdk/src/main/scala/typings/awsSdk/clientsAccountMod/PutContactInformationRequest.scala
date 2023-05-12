package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutContactInformationRequest extends StObject {
  
  /**
    * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId. It must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, don't specify this parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsAccountMod.AccountId] = js.undefined
  
  /**
    * Contains the details of the primary contact information associated with an Amazon Web Services account.
    */
  var ContactInformation: typings.awsSdk.clientsAccountMod.ContactInformation
}
object PutContactInformationRequest {
  
  inline def apply(ContactInformation: ContactInformation): PutContactInformationRequest = {
    val __obj = js.Dynamic.literal(ContactInformation = ContactInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutContactInformationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutContactInformationRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setContactInformation(value: ContactInformation): Self = StObject.set(x, "ContactInformation", value.asInstanceOf[js.Any])
  }
}
