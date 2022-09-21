package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDash extends StObject {
  
  var lineDash: js.Array[Double]
  
  var lineWidth: Double
  
  var stroke: String
}
object LineDash {
  
  inline def apply(lineDash: js.Array[Double], lineWidth: Double, stroke: String): LineDash = {
    val __obj = js.Dynamic.literal(lineDash = lineDash.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDash]
  }
  
  extension [Self <: LineDash](x: Self) {
    
    inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
