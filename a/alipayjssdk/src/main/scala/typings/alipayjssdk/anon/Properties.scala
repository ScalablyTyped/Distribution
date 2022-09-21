package typings.alipayjssdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Properties extends StObject {
  
  /** 蓝牙设备特征值的 uuid */
  var characteristicId: String
  
  /** 该特征值支持的操作类型 */
  var properties: Indicate
  
  /** 蓝牙设备特征值对应服务的 uuid */
  var serviceId: String
  
  /** 蓝牙设备特征值对应的16进制值 */
  var value: String
}
object Properties {
  
  inline def apply(characteristicId: String, properties: Indicate, serviceId: String, value: String): Properties = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  extension [Self <: Properties](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Indicate): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
