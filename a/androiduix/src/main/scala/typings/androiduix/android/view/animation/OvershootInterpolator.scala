package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OvershootInterpolator extends Interpolator {
  
  var mTension: js.Any = js.native
}
object OvershootInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mTension: js.Any): OvershootInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mTension = mTension.asInstanceOf[js.Any])
    __obj.asInstanceOf[OvershootInterpolator]
  }
  
  @scala.inline
  implicit class OvershootInterpolatorMutableBuilder[Self <: OvershootInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMTension(value: js.Any): Self = StObject.set(x, "mTension", value.asInstanceOf[js.Any])
  }
}
