package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpacingStyle extends StObject {
  
  var spacing: Double = js.native
  
  var style: R = js.native
}
object SpacingStyle {
  
  @scala.inline
  def apply(spacing: Double, style: R): SpacingStyle = {
    val __obj = js.Dynamic.literal(spacing = spacing.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpacingStyle]
  }
  
  @scala.inline
  implicit class SpacingStyleMutableBuilder[Self <: SpacingStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: R): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
