package typings.asana.mod.resources

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserParams extends StObject {
  
  var user: String | Double
}
object UserParams {
  
  inline def apply(user: String | Double): UserParams = {
    val __obj = js.Dynamic.literal(user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserParams] (val x: Self) extends AnyVal {
    
    inline def setUser(value: String | Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
