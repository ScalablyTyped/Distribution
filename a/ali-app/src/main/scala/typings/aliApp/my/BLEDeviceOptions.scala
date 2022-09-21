package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BLEDeviceOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备id
    */
  var deviceId: String
}
object BLEDeviceOptions {
  
  inline def apply(deviceId: String): BLEDeviceOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLEDeviceOptions]
  }
  
  extension [Self <: BLEDeviceOptions](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
