package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillStroke extends StObject {
  
  var fill: String
  
  var stroke: String
}
object FillStroke {
  
  inline def apply(fill: String, stroke: String): FillStroke = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStroke]
  }
  
  extension [Self <: FillStroke](x: Self) {
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
