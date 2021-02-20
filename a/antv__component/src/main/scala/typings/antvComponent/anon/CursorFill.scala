package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CursorFill extends StObject {
  
  var cursor: String = js.native
  
  var fill: String = js.native
  
  var opacity: Double = js.native
}
object CursorFill {
  
  @scala.inline
  def apply(cursor: String, fill: String, opacity: Double): CursorFill = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorFill]
  }
  
  @scala.inline
  implicit class CursorFillMutableBuilder[Self <: CursorFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
