package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spacing extends StObject {
  
  var spacing: Double
  
  var style: FillFontSize
}
object Spacing {
  
  @scala.inline
  def apply(spacing: Double, style: FillFontSize): Spacing = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spacing]
  }
  
  @scala.inline
  implicit class SpacingMutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: FillFontSize): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
