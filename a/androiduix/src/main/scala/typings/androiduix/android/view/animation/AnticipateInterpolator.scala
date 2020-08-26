package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class AnticipateInterpolatorOps[Self <: AnticipateInterpolator] (val x: Self) extends AnyVal {
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
    def setMTension(value: js.Any): Self = this.set("mTension", value.asInstanceOf[js.Any])
  }
  
}

