package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserProfileRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The user profile name.
    */
  var UserProfileName: typings.awsSdk.clientsSagemakerMod.UserProfileName
}
object DeleteUserProfileRequest {
  
  inline def apply(DomainId: DomainId, UserProfileName: UserProfileName): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  
  extension [Self <: DeleteUserProfileRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setUserProfileName(value: UserProfileName): Self = StObject.set(x, "UserProfileName", value.asInstanceOf[js.Any])
  }
}
