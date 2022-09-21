package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleFontWeight extends StObject {
  
  var style: FontWeight
}
object StyleFontWeight {
  
  inline def apply(style: FontWeight): StyleFontWeight = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleFontWeight]
  }
  
  extension [Self <: StyleFontWeight](x: Self) {
    
    inline def setStyle(value: FontWeight): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
