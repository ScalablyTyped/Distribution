package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CharacteristicId extends StObject {
  
  /**
    * 蓝牙设备特征值的 uuid
    */
  var characteristicId: String
  
  /**
    * 蓝牙设备特征值对应服务的 uuid
    */
  var serviceId: String
  
  /**
    * 蓝牙设备特征值对应的二进制值
    */
  var value: js.typedarray.ArrayBuffer
}
object CharacteristicId {
  
  inline def apply(characteristicId: String, serviceId: String, value: js.typedarray.ArrayBuffer): CharacteristicId = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CharacteristicId]
  }
  
  extension [Self <: CharacteristicId](x: Self) {
    
    inline def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
