package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordPolicy extends StObject {
  
  /**
    * Specifies whether IAM users are allowed to change their own password. Gives IAM users permissions to iam:ChangePassword for only their user and to the iam:GetAccountPasswordPolicy action. This option does not attach a permissions policy to each user, rather the permissions are applied at the account-level for all users by IAM.
    */
  var AllowUsersToChangePassword: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Indicates whether passwords in the account expire. Returns true if MaxPasswordAge contains a value greater than 0. Returns false if MaxPasswordAge is 0 or not present.
    */
  var ExpirePasswords: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM users are prevented from setting a new password via the Amazon Web Services Management Console after their password has expired. The IAM user cannot access the console until an administrator resets the password. IAM users with iam:ChangePassword permission and active access keys can reset their own expired console password using the CLI or API.
    */
  var HardExpiry: js.UndefOr[booleanObjectType] = js.undefined
  
  /**
    * The number of days that an IAM user password is valid.
    */
  var MaxPasswordAge: js.UndefOr[maxPasswordAgeType] = js.undefined
  
  /**
    * Minimum length to require for IAM user passwords.
    */
  var MinimumPasswordLength: js.UndefOr[minimumPasswordLengthType] = js.undefined
  
  /**
    * Specifies the number of previous passwords that IAM users are prevented from reusing.
    */
  var PasswordReusePrevention: js.UndefOr[passwordReusePreventionType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one lowercase character (a to z).
    */
  var RequireLowercaseCharacters: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one numeric character (0 to 9).
    */
  var RequireNumbers: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one of the following symbols: ! @ # $ % ^ &amp; * ( ) _ + - = [ ] { } | '
    */
  var RequireSymbols: js.UndefOr[booleanType] = js.undefined
  
  /**
    * Specifies whether IAM user passwords must contain at least one uppercase character (A to Z).
    */
  var RequireUppercaseCharacters: js.UndefOr[booleanType] = js.undefined
}
object PasswordPolicy {
  
  inline def apply(): PasswordPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicy]
  }
  
  extension [Self <: PasswordPolicy](x: Self) {
    
    inline def setAllowUsersToChangePassword(value: booleanType): Self = StObject.set(x, "AllowUsersToChangePassword", value.asInstanceOf[js.Any])
    
    inline def setAllowUsersToChangePasswordUndefined: Self = StObject.set(x, "AllowUsersToChangePassword", js.undefined)
    
    inline def setExpirePasswords(value: booleanType): Self = StObject.set(x, "ExpirePasswords", value.asInstanceOf[js.Any])
    
    inline def setExpirePasswordsUndefined: Self = StObject.set(x, "ExpirePasswords", js.undefined)
    
    inline def setHardExpiry(value: booleanObjectType): Self = StObject.set(x, "HardExpiry", value.asInstanceOf[js.Any])
    
    inline def setHardExpiryUndefined: Self = StObject.set(x, "HardExpiry", js.undefined)
    
    inline def setMaxPasswordAge(value: maxPasswordAgeType): Self = StObject.set(x, "MaxPasswordAge", value.asInstanceOf[js.Any])
    
    inline def setMaxPasswordAgeUndefined: Self = StObject.set(x, "MaxPasswordAge", js.undefined)
    
    inline def setMinimumPasswordLength(value: minimumPasswordLengthType): Self = StObject.set(x, "MinimumPasswordLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumPasswordLengthUndefined: Self = StObject.set(x, "MinimumPasswordLength", js.undefined)
    
    inline def setPasswordReusePrevention(value: passwordReusePreventionType): Self = StObject.set(x, "PasswordReusePrevention", value.asInstanceOf[js.Any])
    
    inline def setPasswordReusePreventionUndefined: Self = StObject.set(x, "PasswordReusePrevention", js.undefined)
    
    inline def setRequireLowercaseCharacters(value: booleanType): Self = StObject.set(x, "RequireLowercaseCharacters", value.asInstanceOf[js.Any])
    
    inline def setRequireLowercaseCharactersUndefined: Self = StObject.set(x, "RequireLowercaseCharacters", js.undefined)
    
    inline def setRequireNumbers(value: booleanType): Self = StObject.set(x, "RequireNumbers", value.asInstanceOf[js.Any])
    
    inline def setRequireNumbersUndefined: Self = StObject.set(x, "RequireNumbers", js.undefined)
    
    inline def setRequireSymbols(value: booleanType): Self = StObject.set(x, "RequireSymbols", value.asInstanceOf[js.Any])
    
    inline def setRequireSymbolsUndefined: Self = StObject.set(x, "RequireSymbols", js.undefined)
    
    inline def setRequireUppercaseCharacters(value: booleanType): Self = StObject.set(x, "RequireUppercaseCharacters", value.asInstanceOf[js.Any])
    
    inline def setRequireUppercaseCharactersUndefined: Self = StObject.set(x, "RequireUppercaseCharacters", js.undefined)
  }
}
