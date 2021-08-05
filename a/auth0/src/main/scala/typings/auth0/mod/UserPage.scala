package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPage[A, U]
  extends StObject
     with Page {
  
  var users: js.Array[User[A, U]]
}
object UserPage {
  
  inline def apply[A, U](length: Double, limit: Double, start: Double, total: Double, users: js.Array[User[A, U]]): UserPage[A, U] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPage[A, U]]
  }
  
  extension [Self <: UserPage[?, ?], A, U](x: Self & (UserPage[A, U])) {
    
    inline def setUsers(value: js.Array[User[A, U]]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: (User[A, U])*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
