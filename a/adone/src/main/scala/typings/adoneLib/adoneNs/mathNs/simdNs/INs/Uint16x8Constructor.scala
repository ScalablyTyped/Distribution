package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint16x8Constructor extends js.Object {
  /**
    * SIMD.Uint16x8 constructor
    * @param s0 A 16bit uint specifying the value of the lane.
    * @param s1 A 16bit uint specifying the value of the lane.
    * @param s2 A 16bit uint specifying the value of the lane.
    * @param s3 A 16bit uint specifying the value of the lane.
    * @param s4 A 16bit uint specifying the value of the lane.
    * @param s5 A 16bit uint specifying the value of the lane.
    * @param s6 A 16bit uint specifying the value of the lane.
    * @param s7 A 16bit uint specifying the value of the lane.
    * @return SIMD.Uint16x8 object
    */
  def apply(
    s0: js.UndefOr[scala.Double],
    s1: js.UndefOr[scala.Double],
    s2: js.UndefOr[scala.Double],
    s3: js.UndefOr[scala.Double],
    s4: js.UndefOr[scala.Double],
    s5: js.UndefOr[scala.Double],
    s6: js.UndefOr[scala.Double],
    s7: js.UndefOr[scala.Double]
  ): Uint16x8 = js.native
  def add(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  def addSaturate(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  def and(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  /**
    * Returns a new instance if the parameter is a valid SIMD data type and the same as Uint16x8. Throws a TypeError otherwise.
    */
  def check(a: Uint16x8): Uint16x8 = js.native
  def equal(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  /**
    * Returns the value of the given lane.
    * @param simd An instance of a corresponding SIMD type.
    * @param lane An index number for which lane to extract.
    * @return The value of the extracted lane.
    */
  def extractLane(simd: Uint16x8, lane: scala.Double): scala.Double = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Float32x4.
    * @param value A Float32x4 SIMD type to convert from (bitwise).
    */
  def fromFloat32x4Bits(value: Float32x4): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a float conversion from a Int16x8.
    * @param value An Int16x8 SIMD type to convert from.
    */
  def fromInt16x8(value: Int16x8): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int16x8.
    * @param value A Int16x8 SIMD type to convert from (bitwise).
    */
  def fromInt16x8Bits(value: Int16x8): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int32x4.
    * @param value A Int32x4 SIMD type to convert from (bitwise).
    */
  def fromInt32x4Bits(value: Int32x4): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int8x16.
    * @param value A Int8x16 SIMD type to convert from (bitwise).
    */
  def fromInt8x16Bits(value: Int8x16): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint32x4.
    * @param value A Uint32x4 SIMD type to convert from (bitwise).
    */
  def fromUint32x4Bits(value: Uint32x4): Uint16x8 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint8x16.
    * @param value A Uint8x16 SIMD type to convert from (bitwise).
    */
  def fromUint8x16Bits(value: Uint8x16): Uint16x8 = js.native
  def greaterThan(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  def greaterThanOrEqual(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  def lessThan(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  def lessThanOrEqual(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  /**
    * Returns a new instance with all lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load(tarray: TypedArray, index: scala.Double): Uint16x8 = js.native
  def mul(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  def not(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  def notEqual(a: Uint16x8, b: Uint16x8): Bool16x8 = js.native
  def or(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  /**
    * Returns a new instance with the given lane value replaced.
    * @param simd An instance of a corresponding SIMD type.
    * @param value A new value to be used for the lane.
    * @return A new SIMD data type with the given lane value replaced.
    */
  def replaceLane(simd: Uint16x8, lane: scala.Double, value: scala.Double): Uint16x8 = js.native
  /**
    * Returns a new instance with the lane values being a mix of the lanes depending on the selector mask.
    * @param selector the selector mask.
    * @param a If the selector mask lane is `true`, pick the corresponding lane value from here.
    * @param b If the selector mask lane is `false`, pick the corresponding lane value from here.
    */
  def select(selector: Bool16x8, a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  /**
    * Returns a new instance with the lane values shifted left by a given bit count (`a << bits`).
    * @param a An instance of a SIMD type.
    * @param bits Bit count to shift by.
    * @return A new corresponding SIMD data type with the lane values shifted left by a given bit count (`a << bits`).
    */
  def shiftLeftByScalar(a: Uint16x8, bits: scala.Double): Uint16x8 = js.native
  /**
    * Returns a new instance with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
    * @param a An instance of a SIMD type.
    * @param bits Bit count to shift by.
    * @return A new corresponding SIMD data type with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
    */
  def shiftRightByScalar(a: Uint16x8, bits: scala.Double): Uint16x8 = js.native
  /**
    * Returns a new instance with the lane values shuffled.
    */
  def shuffle(
    a: Uint16x8,
    b: Uint16x8,
    l1: scala.Double,
    l2: scala.Double,
    l3: scala.Double,
    l4: scala.Double,
    l5: scala.Double,
    l6: scala.Double,
    l7: scala.Double,
    l8: scala.Double
  ): Uint16x8 = js.native
  /**
    * Creates a new SIMD.Uint16x8 data type with all lanes set to a given value.
    */
  def splat(n: scala.Double): Uint16x8 = js.native
  /**
    * Store all values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store(tarray: TypedArray, index: scala.Double, value: Uint16x8): Uint16x8 = js.native
  def sub(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  def subSaturate(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
  /**
    * Returns a new instance with the lane values swizzled.
    */
  def swizzle(
    a: Uint16x8,
    l1: scala.Double,
    l2: scala.Double,
    l3: scala.Double,
    l4: scala.Double,
    l5: scala.Double,
    l6: scala.Double,
    l7: scala.Double,
    l8: scala.Double
  ): Uint16x8 = js.native
  def xor(a: Uint16x8, b: Uint16x8): Uint16x8 = js.native
}

