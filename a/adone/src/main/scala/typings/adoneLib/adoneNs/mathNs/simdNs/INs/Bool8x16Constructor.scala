package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bool8x16Constructor extends js.Object {
  /**
                   * SIMD.Bool8x16 constructor
                   * @param s0 A 8bit bool specifying the value of the lane.
                   * @param s1 A 8bit bool specifying the value of the lane.
                   * @param s2 A 8bit bool specifying the value of the lane.
                   * @param s3 A 8bit bool specifying the value of the lane.
                   * @param s4 A 8bit bool specifying the value of the lane.
                   * @param s5 A 8bit bool specifying the value of the lane.
                   * @param s6 A 8bit bool specifying the value of the lane.
                   * @param s7 A 8bit bool specifying the value of the lane.
                   * @param s8 A 8bit bool specifying the value of the lane.
                   * @param s9 A 8bit bool specifying the value of the lane.
                   * @param s10 A 8bit bool specifying the value of the lane.
                   * @param s11 A 8bit bool specifying the value of the lane.
                   * @param s12 A 8bit bool specifying the value of the lane.
                   * @param s13 A 8bit bool specifying the value of the lane.
                   * @param s14 A 8bit bool specifying the value of the lane.
                   * @param s15 A 8bit bool specifying the value of the lane.
                   * @return SIMD.Bool8x16 object
                   */
  def apply(
    s0: js.UndefOr[scala.Boolean],
    s1: js.UndefOr[scala.Boolean],
    s2: js.UndefOr[scala.Boolean],
    s3: js.UndefOr[scala.Boolean],
    s4: js.UndefOr[scala.Boolean],
    s5: js.UndefOr[scala.Boolean],
    s6: js.UndefOr[scala.Boolean],
    s7: js.UndefOr[scala.Boolean],
    s8: js.UndefOr[scala.Boolean],
    s9: js.UndefOr[scala.Boolean],
    s10: js.UndefOr[scala.Boolean],
    s11: js.UndefOr[scala.Boolean],
    s12: js.UndefOr[scala.Boolean],
    s13: js.UndefOr[scala.Boolean],
    s14: js.UndefOr[scala.Boolean],
    s15: js.UndefOr[scala.Boolean]
  ): Bool8x16 = js.native
  /**
                   * If all lane values are `true`, return `true`.
                   */
  def allTrue(a: Bool8x16): scala.Boolean = js.native
  def and(a: Bool8x16, b: Bool8x16): Bool8x16 = js.native
  /**
                   * If any lane values are `true`, return `true`.
                   */
  def anyTrue(a: Bool8x16): scala.Boolean = js.native
  /**
                   * Returns a new instance if the parameter is a valid SIMD data type and the same as Bool8x16. Throws a TypeError otherwise.
                   */
  def check(a: Bool8x16): Bool8x16 = js.native
  /**
                   * Returns the value of the given lane.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param lane An index number for which lane to extract.
                   * @return The value of the extracted lane.
                   */
  def extractLane(simd: Bool8x16, lane: scala.Double): scala.Boolean = js.native
  def not(a: Bool8x16, b: Bool8x16): Bool8x16 = js.native
  def or(a: Bool8x16, b: Bool8x16): Bool8x16 = js.native
  /**
                   * Returns a new instance with the given lane value replaced.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param value A new value to be used for the lane.
                   * @return A new SIMD data type with the given lane value replaced.
                   */
  def replaceLane(simd: Bool8x16, lane: scala.Double, value: scala.Boolean): Bool8x16 = js.native
  /**
                   * Creates a new SIMD.Bool8x16 data type with all lanes set to a given value.
                   */
  def splat(n: scala.Boolean): Bool8x16 = js.native
  def xor(a: Bool8x16, b: Bool8x16): Bool8x16 = js.native
}

