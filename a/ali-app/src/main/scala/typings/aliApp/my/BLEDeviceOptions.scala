package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BLEDeviceOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙设备id
    */
  var deviceId: String = js.native
}
object BLEDeviceOptions {
  
  @scala.inline
  def apply(deviceId: String): BLEDeviceOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLEDeviceOptions]
  }
  
  @scala.inline
  implicit class BLEDeviceOptionsMutableBuilder[Self <: BLEDeviceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
  }
}
