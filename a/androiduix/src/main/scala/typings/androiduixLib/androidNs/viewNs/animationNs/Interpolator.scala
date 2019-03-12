package typings
package androiduixLib.androidNs.viewNs.animationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Interpolator extends js.Object {
  def getInterpolation(input: scala.Double): scala.Double
}

object Interpolator {
  @scala.inline
  def apply(getInterpolation: scala.Double => scala.Double): Interpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = js.Any.fromFunction1(getInterpolation))
  
    __obj.asInstanceOf[Interpolator]
  }
}

