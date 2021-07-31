package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Username extends StObject {
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Username {
  
  @scala.inline
  def apply(): Username = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Username]
  }
  
  @scala.inline
  implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
