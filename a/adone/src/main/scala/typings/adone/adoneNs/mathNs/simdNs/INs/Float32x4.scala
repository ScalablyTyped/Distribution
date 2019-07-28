package typings.adone.adoneNs.mathNs.simdNs.INs

import typings.adone.adoneStrings.default
import typings.adone.adoneStrings.number
import typings.adone.adoneStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 128-bits divided into 4 lanes storing single precision floating point values.
  */
@js.native
/**
  * SIMD.Float32x4 constructor
  * @param s0 A 32bit float specifying the value of the lane.
  * @param s1 A 32bit float specifying the value of the lane.
  * @param s2 A 32bit float specifying the value of the lane.
  * @param s3 A 32bit float specifying the value of the lane.
  * @return SIMD.Float32x4 object
  */
trait Float32x4 extends js.Object {
  @JSName("constructor")
  var constructor_Original: Float32x4Constructor = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[string, String]) with (js.Function1[number, Double]) with (js.Function1[default, this.type]) with (js.Function1[/* hint */ String, _]) = js.native
  /**
    * The initial value of the @@toStringTag property is the String value "SIMD.Float32x4".
    */
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  var toStringTag: String = js.native
}

