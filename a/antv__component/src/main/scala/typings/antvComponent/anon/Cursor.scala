package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursor extends StObject {
  
  var cursor: String = js.native
  
  var fill: String = js.native
  
  var highLightFill: String = js.native
  
  var opacity: Double = js.native
  
  var radius: Double = js.native
  
  var stroke: String = js.native
}
object Cursor {
  
  @scala.inline
  def apply(
    cursor: String,
    fill: String,
    highLightFill: String,
    opacity: Double,
    radius: Double,
    stroke: String
  ): Cursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], highLightFill = highLightFill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cursor]
  }
  
  @scala.inline
  implicit class CursorMutableBuilder[Self <: Cursor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighLightFill(value: String): Self = StObject.set(x, "highLightFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
  }
}
