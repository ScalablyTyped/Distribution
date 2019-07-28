package typings.adone.adoneNs.mathNs.simdNs.INs

import typings.adone.adoneStrings.default
import typings.adone.adoneStrings.number
import typings.adone.adoneStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 128-bits divided into 8 lanes storing 16-bit signed integer values.
  */
@js.native
trait Int16x8 extends js.Object {
  @JSName("constructor")
  var constructor_Original: Int16x8Constructor = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[string, String]) with (js.Function1[number, Double]) with (js.Function1[default, this.type]) with (js.Function1[/* hint */ String, _]) = js.native
  /**
    * The initial value of the @@toStringTag property is the String value "SIMD.Int16x8".
    */
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  var toStringTag: String = js.native
}

