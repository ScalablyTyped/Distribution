package typings.ariClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceName extends StObject {
  
  var deviceName: String
}
object DeviceName {
  
  inline def apply(deviceName: String): DeviceName = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceName] (val x: Self) extends AnyVal {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
  }
}
