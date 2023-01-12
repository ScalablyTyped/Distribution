package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFontSize extends StObject {
  
  var style: FontSize
}
object StyleFontSize {
  
  inline def apply(style: FontSize): StyleFontSize = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleFontSize] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: FontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
