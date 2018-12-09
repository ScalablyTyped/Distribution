package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Int32x4Constructor extends js.Object {
  /**
                   * SIMD.Int32x4 constructor
                   * @param s0 A 32bit int specifying the value of the lane.
                   * @param s1 A 32bit int specifying the value of the lane.
                   * @param s2 A 32bit int specifying the value of the lane.
                   * @param s3 A 32bit int specifying the value of the lane.
                   * @return SIMD.Int32x4 object
                   */
  def apply(): Int32x4 = js.native
  /**
                   * SIMD.Int32x4 constructor
                   * @param s0 A 32bit int specifying the value of the lane.
                   * @param s1 A 32bit int specifying the value of the lane.
                   * @param s2 A 32bit int specifying the value of the lane.
                   * @param s3 A 32bit int specifying the value of the lane.
                   * @return SIMD.Int32x4 object
                   */
  def apply(s0: scala.Double): Int32x4 = js.native
  /**
                   * SIMD.Int32x4 constructor
                   * @param s0 A 32bit int specifying the value of the lane.
                   * @param s1 A 32bit int specifying the value of the lane.
                   * @param s2 A 32bit int specifying the value of the lane.
                   * @param s3 A 32bit int specifying the value of the lane.
                   * @return SIMD.Int32x4 object
                   */
  def apply(s0: scala.Double, s1: scala.Double): Int32x4 = js.native
  /**
                   * SIMD.Int32x4 constructor
                   * @param s0 A 32bit int specifying the value of the lane.
                   * @param s1 A 32bit int specifying the value of the lane.
                   * @param s2 A 32bit int specifying the value of the lane.
                   * @param s3 A 32bit int specifying the value of the lane.
                   * @return SIMD.Int32x4 object
                   */
  def apply(s0: scala.Double, s1: scala.Double, s2: scala.Double): Int32x4 = js.native
  /**
                   * SIMD.Int32x4 constructor
                   * @param s0 A 32bit int specifying the value of the lane.
                   * @param s1 A 32bit int specifying the value of the lane.
                   * @param s2 A 32bit int specifying the value of the lane.
                   * @param s3 A 32bit int specifying the value of the lane.
                   * @return SIMD.Int32x4 object
                   */
  def apply(s0: scala.Double, s1: scala.Double, s2: scala.Double, s3: scala.Double): Int32x4 = js.native
  def add(a: Int32x4, b: Int32x4): Int32x4 = js.native
  def and(a: Int32x4, b: Int32x4): Int32x4 = js.native
  /**
                   * Returns a new instance if the parameter is a valid SIMD data type and the same as Int32x4. Throws a TypeError otherwise.
                   */
  def check(a: Int32x4): Int32x4 = js.native
  def equal(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  /**
                   * Returns the value of the given lane.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param lane An index number for which lane to extract.
                   * @return The value of the extracted lane.
                   */
  def extractLane(simd: Int32x4, lane: scala.Double): scala.Double = js.native
  /**
                   * Creates a new SIMD data type with a float conversion from a Float32x4.
                   * @param value An Float32x4 SIMD type to convert from.
                   */
  def fromFloat32x4(value: Float32x4): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Float32x4.
                   * @param value A Float32x4 SIMD type to convert from (bitwise).
                   */
  def fromFloat32x4Bits(value: Float32x4): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Int16x8.
                   * @param value A Int16x8 SIMD type to convert from (bitwise).
                   */
  def fromInt16x8Bits(value: Int16x8): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Int8x16.
                   * @param value A Int8x16 SIMD type to convert from (bitwise).
                   */
  def fromInt8x16Bits(value: Int8x16): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Uint16x8.
                   * @param value A Uint16x8 SIMD type to convert from (bitwise).
                   */
  def fromUint16x8Bits(value: Uint16x8): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a float conversion from a Uint32x4.
                   * @param value An Uint32x4 SIMD type to convert from.
                   */
  def fromUint32x4(value: Uint32x4): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Uint32x4.
                   * @param value A Uint32x4 SIMD type to convert from (bitwise).
                   */
  def fromUint32x4Bits(value: Uint32x4): Int32x4 = js.native
  /**
                   * Creates a new SIMD data type with a bit-wise copy from a Uint8x16.
                   * @param value A Uint8x16 SIMD type to convert from (bitwise).
                   */
  def fromUint8x16Bits(value: Uint8x16): Int32x4 = js.native
  def greaterThan(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  def greaterThanOrEqual(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  def lessThan(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  def lessThanOrEqual(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  /**
                   * Returns a new instance with all lane values loaded from a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start loading in the typed array.
                   */
  def load(tarray: TypedArray, index: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with 1 lane values loaded from a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start loading in the typed array.
                   */
  def load1(tarray: TypedArray, index: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with 2 lane values loaded from a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start loading in the typed array.
                   */
  def load2(tarray: TypedArray, index: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with 3 lane values loaded from a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start loading in the typed array.
                   */
  def load3(tarray: TypedArray, index: scala.Double): Int32x4 = js.native
  def mul(a: Int32x4, b: Int32x4): Int32x4 = js.native
  def neg(a: Int32x4): Int32x4 = js.native
  def not(a: Int32x4, b: Int32x4): Int32x4 = js.native
  def notEqual(a: Int32x4, b: Int32x4): Bool32x4 = js.native
  def or(a: Int32x4, b: Int32x4): Int32x4 = js.native
  /**
                   * Returns a new instance with the given lane value replaced.
                   * @param simd An instance of a corresponding SIMD type.
                   * @param value A new value to be used for the lane.
                   * @return A new SIMD data type with the given lane value replaced.
                   */
  def replaceLane(simd: Int32x4, lane: scala.Double, value: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with the lane values being a mix of the lanes depending on the selector mask.
                   * @param selector the selector mask.
                   * @param a If the selector mask lane is `true`, pick the corresponding lane value from here.
                   * @param b If the selector mask lane is `false`, pick the corresponding lane value from here.
                   */
  def select(selector: Bool32x4, a: Int32x4, b: Int32x4): Int32x4 = js.native
  /**
                   * Returns a new instance with the lane values shifted left by a given bit count (`a << bits`).
                   * @param a An instance of a SIMD type.
                   * @param bits Bit count to shift by.
                   * @return A new corresponding SIMD data type with the lane values shifted left by a given bit count (`a << bits`).
                   */
  def shiftLeftByScalar(a: Int32x4, bits: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
                   * @param a An instance of a SIMD type.
                   * @param bits Bit count to shift by.
                   * @return A new corresponding SIMD data type with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
                   */
  def shiftRightByScalar(a: Int32x4, bits: scala.Double): Int32x4 = js.native
  /**
                   * Returns a new instance with the lane values shuffled.
                   */
  def shuffle(a: Int32x4, b: Int32x4, l1: scala.Double, l2: scala.Double, l3: scala.Double, l4: scala.Double): Int32x4 = js.native
  /**
                   * Creates a new SIMD.Int32x4 data type with all lanes set to a given value.
                   */
  def splat(n: scala.Double): Int32x4 = js.native
  /**
                   * Store all values of a SIMD data type into a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start storing in the typed array.
                   * @param value An instance of a SIMD data type to store into the typed array.
                   * @return The value that has been stored (a SIMD data type).
                   */
  def store(tarray: TypedArray, index: scala.Double, value: Int32x4): Int32x4 = js.native
  /**
                   * Store 1 values of a SIMD data type into a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start storing in the typed array.
                   * @param value An instance of a SIMD data type to store into the typed array.
                   * @return The value that has been stored (a SIMD data type).
                   */
  def store1(tarray: TypedArray, index: scala.Double, value: Int32x4): Int32x4 = js.native
  /**
                   * Store 2 values of a SIMD data type into a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start storing in the typed array.
                   * @param value An instance of a SIMD data type to store into the typed array.
                   * @return The value that has been stored (a SIMD data type).
                   */
  def store2(tarray: TypedArray, index: scala.Double, value: Int32x4): Int32x4 = js.native
  /**
                   * Store 3 values of a SIMD data type into a typed array.
                   * @param tarray An instance of a typed array.
                   * @param index A number for the index from where to start storing in the typed array.
                   * @param value An instance of a SIMD data type to store into the typed array.
                   * @return The value that has been stored (a SIMD data type).
                   */
  def store3(tarray: TypedArray, index: scala.Double, value: Int32x4): Int32x4 = js.native
  def sub(a: Int32x4, b: Int32x4): Int32x4 = js.native
  /**
                   * Returns a new instance with the lane values swizzled.
                   */
  def swizzle(a: Int32x4, l1: scala.Double, l2: scala.Double, l3: scala.Double, l4: scala.Double): Int32x4 = js.native
  def xor(a: Int32x4, b: Int32x4): Int32x4 = js.native
}

