package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
    */
  var userArn: UserArn
}
object DeleteUserProfileRequest {
  
  inline def apply(userArn: UserArn): DeleteUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
