package typings.adone.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Uint32x4Constructor extends js.Object {
  /**
    * SIMD.Uint32x4 constructor
    * @param s0 A 32bit uint specifying the value of the lane.
    * @param s1 A 32bit uint specifying the value of the lane.
    * @param s2 A 32bit uint specifying the value of the lane.
    * @param s3 A 32bit uint specifying the value of the lane.
    * @return SIMD.Uint32x4 object
    */
  def apply(): Uint32x4 = js.native
  def apply(s0: Double): Uint32x4 = js.native
  def apply(s0: Double, s1: Double): Uint32x4 = js.native
  def apply(s0: Double, s1: Double, s2: Double): Uint32x4 = js.native
  def apply(s0: Double, s1: Double, s2: Double, s3: Double): Uint32x4 = js.native
  def add(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  def and(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  /**
    * Returns a new instance if the parameter is a valid SIMD data type and the same as Uint32x4. Throws a TypeError otherwise.
    */
  def check(a: Uint32x4): Uint32x4 = js.native
  def equal(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  /**
    * Returns the value of the given lane.
    * @param simd An instance of a corresponding SIMD type.
    * @param lane An index number for which lane to extract.
    * @return The value of the extracted lane.
    */
  def extractLane(simd: Uint32x4, lane: Double): Double = js.native
  /**
    * Creates a new SIMD data type with a float conversion from a Float32x4.
    * @param value An Float32x4 SIMD type to convert from.
    */
  def fromFloat32x4(value: Float32x4): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Float32x4.
    * @param value A Float32x4 SIMD type to convert from (bitwise).
    */
  def fromFloat32x4Bits(value: Float32x4): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int16x8.
    * @param value A Int16x8 SIMD type to convert from (bitwise).
    */
  def fromInt16x8Bits(value: Int16x8): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a float conversion from a Int32x4.
    * @param value An Int32x4 SIMD type to convert from.
    */
  def fromInt32x4(value: Int32x4): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int32x4.
    * @param value A Int32x4 SIMD type to convert from (bitwise).
    */
  def fromInt32x4Bits(value: Int32x4): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int8x16.
    * @param value A Int8x16 SIMD type to convert from (bitwise).
    */
  def fromInt8x16Bits(value: Int8x16): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint16x8.
    * @param value A Uint16x8 SIMD type to convert from (bitwise).
    */
  def fromUint16x8Bits(value: Uint16x8): Uint32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint8x16.
    * @param value A Uint8x16 SIMD type to convert from (bitwise).
    */
  def fromUint8x16Bits(value: Uint8x16): Uint32x4 = js.native
  def greaterThan(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  def greaterThanOrEqual(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  def lessThan(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  def lessThanOrEqual(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  /**
    * Returns a new instance with all lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load(tarray: TypedArray, index: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with 1 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load1(tarray: TypedArray, index: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with 2 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load2(tarray: TypedArray, index: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with 3 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load3(tarray: TypedArray, index: Double): Uint32x4 = js.native
  def mul(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  def not(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  def notEqual(a: Uint32x4, b: Uint32x4): Bool32x4 = js.native
  def or(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  /**
    * Returns a new instance with the given lane value replaced.
    * @param simd An instance of a corresponding SIMD type.
    * @param value A new value to be used for the lane.
    * @return A new SIMD data type with the given lane value replaced.
    */
  def replaceLane(simd: Uint32x4, lane: Double, value: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with the lane values being a mix of the lanes depending on the selector mask.
    * @param selector the selector mask.
    * @param a If the selector mask lane is `true`, pick the corresponding lane value from here.
    * @param b If the selector mask lane is `false`, pick the corresponding lane value from here.
    */
  def select(selector: Bool32x4, a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  /**
    * Returns a new instance with the lane values shifted left by a given bit count (`a << bits`).
    * @param a An instance of a SIMD type.
    * @param bits Bit count to shift by.
    * @return A new corresponding SIMD data type with the lane values shifted left by a given bit count (`a << bits`).
    */
  def shiftLeftByScalar(a: Uint32x4, bits: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
    * @param a An instance of a SIMD type.
    * @param bits Bit count to shift by.
    * @return A new corresponding SIMD data type with the lane values shifted right by a given bit count (`a >> bits` or `a >>> bits`).
    */
  def shiftRightByScalar(a: Uint32x4, bits: Double): Uint32x4 = js.native
  /**
    * Returns a new instance with the lane values shuffled.
    */
  def shuffle(a: Uint32x4, b: Uint32x4, l1: Double, l2: Double, l3: Double, l4: Double): Uint32x4 = js.native
  /**
    * Creates a new SIMD.Uint32x4 data type with all lanes set to a given value.
    */
  def splat(n: Double): Uint32x4 = js.native
  /**
    * Store all values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store(tarray: TypedArray, index: Double, value: Uint32x4): Uint32x4 = js.native
  /**
    * Store 1 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store1(tarray: TypedArray, index: Double, value: Uint32x4): Uint32x4 = js.native
  /**
    * Store 2 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store2(tarray: TypedArray, index: Double, value: Uint32x4): Uint32x4 = js.native
  /**
    * Store 3 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store3(tarray: TypedArray, index: Double, value: Uint32x4): Uint32x4 = js.native
  def sub(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
  /**
    * Returns a new instance with the lane values swizzled.
    */
  def swizzle(a: Uint32x4, l1: Double, l2: Double, l3: Double, l4: Double): Uint32x4 = js.native
  def xor(a: Uint32x4, b: Uint32x4): Uint32x4 = js.native
}

