package typings.androiduix.android.view.animation

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
  implicit class AccelerateInterpolatorOps[Self <: AccelerateInterpolator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMDoubleFactor(value: js.Any): Self = this.set("mDoubleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFactor(value: js.Any): Self = this.set("mFactor", value.asInstanceOf[js.Any])
  }
}
