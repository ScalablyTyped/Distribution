package typings.androiduix.android.text.TextDirectionHeuristics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyStrong extends TextDirectionAlgorithm {
  var mLookForRtl: js.Any = js.native
}

object AnyStrong {
  @scala.inline
  def apply(checkRtl: (String, Double, Double) => Double, mLookForRtl: js.Any): AnyStrong = {
    val __obj = js.Dynamic.literal(checkRtl = js.Any.fromFunction3(checkRtl), mLookForRtl = mLookForRtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyStrong]
  }
  @scala.inline
  implicit class AnyStrongOps[Self <: AnyStrong] (val x: Self) extends AnyVal {
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
    def setMLookForRtl(value: js.Any): Self = this.set("mLookForRtl", value.asInstanceOf[js.Any])
  }
  
}

