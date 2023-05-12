package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalFormattingColor extends StObject {
  
  /**
    * Formatting configuration for gradient color.
    */
  var Gradient: js.UndefOr[ConditionalFormattingGradientColor] = js.undefined
  
  /**
    * Formatting configuration for solid color.
    */
  var Solid: js.UndefOr[ConditionalFormattingSolidColor] = js.undefined
}
object ConditionalFormattingColor {
  
  inline def apply(): ConditionalFormattingColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormattingColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalFormattingColor] (val x: Self) extends AnyVal {
    
    inline def setGradient(value: ConditionalFormattingGradientColor): Self = StObject.set(x, "Gradient", value.asInstanceOf[js.Any])
    
    inline def setGradientUndefined: Self = StObject.set(x, "Gradient", js.undefined)
    
    inline def setSolid(value: ConditionalFormattingSolidColor): Self = StObject.set(x, "Solid", value.asInstanceOf[js.Any])
    
    inline def setSolidUndefined: Self = StObject.set(x, "Solid", js.undefined)
  }
}
