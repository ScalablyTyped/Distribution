package typings.adone.adoneNs.mathNs.simdNs.INs

import typings.adone.adoneStrings.default
import typings.adone.adoneStrings.number
import typings.adone.adoneStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SIMD type representing 8 boolean values, as an intermediate value in manipulating 128-bit vectors
  */
@js.native
trait Bool8x16 extends js.Object {
  @JSName("constructor")
  var constructor_Original: Bool8x16Constructor = js.native
  @JSName(scala.scalajs.js.Symbol.toPrimitive)
  var toPrimitive: (js.Function1[string, String]) with (js.Function1[number, Double]) with (js.Function1[default, this.type]) with (js.Function1[/* hint */ String, _]) = js.native
  /**
    * The initial value of the @@toStringTag property is the String value "SIMD.Bool8x16".
    */
  @JSName(scala.scalajs.js.Symbol.toStringTag)
  var toStringTag: String = js.native
}

