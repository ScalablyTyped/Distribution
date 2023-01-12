package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacteristicId extends StObject {
  
  /** 蓝牙特征值的 uuid */
  var characteristicId: String
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** notify 的 descriptor 的 uuid */
  var descriptorId: js.UndefOr[String] = js.undefined
  
  /** 蓝牙设备 id，参考 device 对象 */
  var deviceId: String
  
  /** 蓝牙特征值对应 service 的 uuid */
  var serviceId: String
  
  /** 蓝牙设备特征值对应的值，16进制字符串,限制在20字节内。写入的二进制数据需要进行 hex 编码。 */
  var value: String
}
object CharacteristicId {
  
  inline def apply(characteristicId: String, deviceId: String, serviceId: String, value: String): CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CharacteristicId] (val x: Self) extends AnyVal {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setDescriptorId(value: String): Self = StObject.set(x, "descriptorId", value.asInstanceOf[js.Any])
    
    inline def setDescriptorIdUndefined: Self = StObject.set(x, "descriptorId", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
