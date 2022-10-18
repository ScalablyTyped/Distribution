package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordPolicyType extends StObject {
  
  /**
    * The minimum length of the password in the policy that you have set. This value can't be less than 6.
    */
  var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
    */
  var RequireLowercase: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
    */
  var RequireNumbers: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
    */
  var RequireSymbols: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
    */
  var RequireUppercase: js.UndefOr[BooleanType] = js.undefined
  
  /**
    * The number of days a temporary password is valid in the password policy. If the user doesn't sign in during this time, an administrator must reset their password.  When you set TemporaryPasswordValidityDays for a user pool, you can no longer set a value for the legacy UnusedAccountValidityDays parameter in that user pool. 
    */
  var TemporaryPasswordValidityDays: js.UndefOr[TemporaryPasswordValidityDaysType] = js.undefined
}
object PasswordPolicyType {
  
  inline def apply(): PasswordPolicyType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordPolicyType]
  }
  
  extension [Self <: PasswordPolicyType](x: Self) {
    
    inline def setMinimumLength(value: PasswordPolicyMinLengthType): Self = StObject.set(x, "MinimumLength", value.asInstanceOf[js.Any])
    
    inline def setMinimumLengthUndefined: Self = StObject.set(x, "MinimumLength", js.undefined)
    
    inline def setRequireLowercase(value: BooleanType): Self = StObject.set(x, "RequireLowercase", value.asInstanceOf[js.Any])
    
    inline def setRequireLowercaseUndefined: Self = StObject.set(x, "RequireLowercase", js.undefined)
    
    inline def setRequireNumbers(value: BooleanType): Self = StObject.set(x, "RequireNumbers", value.asInstanceOf[js.Any])
    
    inline def setRequireNumbersUndefined: Self = StObject.set(x, "RequireNumbers", js.undefined)
    
    inline def setRequireSymbols(value: BooleanType): Self = StObject.set(x, "RequireSymbols", value.asInstanceOf[js.Any])
    
    inline def setRequireSymbolsUndefined: Self = StObject.set(x, "RequireSymbols", js.undefined)
    
    inline def setRequireUppercase(value: BooleanType): Self = StObject.set(x, "RequireUppercase", value.asInstanceOf[js.Any])
    
    inline def setRequireUppercaseUndefined: Self = StObject.set(x, "RequireUppercase", js.undefined)
    
    inline def setTemporaryPasswordValidityDays(value: TemporaryPasswordValidityDaysType): Self = StObject.set(x, "TemporaryPasswordValidityDays", value.asInstanceOf[js.Any])
    
    inline def setTemporaryPasswordValidityDaysUndefined: Self = StObject.set(x, "TemporaryPasswordValidityDays", js.undefined)
  }
}
