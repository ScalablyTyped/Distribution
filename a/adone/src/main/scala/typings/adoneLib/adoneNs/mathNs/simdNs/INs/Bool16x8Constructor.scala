package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bool16x8Constructor extends js.Object {
  /**
                   * SIMD.Bool16x8 constructor
                   * @param s0 A 16bit bool specifying the value of the lane.
                   * @param s1 A 16bit bool specifying the value of the lane.
                   * @param s2 A 16bit bool specifying the value of the lane.
                   * @param s3 A 16bit bool specifying the value of the lane.
                   * @param s4 A 16bit bool specifying the value of the lane.
                   * @param s5 A 16bit bool specifying the value of the lane.
                   * @param s6 A 16bit bool specifying the value of the lane.
                   * @param s7 A 16bit bool specifying the value of the lane.
                   * @return SIMD.Bool16x8 object
                   */
  def apply(
    s0: js.UndefOr[scala.Boolean],
    s1: js.UndefOr[scala.Boolean],
    s2: js.UndefOr[scala.Boolean],
    s3: js.UndefOr[scala.Boolean],
    s4: js.UndefOr[scala.Boolean],
    s5: js.UndefOr[scala.Boolean],
    s6: js.UndefOr[scala.Boolean],
    s7: js.UndefOr[scala.Boolean]
  ): Bool16x8 = js.native
  /**
                   * If all lane values are `true`, return `true`.
                   */
  def allTrue(a: Bool16x8): scala.Boolean = js.native
  def and(a: Bool16x8, b: Bool16x8): Bool16x8 = js.native
  /**
                   * If any lane values are `true`, return `true`.
                   */
  def anyTrue(a: Bool16x8): scala.Boolean = js.native
  /**
                   * Returns a new instance if the parameter is a valid SIMD data type and the same as Bool16x8. Throws a TypeError otherwise.
                   */
  def check(a: Bool16x8): Bool16x8 = js.native
  /**
                   * Returns the value of the given lane.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param lane An index number for which lane to extract.
                   * @return The value of the extracted lane.
                   */
  def extractLane(simd: Bool16x8, lane: scala.Double): scala.Boolean = js.native
  def not(a: Bool16x8, b: Bool16x8): Bool16x8 = js.native
  def or(a: Bool16x8, b: Bool16x8): Bool16x8 = js.native
  /**
                   * Returns a new instance with the given lane value replaced.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param value A new value to be used for the lane.
                   * @return A new SIMD data type with the given lane value replaced.
                   */
  def replaceLane(simd: Bool16x8, lane: scala.Double, value: scala.Boolean): Bool16x8 = js.native
  /**
                   * Creates a new SIMD.Bool16x8 data type with all lanes set to a given value.
                   */
  def splat(n: scala.Boolean): Bool16x8 = js.native
  def xor(a: Bool16x8, b: Bool16x8): Bool16x8 = js.native
}

