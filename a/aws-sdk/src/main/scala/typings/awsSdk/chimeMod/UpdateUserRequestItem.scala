package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserRequestItem extends StObject {
  
  /**
    * The Alexa for Business metadata.
    */
  var AlexaForBusinessMetadata: js.UndefOr[typings.awsSdk.chimeMod.AlexaForBusinessMetadata] = js.undefined
  
  /**
    * The user license type.
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
object UpdateUserRequestItem {
  
  inline def apply(UserId: NonEmptyString): UpdateUserRequestItem = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserRequestItem]
  }
  
  extension [Self <: UpdateUserRequestItem](x: Self) {
    
    inline def setAlexaForBusinessMetadata(value: AlexaForBusinessMetadata): Self = StObject.set(x, "AlexaForBusinessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAlexaForBusinessMetadataUndefined: Self = StObject.set(x, "AlexaForBusinessMetadata", js.undefined)
    
    inline def setLicenseType(value: License): Self = StObject.set(x, "LicenseType", value.asInstanceOf[js.Any])
    
    inline def setLicenseTypeUndefined: Self = StObject.set(x, "LicenseType", js.undefined)
    
    inline def setUserId(value: NonEmptyString): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserType(value: UserType): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
