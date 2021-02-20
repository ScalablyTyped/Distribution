package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DecelerateInterpolator extends Interpolator {
  
  var mFactor: js.Any = js.native
}
object DecelerateInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mFactor: js.Any): DecelerateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mFactor = mFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecelerateInterpolator]
  }
  
  @scala.inline
  implicit class DecelerateInterpolatorMutableBuilder[Self <: DecelerateInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMFactor(value: js.Any): Self = StObject.set(x, "mFactor", value.asInstanceOf[js.Any])
  }
}
