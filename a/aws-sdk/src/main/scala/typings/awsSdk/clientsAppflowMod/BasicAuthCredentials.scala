package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicAuthCredentials extends StObject {
  
  /**
    *  The password to use to connect to a resource.
    */
  var password: Password
  
  /**
    *  The username to use to connect to a resource. 
    */
  var username: Username
}
object BasicAuthCredentials {
  
  inline def apply(password: Password, username: Username): BasicAuthCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasicAuthCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BasicAuthCredentials] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
