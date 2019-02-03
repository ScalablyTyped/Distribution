package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.MathUtils")
@js.native
class MathUtils () extends js.Object

/* static members */
@JSGlobal("android.util.MathUtils")
@js.native
object MathUtils extends js.Object {
  var DEG_TO_RAD: js.Any = js.native
  var RAD_TO_DEG: js.Any = js.native
  def abs(v: scala.Double): scala.Double = js.native
  def acos(value: scala.Double): scala.Double = js.native
  def asin(value: scala.Double): scala.Double = js.native
  def atan(value: scala.Double): scala.Double = js.native
  def atan2(a: scala.Double, b: scala.Double): scala.Double = js.native
  def constrain(amount: scala.Double, low: scala.Double, high: scala.Double): scala.Double = js.native
  def degrees(radians: scala.Double): scala.Double = js.native
  def dist(x1: scala.Double, y1: scala.Double, x2: scala.Double, y2: scala.Double): scala.Double = js.native
  def dist3(
    x1: scala.Double,
    y1: scala.Double,
    z1: scala.Double,
    x2: scala.Double,
    y2: scala.Double,
    z2: scala.Double
  ): scala.Double = js.native
  def exp(a: scala.Double): scala.Double = js.native
  def lerp(start: scala.Double, stop: scala.Double, amount: scala.Double): scala.Double = js.native
  def log(a: scala.Double): scala.Double = js.native
  def mag(a: scala.Double, b: scala.Double): scala.Double = js.native
  def mag(a: scala.Double, b: scala.Double, c: scala.Double): scala.Double = js.native
  def map(
    minStart: scala.Double,
    minStop: scala.Double,
    maxStart: scala.Double,
    maxStop: scala.Double,
    value: scala.Double
  ): scala.Double = js.native
  def max(a: scala.Double, b: scala.Double): scala.Double = js.native
  def max(a: scala.Double, b: scala.Double, c: scala.Double): scala.Double = js.native
  def min(a: scala.Double, b: scala.Double): scala.Double = js.native
  def min(a: scala.Double, b: scala.Double, c: scala.Double): scala.Double = js.native
  def norm(start: scala.Double, stop: scala.Double, value: scala.Double): scala.Double = js.native
  def pow(a: scala.Double, b: scala.Double): scala.Double = js.native
  def radians(degrees: scala.Double): scala.Double = js.native
  def random(howbig: scala.Double): scala.Double = js.native
  def random(howsmall: scala.Double, howbig: scala.Double): scala.Double = js.native
  def sq(v: scala.Double): scala.Double = js.native
  def tan(angle: scala.Double): scala.Double = js.native
}

