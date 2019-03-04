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
  def apply(getInterpolation: js.Function1[scala.Double, scala.Double]): Interpolator = {
    val __obj = js.Dynamic.literal(getInterpolation = getInterpolation)
  
    __obj.asInstanceOf[Interpolator]
  }
}

