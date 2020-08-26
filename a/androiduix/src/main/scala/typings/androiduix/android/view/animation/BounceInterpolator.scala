package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BounceInterpolator extends Interpolator

object BounceInterpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double): BounceInterpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
    __obj.asInstanceOf[BounceInterpolator]
  }
}

