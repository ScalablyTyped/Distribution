package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MqttContext extends StObject {
  
  /**
    * The value of the clientId key in an MQTT authorization request.
    */
  var clientId: js.UndefOr[MqttClientId] = js.undefined
  
  /**
    * The value of the password key in an MQTT authorization request.
    */
  var password: js.UndefOr[MqttPassword] = js.undefined
  
  /**
    * The value of the username key in an MQTT authorization request.
    */
  var username: js.UndefOr[MqttUsername] = js.undefined
}
object MqttContext {
  
  inline def apply(): MqttContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttContext]
  }
  
  extension [Self <: MqttContext](x: Self) {
    
    inline def setClientId(value: MqttClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setPassword(value: MqttPassword): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: MqttUsername): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
