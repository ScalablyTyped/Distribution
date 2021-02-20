package typings.aliApp.anon

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Properties extends StObject {
  
  /**
    * 蓝牙设备特征值的 uuid
    */
  var characteristicId: String = js.native
  
  /**
    * 该特征值支持的操作类型
    */
  var properties: js.Array[Indicate] = js.native
  
  /**
    * 蓝牙设备特征值对应服务的 uuid
    */
  var serviceId: String = js.native
  
  /**
    * 蓝牙设备特征值对应的16进制值
    */
  var value: ArrayBuffer = js.native
}
object Properties {
  
  @scala.inline
  def apply(characteristicId: String, properties: js.Array[Indicate], serviceId: String, value: ArrayBuffer): Properties = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharacteristicId(value: String): Self = StObject.set(x, "characteristicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[Indicate]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: Indicate*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ArrayBuffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
