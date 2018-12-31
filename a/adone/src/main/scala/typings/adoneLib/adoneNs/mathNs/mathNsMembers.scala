package typings
package adoneLib.adoneNs.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.math")
@js.native
object mathNsMembers extends js.Object {
  /**
    * Returns the maximum value from the given array
    *
    * @param array array of values
    * @param score function to calculate the element score value
    */
  def max[T](array: js.Array[T]): T = js.native
  def max[T](array: js.Array[T], score: js.Function1[/* x */ T, _]): T = js.native
  /**
    * Returns the minimum value from the given array
    *
    * @param array array of values
    * @param score function to calculate the element score value
    */
  def min[T](array: js.Array[T]): T = js.native
  def min[T](array: js.Array[T], score: js.Function1[/* x */ T, _]): T = js.native
  /**
    * Returns a random number from min to max - 1
    *
    * @param min lower bound, default is 0
    * @param max upper bound, default is 0xFFFFFFFF
    */
  def random(): scala.Double = js.native
  def random(min: scala.Double): scala.Double = js.native
  def random(min: scala.Double, max: scala.Double): scala.Double = js.native
}

