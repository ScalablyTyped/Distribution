package typings
package adoneLib.adoneNs.mathNs.matrixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.math.matrix")
@js.native
object matrixNsMembers extends js.Object {
  var EPSILON: scala.Double = js.native
  /**
    * Tests whether or not the arguments have approximately the same value, within an absolute
    * or relative tolerance of EPSILON (an absolute tolerance is used for values less
    * than or equal to 1.0, and a relative tolerance is used for larger values)
    *
    * @param a - The first number to test.
    * @param b - The second number to test.
    * @returns True if the numbers are approximately equal, false otherwise.
    */
  def equals(a: scala.Double, b: scala.Double): scala.Boolean = js.native
  /**
    * Convert Degree To Radian
    *
    * @param a - Angle in Degrees
    */
  def toRadian(a: scala.Double): scala.Double = js.native
}

