package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceOwnerLoginOptions
  extends StObject
     with LoginOptions {
  
  var connection: String
  
  var device: js.UndefOr[String] = js.undefined
}
object ResourceOwnerLoginOptions {
  
  inline def apply(connection: String, password: String, username: String): ResourceOwnerLoginOptions = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceOwnerLoginOptions]
  }
  
  extension [Self <: ResourceOwnerLoginOptions](x: Self) {
    
    inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
