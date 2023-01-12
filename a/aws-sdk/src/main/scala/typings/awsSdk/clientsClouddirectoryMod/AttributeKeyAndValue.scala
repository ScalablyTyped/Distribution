package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeKeyAndValue extends StObject {
  
  /**
    * The key of the attribute.
    */
  var Key: AttributeKey
  
  /**
    * The value of the attribute.
    */
  var Value: TypedAttributeValue
}
object AttributeKeyAndValue {
  
  inline def apply(Key: AttributeKey, Value: TypedAttributeValue): AttributeKeyAndValue = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeKeyAndValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeKeyAndValue] (val x: Self) extends AnyVal {
    
    inline def setKey(value: AttributeKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TypedAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
