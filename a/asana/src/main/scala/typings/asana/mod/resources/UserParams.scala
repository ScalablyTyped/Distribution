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
  
  extension [Self <: UserParams](x: Self) {
    
    inline def setUser(value: String | Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
