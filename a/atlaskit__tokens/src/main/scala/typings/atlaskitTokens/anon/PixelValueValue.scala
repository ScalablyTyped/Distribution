package typings.atlaskitTokens.anon

import typings.atlaskitTokens.atlaskitTokensStrings.`4rem`
import typings.atlaskitTokens.atlaskitTokensStrings.`64px`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelValueValue extends StObject {
  
  val attributes: `7`
  
  val pixelValue: `64px`
  
  val value: `4rem`
}
object PixelValueValue {
  
  inline def apply(attributes: `7`): PixelValueValue = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], pixelValue = "64px", value = "4rem")
    __obj.asInstanceOf[PixelValueValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PixelValueValue] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: `7`): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setPixelValue(value: `64px`): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: `4rem`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
