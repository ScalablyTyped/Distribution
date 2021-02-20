package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Length extends StObject {
  
  var display: Boolean = js.native
  
  var length: Double = js.native
  
  var style: LineWidth = js.native
}
object Length {
  
  @scala.inline
  def apply(display: Boolean, length: Double, style: LineWidth): Length = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
  
  @scala.inline
  implicit class LengthMutableBuilder[Self <: Length] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplay(value: Boolean): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: LineWidth): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
