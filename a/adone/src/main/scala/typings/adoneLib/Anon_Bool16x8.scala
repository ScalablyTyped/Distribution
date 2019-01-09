package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Bool16x8 extends js.Object {
  @JSName("Bool16x8")
  val Bool16x8_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Bool16x8Constructor = js.native
  @JSName("Bool32x4")
  val Bool32x4_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4Constructor = js.native
  @JSName("Bool8x16")
  val Bool8x16_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Bool8x16Constructor = js.native
  @JSName("Float32x4")
  val Float32x4_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4Constructor = js.native
  val INs: js.Any = js.native
  @JSName("Int16x8")
  val Int16x8_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Int16x8Constructor = js.native
  @JSName("Int32x4")
  val Int32x4_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4Constructor = js.native
  @JSName("Int8x16")
  val Int8x16_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Int8x16Constructor = js.native
  @JSName("Uint16x8")
  val Uint16x8_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Uint16x8Constructor = js.native
  @JSName("Uint32x4")
  val Uint32x4_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4Constructor = js.native
  @JSName("Uint8x16")
  val Uint8x16_Original: adoneLib.adoneNs.mathNs.simdNs.INs.Uint8x16Constructor = js.native
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
  def Bool16x8(
    s0: js.UndefOr[scala.Boolean],
    s1: js.UndefOr[scala.Boolean],
    s2: js.UndefOr[scala.Boolean],
    s3: js.UndefOr[scala.Boolean],
    s4: js.UndefOr[scala.Boolean],
    s5: js.UndefOr[scala.Boolean],
    s6: js.UndefOr[scala.Boolean],
    s7: js.UndefOr[scala.Boolean]
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Bool16x8 = js.native
  /**
    * SIMD.Bool32x4 constructor
    * @param s0 A 32bit bool specifying the value of the lane.
    * @param s1 A 32bit bool specifying the value of the lane.
    * @param s2 A 32bit bool specifying the value of the lane.
    * @param s3 A 32bit bool specifying the value of the lane.
    * @return SIMD.Bool32x4 object
    */
  def Bool32x4(): adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4 = js.native
  def Bool32x4(s0: scala.Boolean): adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4 = js.native
  def Bool32x4(s0: scala.Boolean, s1: scala.Boolean): adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4 = js.native
  def Bool32x4(s0: scala.Boolean, s1: scala.Boolean, s2: scala.Boolean): adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4 = js.native
  def Bool32x4(s0: scala.Boolean, s1: scala.Boolean, s2: scala.Boolean, s3: scala.Boolean): adoneLib.adoneNs.mathNs.simdNs.INs.Bool32x4 = js.native
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
  def Bool8x16(
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
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Bool8x16 = js.native
  /**
    * SIMD.Float32x4 constructor
    * @param s0 A 32bit float specifying the value of the lane.
    * @param s1 A 32bit float specifying the value of the lane.
    * @param s2 A 32bit float specifying the value of the lane.
    * @param s3 A 32bit float specifying the value of the lane.
    * @return SIMD.Float32x4 object
    */
  def Float32x4(): adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4 = js.native
  def Float32x4(s0: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4 = js.native
  def Float32x4(s0: scala.Double, s1: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4 = js.native
  def Float32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4 = js.native
  def Float32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double, s3: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Float32x4 = js.native
  /**
    * SIMD.Int16x8 constructor
    * @param s0 A 16bit int specifying the value of the lane.
    * @param s1 A 16bit int specifying the value of the lane.
    * @param s2 A 16bit int specifying the value of the lane.
    * @param s3 A 16bit int specifying the value of the lane.
    * @param s4 A 16bit int specifying the value of the lane.
    * @param s5 A 16bit int specifying the value of the lane.
    * @param s6 A 16bit int specifying the value of the lane.
    * @param s7 A 16bit int specifying the value of the lane.
    * @return SIMD.Int16x8 object
    */
  def Int16x8(
    s0: js.UndefOr[scala.Double],
    s1: js.UndefOr[scala.Double],
    s2: js.UndefOr[scala.Double],
    s3: js.UndefOr[scala.Double],
    s4: js.UndefOr[scala.Double],
    s5: js.UndefOr[scala.Double],
    s6: js.UndefOr[scala.Double],
    s7: js.UndefOr[scala.Double]
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Int16x8 = js.native
  /**
    * SIMD.Int32x4 constructor
    * @param s0 A 32bit int specifying the value of the lane.
    * @param s1 A 32bit int specifying the value of the lane.
    * @param s2 A 32bit int specifying the value of the lane.
    * @param s3 A 32bit int specifying the value of the lane.
    * @return SIMD.Int32x4 object
    */
  def Int32x4(): adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4 = js.native
  def Int32x4(s0: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4 = js.native
  def Int32x4(s0: scala.Double, s1: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4 = js.native
  def Int32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4 = js.native
  def Int32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double, s3: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Int32x4 = js.native
  /**
    * SIMD.Int8x16 constructor
    * @param s0 A 8bit int specifying the value of the lane.
    * @param s1 A 8bit int specifying the value of the lane.
    * @param s2 A 8bit int specifying the value of the lane.
    * @param s3 A 8bit int specifying the value of the lane.
    * @param s4 A 8bit int specifying the value of the lane.
    * @param s5 A 8bit int specifying the value of the lane.
    * @param s6 A 8bit int specifying the value of the lane.
    * @param s7 A 8bit int specifying the value of the lane.
    * @param s8 A 8bit int specifying the value of the lane.
    * @param s9 A 8bit int specifying the value of the lane.
    * @param s10 A 8bit int specifying the value of the lane.
    * @param s11 A 8bit int specifying the value of the lane.
    * @param s12 A 8bit int specifying the value of the lane.
    * @param s13 A 8bit int specifying the value of the lane.
    * @param s14 A 8bit int specifying the value of the lane.
    * @param s15 A 8bit int specifying the value of the lane.
    * @return SIMD.Int8x16 object
    */
  def Int8x16(
    s0: js.UndefOr[scala.Double],
    s1: js.UndefOr[scala.Double],
    s2: js.UndefOr[scala.Double],
    s3: js.UndefOr[scala.Double],
    s4: js.UndefOr[scala.Double],
    s5: js.UndefOr[scala.Double],
    s6: js.UndefOr[scala.Double],
    s7: js.UndefOr[scala.Double],
    s8: js.UndefOr[scala.Double],
    s9: js.UndefOr[scala.Double],
    s10: js.UndefOr[scala.Double],
    s11: js.UndefOr[scala.Double],
    s12: js.UndefOr[scala.Double],
    s13: js.UndefOr[scala.Double],
    s14: js.UndefOr[scala.Double],
    s15: js.UndefOr[scala.Double]
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Int8x16 = js.native
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
  def Uint16x8(
    s0: js.UndefOr[scala.Double],
    s1: js.UndefOr[scala.Double],
    s2: js.UndefOr[scala.Double],
    s3: js.UndefOr[scala.Double],
    s4: js.UndefOr[scala.Double],
    s5: js.UndefOr[scala.Double],
    s6: js.UndefOr[scala.Double],
    s7: js.UndefOr[scala.Double]
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Uint16x8 = js.native
  /**
    * SIMD.Uint32x4 constructor
    * @param s0 A 32bit uint specifying the value of the lane.
    * @param s1 A 32bit uint specifying the value of the lane.
    * @param s2 A 32bit uint specifying the value of the lane.
    * @param s3 A 32bit uint specifying the value of the lane.
    * @return SIMD.Uint32x4 object
    */
  def Uint32x4(): adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4 = js.native
  def Uint32x4(s0: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4 = js.native
  def Uint32x4(s0: scala.Double, s1: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4 = js.native
  def Uint32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4 = js.native
  def Uint32x4(s0: scala.Double, s1: scala.Double, s2: scala.Double, s3: scala.Double): adoneLib.adoneNs.mathNs.simdNs.INs.Uint32x4 = js.native
  /**
    * SIMD.Uint8x16 constructor
    * @param s0 A 8bit uint specifying the value of the lane.
    * @param s1 A 8bit uint specifying the value of the lane.
    * @param s2 A 8bit uint specifying the value of the lane.
    * @param s3 A 8bit uint specifying the value of the lane.
    * @param s4 A 8bit uint specifying the value of the lane.
    * @param s5 A 8bit uint specifying the value of the lane.
    * @param s6 A 8bit uint specifying the value of the lane.
    * @param s7 A 8bit uint specifying the value of the lane.
    * @param s8 A 8bit uint specifying the value of the lane.
    * @param s9 A 8bit uint specifying the value of the lane.
    * @param s10 A 8bit uint specifying the value of the lane.
    * @param s11 A 8bit uint specifying the value of the lane.
    * @param s12 A 8bit uint specifying the value of the lane.
    * @param s13 A 8bit uint specifying the value of the lane.
    * @param s14 A 8bit uint specifying the value of the lane.
    * @param s15 A 8bit uint specifying the value of the lane.
    * @return SIMD.Uint8x16 object
    */
  def Uint8x16(
    s0: js.UndefOr[scala.Double],
    s1: js.UndefOr[scala.Double],
    s2: js.UndefOr[scala.Double],
    s3: js.UndefOr[scala.Double],
    s4: js.UndefOr[scala.Double],
    s5: js.UndefOr[scala.Double],
    s6: js.UndefOr[scala.Double],
    s7: js.UndefOr[scala.Double],
    s8: js.UndefOr[scala.Double],
    s9: js.UndefOr[scala.Double],
    s10: js.UndefOr[scala.Double],
    s11: js.UndefOr[scala.Double],
    s12: js.UndefOr[scala.Double],
    s13: js.UndefOr[scala.Double],
    s14: js.UndefOr[scala.Double],
    s15: js.UndefOr[scala.Double]
  ): adoneLib.adoneNs.mathNs.simdNs.INs.Uint8x16 = js.native
}

