package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalResultAttribute extends StObject {
  
  /**
    * The key that identifies the attribute.
    */
  var Key: String
  
  /**
    * An object that contains the attribute value.
    */
  var Value: AdditionalResultAttributeValue
  
  /**
    * The data type of the Value property.
    */
  var ValueType: AdditionalResultAttributeValueType
}
object AdditionalResultAttribute {
  
  inline def apply(Key: String, Value: AdditionalResultAttributeValue, ValueType: AdditionalResultAttributeValueType): AdditionalResultAttribute = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalResultAttribute]
  }
  
  extension [Self <: AdditionalResultAttribute](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: AdditionalResultAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: AdditionalResultAttributeValueType): Self = StObject.set(x, "ValueType", value.asInstanceOf[js.Any])
  }
}
