package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillStroke extends StObject {
  
  var fill: String
  
  var stroke: String
}
object FillStroke {
  
  @scala.inline
  def apply(fill: String, stroke: String): FillStroke = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStroke]
  }
  
  @scala.inline
  implicit class FillStrokeMutableBuilder[Self <: FillStroke] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
