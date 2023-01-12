package typings.asana.anon

import typings.asana.mod.resources.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var gid: String
  
  var user: Resource
}
object User {
  
  inline def apply(gid: String, user: Resource): User = {
    val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    inline def setGid(value: String): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setUser(value: Resource): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
