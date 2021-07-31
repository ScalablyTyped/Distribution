package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignTick extends StObject {
  
  var alignTick: Boolean
  
  var displayWithLabel: Boolean
  
  var length: Double
  
  var style: Stroke
}
object AlignTick {
  
  @scala.inline
  def apply(alignTick: Boolean, displayWithLabel: Boolean, length: Double, style: Stroke): AlignTick = {
    val __obj = js.Dynamic.literal(alignTick = alignTick.asInstanceOf[js.Any], displayWithLabel = displayWithLabel.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignTick]
  }
  
  @scala.inline
  implicit class AlignTickMutableBuilder[Self <: AlignTick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignTick(value: Boolean): Self = StObject.set(x, "alignTick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayWithLabel(value: Boolean): Self = StObject.set(x, "displayWithLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: Stroke): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
