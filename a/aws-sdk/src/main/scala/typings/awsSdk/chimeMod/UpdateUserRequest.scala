package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.undefined
  
  /**
    * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
    */
  var LicenseType: js.UndefOr[License] = js.undefined
  
  /**
    * The user ID.
    */
  var UserId: NonEmptyString
  
  /**
    * The user type.
    */
  var UserType: js.UndefOr[typings.awsSdk.chimeMod.UserType] = js.undefined
}
object UpdateUserRequest {
  
  @scala.inline
  def apply(AccountId: NonEmptyString, UserId: NonEmptyString): UpdateUserRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequest]
  }
  
  @scala.inline
  implicit class UpdateUserRequestMutableBuilder[Self <: UpdateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = StObject.set(x, "AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlexaForBusinessMetadataUndefined: Self = StObject.set(x, "AlexaForBusinessMetadata", js.undefined)
    
    @scala.inline
    def setLicenseType(value: License): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    @scala.inline
    def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
