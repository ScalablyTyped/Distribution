package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VeevaConnectorProfileCredentials extends StObject {
  
  /**
    *  The password that corresponds to the user name. 
    */
  var password: Password = js.native
  
  /**
    *  The name of the user. 
    */
  var username: Username = js.native
}
object VeevaConnectorProfileCredentials {
  
  @scala.inline
  def apply(password: Password, username: Username): VeevaConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class VeevaConnectorProfileCredentialsMutableBuilder[Self <: VeevaConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
