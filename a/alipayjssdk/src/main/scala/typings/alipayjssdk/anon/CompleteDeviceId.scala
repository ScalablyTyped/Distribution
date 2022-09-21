package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteDeviceId extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 蓝牙设备 id，参考 device 对象 */
  var deviceId: String
  
  /** 蓝牙特征值对应 service 的 uuid */
  var serviceId: String
}
object CompleteDeviceId {
  
  inline def apply(deviceId: String, serviceId: String): CompleteDeviceId = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteDeviceId]
  }
  
  extension [Self <: CompleteDeviceId](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
  }
}
