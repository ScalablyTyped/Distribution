package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateChildOptions extends AnimationOptions {
  
  var duration: js.UndefOr[Double | String] = js.native
}
object AnimateChildOptions {
  
  @scala.inline
  def apply(): AnimateChildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateChildOptions]
  }
  
  @scala.inline
  implicit class AnimateChildOptionsMutableBuilder[Self <: AnimateChildOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
