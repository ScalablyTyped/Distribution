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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleFontSizeNumber] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: FontSizeNumber): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
