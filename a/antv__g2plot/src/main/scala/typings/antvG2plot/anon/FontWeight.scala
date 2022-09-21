package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.center
import typings.antvG2plot.antvG2plotStrings.middle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontWeight extends StObject {
  
  var fill: String
  
  var fontSize: String
  
  var fontWeight: Double
  
  var textAlign: center
  
  var textBaseline: middle
}
object FontWeight {
  
  inline def apply(fill: String, fontSize: String, fontWeight: Double): FontWeight = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], textAlign = "center", textBaseline = "middle")
    __obj.asInstanceOf[FontWeight]
  }
  
  extension [Self <: FontWeight](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: center): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: middle): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
