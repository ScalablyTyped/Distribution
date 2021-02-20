package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillStringOpacityNumber extends StObject {
  
  var fill: String = js.native
  
  var opacity: Double = js.native
}
object FillStringOpacityNumber {
  
  @scala.inline
  def apply(fill: String, opacity: Double): FillStringOpacityNumber = {
    val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FillStringOpacityNumber]
  }
  
  @scala.inline
  implicit class FillStringOpacityNumberMutableBuilder[Self <: FillStringOpacityNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
