package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAlternateContactRequest extends StObject {
  
  /**
    * Specifies the 12 digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you do not specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account, and the specified account ID must be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId; it must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, then don't specify this parameter, and call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsAccountMod.AccountId] = js.undefined
  
  /**
    * Specifies which alternate contact you want to create or update.
    */
  var AlternateContactType: typings.awsSdk.clientsAccountMod.AlternateContactType
  
  /**
    * Specifies an email address for the alternate contact. 
    */
  var EmailAddress: typings.awsSdk.clientsAccountMod.EmailAddress
  
  /**
    * Specifies a name for the alternate contact.
    */
  var Name: typings.awsSdk.clientsAccountMod.Name
  
  /**
    * Specifies a phone number for the alternate contact.
    */
  var PhoneNumber: typings.awsSdk.clientsAccountMod.PhoneNumber
  
  /**
    * Specifies a title for the alternate contact.
    */
  var Title: typings.awsSdk.clientsAccountMod.Title
}
object PutAlternateContactRequest {
  
  inline def apply(
    AlternateContactType: AlternateContactType,
    EmailAddress: EmailAddress,
    Name: Name,
    PhoneNumber: PhoneNumber,
    Title: Title
  ): PutAlternateContactRequest = {
    val __obj = js.Dynamic.literal(AlternateContactType = AlternateContactType.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAlternateContactRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutAlternateContactRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAlternateContactType(value: AlternateContactType): Self = StObject.set(x, "AlternateContactType", value.asInstanceOf[js.Any])
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Title): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
  }
}
