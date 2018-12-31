package typings
package adoneLib.adoneNs.mathNs.simdNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Float32x4Constructor extends js.Object {
  /**
    * SIMD.Float32x4 constructor
    * @param s0 A 32bit float specifying the value of the lane.
    * @param s1 A 32bit float specifying the value of the lane.
    * @param s2 A 32bit float specifying the value of the lane.
    * @param s3 A 32bit float specifying the value of the lane.
    * @return SIMD.Float32x4 object
    */
  def apply(): Float32x4 = js.native
  def apply(s0: scala.Double): Float32x4 = js.native
  def apply(s0: scala.Double, s1: scala.Double): Float32x4 = js.native
  def apply(s0: scala.Double, s1: scala.Double, s2: scala.Double): Float32x4 = js.native
  def apply(s0: scala.Double, s1: scala.Double, s2: scala.Double, s3: scala.Double): Float32x4 = js.native
  def abs(a: Float32x4): Float32x4 = js.native
  def add(a: Float32x4, b: Float32x4): Float32x4 = js.native
  /**
    * Returns a new instance if the parameter is a valid SIMD data type and the same as Float32x4. Throws a TypeError otherwise.
    */
  def check(a: Float32x4): Float32x4 = js.native
  def div(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def equal(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  /**
    * Returns the value of the given lane.
    * @param simd An instance of a corresponding SIMD type.
    * @param lane An index number for which lane to extract.
    * @return The value of the extracted lane.
    */
  def extractLane(simd: Float32x4, lane: scala.Double): scala.Double = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int16x8.
    * @param value A Int16x8 SIMD type to convert from (bitwise).
    */
  def fromInt16x8Bits(value: Int16x8): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a float conversion from a Int32x4.
    * @param value An Int32x4 SIMD type to convert from.
    */
  def fromInt32x4(value: Int32x4): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int32x4.
    * @param value A Int32x4 SIMD type to convert from (bitwise).
    */
  def fromInt32x4Bits(value: Int32x4): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Int8x16.
    * @param value A Int8x16 SIMD type to convert from (bitwise).
    */
  def fromInt8x16Bits(value: Int8x16): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint16x8.
    * @param value A Uint16x8 SIMD type to convert from (bitwise).
    */
  def fromUint16x8Bits(value: Uint16x8): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a float conversion from a Uint32x4.
    * @param value An Uint32x4 SIMD type to convert from.
    */
  def fromUint32x4(value: Uint32x4): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint32x4.
    * @param value A Uint32x4 SIMD type to convert from (bitwise).
    */
  def fromUint32x4Bits(value: Uint32x4): Float32x4 = js.native
  /**
    * Creates a new SIMD data type with a bit-wise copy from a Uint8x16.
    * @param value A Uint8x16 SIMD type to convert from (bitwise).
    */
  def fromUint8x16Bits(value: Uint8x16): Float32x4 = js.native
  def greaterThan(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  def greaterThanOrEqual(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  def lessThan(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  def lessThanOrEqual(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  /**
    * Returns a new instance with all lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load(tarray: TypedArray, index: scala.Double): Float32x4 = js.native
  /**
    * Returns a new instance with 1 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load1(tarray: TypedArray, index: scala.Double): Float32x4 = js.native
  /**
    * Returns a new instance with 2 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load2(tarray: TypedArray, index: scala.Double): Float32x4 = js.native
  /**
    * Returns a new instance with 3 lane values loaded from a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start loading in the typed array.
    */
  def load3(tarray: TypedArray, index: scala.Double): Float32x4 = js.native
  def max(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def maxNum(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def min(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def minNum(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def mul(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def neg(a: Float32x4): Float32x4 = js.native
  def notEqual(a: Float32x4, b: Float32x4): Bool32x4 = js.native
  def reciprocalApproximation(a: Float32x4, b: Float32x4): Float32x4 = js.native
  def reciprocalSqrtApproximation(a: Float32x4): Float32x4 = js.native
  /**
    * Returns a new instance with the given lane value replaced.
    * @param simd An instance of a corresponding SIMD type.
    * @param value A new value to be used for the lane.
    * @return A new SIMD data type with the given lane value replaced.
    */
  def replaceLane(simd: Float32x4, lane: scala.Double, value: scala.Double): Float32x4 = js.native
  /**
    * Returns a new instance with the lane values being a mix of the lanes depending on the selector mask.
    * @param selector the selector mask.
    * @param a If the selector mask lane is `true`, pick the corresponding lane value from here.
    * @param b If the selector mask lane is `false`, pick the corresponding lane value from here.
    */
  def select(selector: Bool32x4, a: Float32x4, b: Float32x4): Float32x4 = js.native
  /**
    * Returns a new instance with the lane values shuffled.
    */
  def shuffle(a: Float32x4, b: Float32x4, l1: scala.Double, l2: scala.Double, l3: scala.Double, l4: scala.Double): Float32x4 = js.native
  /**
    * Creates a new SIMD.Float32x4 data type with all lanes set to a given value.
    */
  def splat(n: scala.Double): Float32x4 = js.native
  def sqrt(a: Float32x4): Float32x4 = js.native
  /**
    * Store all values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store(tarray: TypedArray, index: scala.Double, value: Float32x4): Float32x4 = js.native
  /**
    * Store 1 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store1(tarray: TypedArray, index: scala.Double, value: Float32x4): Float32x4 = js.native
  /**
    * Store 2 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store2(tarray: TypedArray, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Float32Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Float64Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Int16Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Int32Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Uint16Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Uint32Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  /**
    * Store 3 values of a SIMD data type into a typed array.
    * @param tarray An instance of a typed array.
    * @param index A number for the index from where to start storing in the typed array.
    * @param value An instance of a SIMD data type to store into the typed array.
    * @return The value that has been stored (a SIMD data type).
    */
  def store3(tarray: stdLib.Uint8Array, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def store3(tarray: stdLib.Uint8ClampedArray, index: scala.Double, value: Float32x4): Float32x4 = js.native
  def sub(a: Float32x4, b: Float32x4): Float32x4 = js.native
  /**
    * Returns a new instance with the lane values swizzled.
    */
  def swizzle(a: Float32x4, l1: scala.Double, l2: scala.Double, l3: scala.Double, l4: scala.Double): Float32x4 = js.native
}

