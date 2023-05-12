package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelValue extends StObject {
  
  var attributes: Group
  
  var pixelValue: Unit
  
  var value: String
}
object PixelValue {
  
  inline def apply(attributes: Group, pixelValue: Unit, value: String): PixelValue = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], pixelValue = pixelValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PixelValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelValue] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Group): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPixelValue(value: Unit): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
