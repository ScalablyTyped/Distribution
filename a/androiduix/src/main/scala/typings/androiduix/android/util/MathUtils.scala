package typings.androiduix.android.util

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
  def abs(v: Double): Double = js.native
  def acos(value: Double): Double = js.native
  def asin(value: Double): Double = js.native
  def atan(value: Double): Double = js.native
  def atan2(a: Double, b: Double): Double = js.native
  def constrain(amount: Double, low: Double, high: Double): Double = js.native
  def degrees(radians: Double): Double = js.native
  def dist(x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
  def dist3(x1: Double, y1: Double, z1: Double, x2: Double, y2: Double, z2: Double): Double = js.native
  def exp(a: Double): Double = js.native
  def lerp(start: Double, stop: Double, amount: Double): Double = js.native
  def log(a: Double): Double = js.native
  def mag(a: Double, b: Double): Double = js.native
  def mag(a: Double, b: Double, c: Double): Double = js.native
  def map(minStart: Double, minStop: Double, maxStart: Double, maxStop: Double, value: Double): Double = js.native
  def max(a: Double, b: Double): Double = js.native
  def max(a: Double, b: Double, c: Double): Double = js.native
  def min(a: Double, b: Double): Double = js.native
  def min(a: Double, b: Double, c: Double): Double = js.native
  def norm(start: Double, stop: Double, value: Double): Double = js.native
  def pow(a: Double, b: Double): Double = js.native
  def radians(degrees: Double): Double = js.native
  def random(howbig: Double): Double = js.native
  def random(howsmall: Double, howbig: Double): Double = js.native
  def sq(v: Double): Double = js.native
  def tan(angle: Double): Double = js.native
}

