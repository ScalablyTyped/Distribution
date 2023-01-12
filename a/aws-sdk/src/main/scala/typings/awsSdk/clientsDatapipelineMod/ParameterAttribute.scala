package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterAttribute extends StObject {
  
  /**
    * The field identifier.
    */
  var key: attributeNameString
  
  /**
    * The field value, expressed as a String.
    */
  var stringValue: attributeValueString
}
object ParameterAttribute {
  
  inline def apply(key: attributeNameString, stringValue: attributeValueString): ParameterAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterAttribute] (val x: Self) extends AnyVal {
    
    inline def setKey(value: attributeNameString): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setStringValue(value: attributeValueString): Self = StObject.set(x, "stringValue", value.asInstanceOf[js.Any])
  }
}
