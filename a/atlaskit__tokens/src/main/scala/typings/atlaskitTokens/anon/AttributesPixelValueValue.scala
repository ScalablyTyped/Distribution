package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`5rem`
import typings.atlaskitTokens.atlaskitTokensStrings.`80px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributesPixelValueValue extends StObject {
  
  val attributes: `7`
  
  val pixelValue: `80px`
  
  val value: `5rem`
}
object AttributesPixelValueValue {
  
  inline def apply(attributes: `7`): AttributesPixelValueValue = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], pixelValue = "80px", value = "5rem")
    __obj.asInstanceOf[AttributesPixelValueValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributesPixelValueValue] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPixelValue(value: `80px`): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `5rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
