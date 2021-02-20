package typings.antvComponent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpacityNumber extends StObject {
  
  var opacity: Double = js.native
}
object OpacityNumber {
  
  @scala.inline
  def apply(opacity: Double): OpacityNumber = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityNumber]
  }
  
  @scala.inline
  implicit class OpacityNumberMutableBuilder[Self <: OpacityNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
