package typings.aliApp.my

import typings.aliApp.anon.servicesArrayserviceIdstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayserviceIdstr): Unit
}
object GetBLEDeviceServicesOptions {
  
  inline def apply(deviceId: String, success: servicesArrayserviceIdstr => Unit): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
  
  extension [Self <: GetBLEDeviceServicesOptions](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: servicesArrayserviceIdstr => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
