package typings.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserProfileResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user deleted from AWS CodeStar.
    */
  var userArn: UserArn
}
object DeleteUserProfileResult {
  
  inline def apply(userArn: UserArn): DeleteUserProfileResult = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserProfileResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserProfileResult] (val x: Self) extends AnyVal {
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
