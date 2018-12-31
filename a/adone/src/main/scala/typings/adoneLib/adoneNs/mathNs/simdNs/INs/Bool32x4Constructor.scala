package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bool32x4Constructor extends js.Object {
  /**
    * SIMD.Bool32x4 constructor
    * @param s0 A 32bit bool specifying the value of the lane.
    * @param s1 A 32bit bool specifying the value of the lane.
    * @param s2 A 32bit bool specifying the value of the lane.
    * @param s3 A 32bit bool specifying the value of the lane.
    * @return SIMD.Bool32x4 object
    */
  def apply(): Bool32x4 = js.native
  def apply(s0: scala.Boolean): Bool32x4 = js.native
  def apply(s0: scala.Boolean, s1: scala.Boolean): Bool32x4 = js.native
  def apply(s0: scala.Boolean, s1: scala.Boolean, s2: scala.Boolean): Bool32x4 = js.native
  def apply(s0: scala.Boolean, s1: scala.Boolean, s2: scala.Boolean, s3: scala.Boolean): Bool32x4 = js.native
  /**
    * If all lane values are `true`, return `true`.
    */
  def allTrue(a: Bool32x4): scala.Boolean = js.native
  def and(a: Bool32x4, b: Bool32x4): Bool32x4 = js.native
  /**
    * If any lane values are `true`, return `true`.
    */
  def anyTrue(a: Bool32x4): scala.Boolean = js.native
  /**
    * Returns a new instance if the parameter is a valid SIMD data type and the same as Bool32x4. Throws a TypeError otherwise.
    */
  def check(a: Bool32x4): Bool32x4 = js.native
  /**
    * Returns the value of the given lane.
    * @param simd An instance of a corresponding SIMD type.
    * @param lane An index number for which lane to extract.
    * @return The value of the extracted lane.
    */
  def extractLane(simd: Bool32x4, lane: scala.Double): scala.Boolean = js.native
  def not(a: Bool32x4, b: Bool32x4): Bool32x4 = js.native
  def or(a: Bool32x4, b: Bool32x4): Bool32x4 = js.native
  /**
    * Returns a new instance with the given lane value replaced.
    * @param simd An instance of a corresponding SIMD type.
    * @param value A new value to be used for the lane.
    * @return A new SIMD data type with the given lane value replaced.
    */
  def replaceLane(simd: Bool32x4, lane: scala.Double, value: scala.Boolean): Bool32x4 = js.native
  /**
    * Creates a new SIMD.Bool32x4 data type with all lanes set to a given value.
    */
  def splat(n: scala.Boolean): Bool32x4 = js.native
  def xor(a: Bool32x4, b: Bool32x4): Bool32x4 = js.native
}

