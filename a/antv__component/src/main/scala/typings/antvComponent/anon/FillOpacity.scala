package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillOpacity extends StObject {
  
  var fill: String
  
  var opacity: Double
}
object FillOpacity {
  
  @scala.inline
  def apply(fill: String, opacity: Double): FillOpacity = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillOpacity]
  }
  
  @scala.inline
  implicit class FillOpacityMutableBuilder[Self <: FillOpacity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
