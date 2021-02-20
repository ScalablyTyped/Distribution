package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnticipateOvershootInterpolator extends Interpolator {
  
  var mTension: js.Any = js.native
}
object AnticipateOvershootInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mTension: js.Any): AnticipateOvershootInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mTension = mTension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnticipateOvershootInterpolator]
  }
  
  @scala.inline
  implicit class AnticipateOvershootInterpolatorMutableBuilder[Self <: AnticipateOvershootInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMTension(value: js.Any): Self = StObject.set(x, "mTension", value.asInstanceOf[js.Any])
  }
}
