package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinearInterpolator extends Interpolator

object LinearInterpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double): LinearInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
    __obj.asInstanceOf[LinearInterpolator]
  }
}

