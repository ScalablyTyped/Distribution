package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.undefined
  
  /**
    * The display name of the user.
    */
  var DisplayName: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
    */
  var InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The license type for the user.
    */
  var LicenseType: js.UndefOr[License] = js.undefined
  
  /**
    * The user's personal meeting PIN.
    */
  var PersonalPIN: js.UndefOr[String] = js.undefined
  
  /**
    * The primary email address of the user.
    */
  var PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The primary phone number associated with the user.
    */
  var PrimaryProvisionedNumber: js.UndefOr[SensitiveString] = js.undefined
  
  /**
    * Date and time when the user is registered, in ISO 8601 format.
    */
  var RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined
  
  /**
    * The user ID.
    */
  var UserId: String
  
  /**
    * The user invite status.
    */
  var UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined
  
  /**
    * The user registration status.
    */
  var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.undefined
}
object User {
  
  inline def apply(UserId: String): User = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = StObject.set(x, "AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAlexaForBusinessMetadataUndefined: Self = StObject.set(x, "AlexaForBusinessMetadata", js.undefined)
    
    inline def setDisplayName(value: SensitiveString): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    inline def setInvitedOn(value: Iso8601Timestamp): Self = StObject.set(x, "InvitedOn", value.asInstanceOf[js.Any])
    
    inline def setInvitedOnUndefined: Self = StObject.set(x, "InvitedOn", js.undefined)
    
    inline def setLicenseType(value: License): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    inline def setPersonalPIN(value: String): Self = StObject.set(x, "PersonalPIN", value.asInstanceOf[js.Any])
    
    inline def setPersonalPINUndefined: Self = StObject.set(x, "PersonalPIN", js.undefined)
    
    inline def setPrimaryEmail(value: EmailAddress): Self = StObject.set(x, "PrimaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "PrimaryEmail", js.undefined)
    
    inline def setPrimaryProvisionedNumber(value: SensitiveString): Self = StObject.set(x, "PrimaryProvisionedNumber", value.asInstanceOf[js.Any])
    
    inline def setPrimaryProvisionedNumberUndefined: Self = StObject.set(x, "PrimaryProvisionedNumber", js.undefined)
    
    inline def setRegisteredOn(value: Iso8601Timestamp): Self = StObject.set(x, "RegisteredOn", value.asInstanceOf[js.Any])
    
    inline def setRegisteredOnUndefined: Self = StObject.set(x, "RegisteredOn", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationStatus(value: InviteStatus): Self = StObject.set(x, "UserInvitationStatus", value.asInstanceOf[js.Any])
    
    inline def setUserInvitationStatusUndefined: Self = StObject.set(x, "UserInvitationStatus", js.undefined)
    
    inline def setUserRegistrationStatus(value: RegistrationStatus): Self = StObject.set(x, "UserRegistrationStatus", value.asInstanceOf[js.Any])
    
    inline def setUserRegistrationStatusUndefined: Self = StObject.set(x, "UserRegistrationStatus", js.undefined)
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
