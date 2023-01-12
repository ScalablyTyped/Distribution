package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUserProfileResponse extends StObject {
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileArn] = js.undefined
}
object CreateUserProfileResponse {
  
  inline def apply(): CreateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUserProfileResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateUserProfileResponse] (val x: Self) extends AnyVal {
    
    inline def setUserProfileArn(value: UserProfileArn): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    inline def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
  }
}
