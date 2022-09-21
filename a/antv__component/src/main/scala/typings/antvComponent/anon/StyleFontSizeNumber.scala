package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFontSizeNumber extends StObject {
  
  var style: FontSizeNumber
}
object StyleFontSizeNumber {
  
  inline def apply(style: FontSizeNumber): StyleFontSizeNumber = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFontSizeNumber]
  }
  
  extension [Self <: StyleFontSizeNumber](x: Self) {
    
    inline def setStyle(value: FontSizeNumber): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
