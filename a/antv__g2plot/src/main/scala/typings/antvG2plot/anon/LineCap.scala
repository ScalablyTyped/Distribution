package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.round
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCap extends StObject {
  
  var lineCap: round
  
  var lineWidth: Double
}
object LineCap {
  
  inline def apply(lineWidth: Double): LineCap = {
    val __obj = js.Dynamic.literal(lineCap = "round", lineWidth = lineWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCap]
  }
  
  extension [Self <: LineCap](x: Self) {
    
    inline def setLineCap(value: round): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
  }
}
