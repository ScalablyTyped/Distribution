package typings.auth0Lock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// additional options for passwordless mode
trait Auth0LockPasswordlessConstructorOptions
  extends StObject
     with Auth0LockConstructorOptions {
  
  var passwordlessMethod: js.UndefOr[String] = js.undefined
}
object Auth0LockPasswordlessConstructorOptions {
  
  inline def apply(): Auth0LockPasswordlessConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Auth0LockPasswordlessConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Auth0LockPasswordlessConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setPasswordlessMethod(value: String): Self = StObject.set(x, "passwordlessMethod", value.asInstanceOf[js.Any])
    
    inline def setPasswordlessMethodUndefined: Self = StObject.set(x, "passwordlessMethod", js.undefined)
  }
}
