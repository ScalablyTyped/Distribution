package typings.androiduix.android.view.animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnticipateInterpolator extends Interpolator {
  
  var mTension: js.Any = js.native
}
object AnticipateInterpolator {
  
  @scala.inline
  def apply(getInterpolation: Double => Double, mTension: js.Any): AnticipateInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation), mTension = mTension.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnticipateInterpolator]
  }
  
  @scala.inline
  implicit class AnticipateInterpolatorMutableBuilder[Self <: AnticipateInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMTension(value: js.Any): Self = StObject.set(x, "mTension", value.asInstanceOf[js.Any])
  }
}
