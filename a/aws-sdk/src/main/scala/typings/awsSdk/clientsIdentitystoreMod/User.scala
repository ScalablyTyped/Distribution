package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * A list of Address objects containing addresses associated with the user.
    */
  var Addresses: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.Addresses] = js.undefined
  
  /**
    * A string containing the name of the user that is formatted for display when the user is referenced. For example, "John Doe."
    */
  var DisplayName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A list of Email objects containing email addresses associated with the user.
    */
  var Emails: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.Emails] = js.undefined
  
  /**
    * A list of ExternalId objects that contains the identifiers issued to this resource by an external identity provider.
    */
  var ExternalIds: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.ExternalIds] = js.undefined
  
  /**
    * The globally unique identifier for the identity store.
    */
  var IdentityStoreId: typings.awsSdk.clientsIdentitystoreMod.IdentityStoreId
  
  /**
    * A string containing the geographical region or location of the user.
    */
  var Locale: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * An object containing the name of the user.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.Name] = js.undefined
  
  /**
    * A string containing an alternate name for the user.
    */
  var NickName: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A list of PhoneNumber objects containing phone numbers associated with the user.
    */
  var PhoneNumbers: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.PhoneNumbers] = js.undefined
  
  /**
    * A string containing the preferred language of the user. For example, "American English" or "en-us."
    */
  var PreferredLanguage: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing a URL that might be associated with the user.
    */
  var ProfileUrl: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the time zone of the user.
    */
  var Timezone: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing the title of the user. Possible values are left unspecified. The value can vary based on your specific use case.
    */
  var Title: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The identifier for a user in the identity store.
    */
  var UserId: ResourceId
  
  /**
    * A unique string used to identify the user. The length limit is 128 characters. This value can consist of letters, accented characters, symbols, numbers, and punctuation. This value is specified at the time the user is created and stored as an attribute of the user object in the identity store.
    */
  var UserName: js.UndefOr[typings.awsSdk.clientsIdentitystoreMod.UserName] = js.undefined
  
  /**
    * A string indicating the type of user. Possible values are left unspecified. The value can vary based on your specific use case.
    */
  var UserType: js.UndefOr[SensitiveStringType] = js.undefined
}
object User {
  
  inline def apply(IdentityStoreId: IdentityStoreId, UserId: ResourceId): User = {
    val __obj = js.Dynamic.literal(IdentityStoreId = IdentityStoreId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setAddresses(value: Addresses): Self = StObject.set(x, "Addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "Addresses", js.undefined)
    
    inline def setAddressesVarargs(value: Address*): Self = StObject.set(x, "Addresses", js.Array(value*))
    
    inline def setDisplayName(value: SensitiveStringType): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setEmails(value: Emails): Self = StObject.set(x, "Emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "Emails", js.undefined)
    
    inline def setEmailsVarargs(value: Email*): Self = StObject.set(x, "Emails", js.Array(value*))
    
    inline def setExternalIds(value: ExternalIds): Self = StObject.set(x, "ExternalIds", value.asInstanceOf[js.Any])
    
    inline def setExternalIdsUndefined: Self = StObject.set(x, "ExternalIds", js.undefined)
    
    inline def setExternalIdsVarargs(value: ExternalId*): Self = StObject.set(x, "ExternalIds", js.Array(value*))
    
    inline def setIdentityStoreId(value: IdentityStoreId): Self = StObject.set(x, "IdentityStoreId", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: SensitiveStringType): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setNickName(value: SensitiveStringType): Self = StObject.set(x, "NickName", value.asInstanceOf[js.Any])
    
    inline def setNickNameUndefined: Self = StObject.set(x, "NickName", js.undefined)
    
    inline def setPhoneNumbers(value: PhoneNumbers): Self = StObject.set(x, "PhoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "PhoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: PhoneNumber*): Self = StObject.set(x, "PhoneNumbers", js.Array(value*))
    
    inline def setPreferredLanguage(value: SensitiveStringType): Self = StObject.set(x, "PreferredLanguage", value.asInstanceOf[js.Any])
    
    inline def setPreferredLanguageUndefined: Self = StObject.set(x, "PreferredLanguage", js.undefined)
    
    inline def setProfileUrl(value: SensitiveStringType): Self = StObject.set(x, "ProfileUrl", value.asInstanceOf[js.Any])
    
    inline def setProfileUrlUndefined: Self = StObject.set(x, "ProfileUrl", js.undefined)
    
    inline def setTimezone(value: SensitiveStringType): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setTitle(value: SensitiveStringType): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setUserId(value: ResourceId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserType(value: SensitiveStringType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
