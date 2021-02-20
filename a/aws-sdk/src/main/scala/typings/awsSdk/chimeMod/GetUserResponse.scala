package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUserResponse extends StObject {
  
  /**
    * The user details.
    */
  var User: js.UndefOr[typings.awsSdk.chimeMod.User] = js.native
}
object GetUserResponse {
  
  @scala.inline
  def apply(): GetUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserResponse]
  }
  
  @scala.inline
  implicit class GetUserResponseMutableBuilder[Self <: GetUserResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
