package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimateChildOptions
  extends StObject
     with AnimationOptions {
  
  var duration: js.UndefOr[Double | String] = js.undefined
}
object AnimateChildOptions {
  
  inline def apply(): AnimateChildOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimateChildOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimateChildOptions] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double | String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
  }
}
