package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccelerateInterpolator extends Interpolator {
  
  var mDoubleFactor: js.Any = js.native
  
  var mFactor: js.Any = js.native
}
object AccelerateInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mDoubleFactor: js.Any, mFactor: js.Any): AccelerateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mDoubleFactor = mDoubleFactor.asInstanceOf[js.Any], mFactor = mFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerateInterpolator]
  }
  
  @scala.inline
  implicit class AccelerateInterpolatorMutableBuilder[Self <: AccelerateInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMDoubleFactor(value: js.Any): Self = StObject.set(x, "mDoubleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFactor(value: js.Any): Self = StObject.set(x, "mFactor", value.asInstanceOf[js.Any])
  }
}
