package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteBLECharacteristicValueOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  
  /**
    * 蓝牙设备特征值对应的值，16进制字符串，限制在20字节内
    */
  var value: String
}
object WriteBLECharacteristicValueOptions {
  
  @scala.inline
  def apply(characteristicId: String, deviceId: String, serviceId: String, value: String): WriteBLECharacteristicValueOptions = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteBLECharacteristicValueOptions]
  }
  
  @scala.inline
  implicit class WriteBLECharacteristicValueOptionsMutableBuilder[Self <: WriteBLECharacteristicValueOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
