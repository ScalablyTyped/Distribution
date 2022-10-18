package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeNameAndValue extends StObject {
  
  /**
    * The attribute name of the typed link.
    */
  var AttributeName: typings.awsSdk.clientsClouddirectoryMod.AttributeName
  
  /**
    * The value for the typed link.
    */
  var Value: TypedAttributeValue
}
object AttributeNameAndValue {
  
  inline def apply(AttributeName: AttributeName, Value: TypedAttributeValue): AttributeNameAndValue = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeNameAndValue]
  }
  
  extension [Self <: AttributeNameAndValue](x: Self) {
    
    inline def setAttributeName(value: AttributeName): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TypedAttributeValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
