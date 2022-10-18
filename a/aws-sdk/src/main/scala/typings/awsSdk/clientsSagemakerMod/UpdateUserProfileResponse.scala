package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserProfileResponse extends StObject {
  
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.UserProfileArn] = js.undefined
}
object UpdateUserProfileResponse {
  
  inline def apply(): UpdateUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateUserProfileResponse]
  }
  
  extension [Self <: UpdateUserProfileResponse](x: Self) {
    
    inline def setUserProfileArn(value: UserProfileArn): Self = StObject.set(x, "UserProfileArn", value.asInstanceOf[js.Any])
    
    inline def setUserProfileArnUndefined: Self = StObject.set(x, "UserProfileArn", js.undefined)
  }
}
