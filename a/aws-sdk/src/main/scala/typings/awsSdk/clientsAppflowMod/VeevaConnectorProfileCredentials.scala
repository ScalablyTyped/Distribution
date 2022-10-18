package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VeevaConnectorProfileCredentials extends StObject {
  
  /**
    *  The password that corresponds to the user name. 
    */
  var password: Password
  
  /**
    *  The name of the user. 
    */
  var username: Username
}
object VeevaConnectorProfileCredentials {
  
  inline def apply(password: Password, username: Username): VeevaConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[VeevaConnectorProfileCredentials]
  }
  
  extension [Self <: VeevaConnectorProfileCredentials](x: Self) {
    
    inline def setPassword(value: Password): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: Username): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
