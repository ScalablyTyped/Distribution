package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connected extends StObject {
  
  /**
    * 连接目前的状态
    */
  var connected: Boolean
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
}
object Connected {
  
  inline def apply(connected: Boolean, deviceId: String): Connected = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Connected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connected] (val x: Self) extends AnyVal {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
