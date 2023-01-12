package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserResponse extends StObject {
  
  /**
    * The user object that has been deleted.
    */
  var User: js.UndefOr[typings.awsSdk.clientsMemorydbMod.User] = js.undefined
}
object DeleteUserResponse {
  
  inline def apply(): DeleteUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteUserResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteUserResponse] (val x: Self) extends AnyVal {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
