package typings.aliApp.my

import typings.aliApp.anon.servicesArrayserviceIdstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceServicesOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String = js.native
  
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  @JSName("success")
  def success_MGetBLEDeviceServicesOptions(res: servicesArrayserviceIdstr): Unit = js.native
}
object GetBLEDeviceServicesOptions {
  
  @scala.inline
  def apply(deviceId: String, success: servicesArrayserviceIdstr => Unit): GetBLEDeviceServicesOptions = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceServicesOptions]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesOptionsMutableBuilder[Self <: GetBLEDeviceServicesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: servicesArrayserviceIdstr => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
