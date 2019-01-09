package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayBigNumber extends js.Object {
  /**
    * Represents a number of arbitrary precision
    */
  var BigNumber: Anon_Bits = js.native
  /**
    * Represents a set of bits
    */
  var BitSet: Anon_FromLong = js.native
  /**
    * An arbitrary precision decimal number
    */
  var Decimal: Anon_0 = js.native
  val INs: Anon_BigNumber = js.native
  /**
    * Represents a 64 bit two's-complement integer
    */
  var Long: Anon_FromBits = js.native
  /**
    * vector and matrix operations
    */
  val matrixNs: Anon_AB = js.native
  /**
    * ES7 (proposed) SIMD numeric type polyfill
    */
  val simdNs: Anon_Bool16x8 = js.native
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

