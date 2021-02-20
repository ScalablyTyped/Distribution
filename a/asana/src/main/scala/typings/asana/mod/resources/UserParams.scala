package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserParams extends StObject {
  
  var user: String | Double = js.native
}
object UserParams {
  
  @scala.inline
  def apply(user: String | Double): UserParams = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
  
  @scala.inline
  implicit class UserParamsMutableBuilder[Self <: UserParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: String | Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
