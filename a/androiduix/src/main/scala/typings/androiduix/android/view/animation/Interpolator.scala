package typings.androiduix.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolator extends js.Object {
  def getInterpolation(input: Double): Double
}

object Interpolator {
  @scala.inline
  def apply(getInterpolation: Double => Double): Interpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
  
    __obj.asInstanceOf[Interpolator]
  }
}

