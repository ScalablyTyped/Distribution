package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesPixelValue extends StObject {
  
  var attributes: Group
  
  var pixelValue: String
  
  var value: String
}
object AttributesPixelValue {
  
  inline def apply(attributes: Group, pixelValue: String, value: String): AttributesPixelValue = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], pixelValue = pixelValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesPixelValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesPixelValue] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Group): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPixelValue(value: String): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
