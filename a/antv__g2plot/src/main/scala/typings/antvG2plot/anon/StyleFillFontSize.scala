package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFillFontSize extends StObject {
  
  var style: FillFontSize
}
object StyleFillFontSize {
  
  inline def apply(style: FillFontSize): StyleFillFontSize = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFillFontSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StyleFillFontSize] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: FillFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
