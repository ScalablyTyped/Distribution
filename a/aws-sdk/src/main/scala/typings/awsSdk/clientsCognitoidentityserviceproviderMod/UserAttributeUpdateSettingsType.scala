package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAttributeUpdateSettingsType extends StObject {
  
  /**
    * Requires that your user verifies their email address, phone number, or both before Amazon Cognito updates the value of that attribute. When you update a user attribute that has this option activated, Amazon Cognito sends a verification message to the new phone number or email address. Amazon Cognito doesn’t change the value of the attribute until your user responds to the verification message and confirms the new value. You can verify an updated email address or phone number with a VerifyUserAttribute API request. You can also call the UpdateUserAttributes or AdminUpdateUserAttributes API and set email_verified or phone_number_verified to true. When AttributesRequireVerificationBeforeUpdate is false, your user pool doesn't require that your users verify attribute changes before Amazon Cognito updates them. In a user pool where AttributesRequireVerificationBeforeUpdate is false, API operations that change attribute values can immediately update a user’s email or phone_number attribute.
    */
  var AttributesRequireVerificationBeforeUpdate: js.UndefOr[AttributesRequireVerificationBeforeUpdateType] = js.undefined
}
object UserAttributeUpdateSettingsType {
  
  inline def apply(): UserAttributeUpdateSettingsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAttributeUpdateSettingsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAttributeUpdateSettingsType] (val x: Self) extends AnyVal {
    
    inline def setAttributesRequireVerificationBeforeUpdate(value: AttributesRequireVerificationBeforeUpdateType): Self = StObject.set(x, "AttributesRequireVerificationBeforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setAttributesRequireVerificationBeforeUpdateUndefined: Self = StObject.set(x, "AttributesRequireVerificationBeforeUpdate", js.undefined)
    
    inline def setAttributesRequireVerificationBeforeUpdateVarargs(value: VerifiedAttributeType*): Self = StObject.set(x, "AttributesRequireVerificationBeforeUpdate", js.Array(value*))
  }
}
