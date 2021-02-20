package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Padding extends StObject {
  
  var padding: Double = js.native
  
  var style: StrokeString = js.native
}
object Padding {
  
  @scala.inline
  def apply(padding: Double, style: StrokeString): Padding = {
    val __obj = js.Dynamic.literal(padding = padding.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Padding]
  }
  
  @scala.inline
  implicit class PaddingMutableBuilder[Self <: Padding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: StrokeString): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
