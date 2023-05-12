package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Credentials extends StObject {
  
  /**
    * Specifies the password for your storage system's management interface.
    */
  var Password: PtolemyPassword
  
  /**
    * Specifies the user name for your storage system's management interface.
    */
  var Username: PtolemyUsername
}
object Credentials {
  
  inline def apply(Password: PtolemyPassword, Username: PtolemyUsername): Credentials = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: PtolemyPassword): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: PtolemyUsername): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
