package typings
package ascii2mathmlLib.ascii2mathmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ascii2mathml extends js.Object {
  /**
       * Converts ASCIIMath expression to MathML markup.
       * @param asciimath ASCIIMath expression
       * @param options Options
       */
  def apply(asciimath: java.lang.String): java.lang.String = js.native
  /**
       * Converts ASCIIMath expression to MathML markup.
       * @param asciimath ASCIIMath expression
       * @param options Options
       */
  def apply(asciimath: java.lang.String, options: ascii2mathmlLib.ascii2mathmlMod.A2MMLNs.Options): java.lang.String = js.native
  /**
       * Generates a function with default options set to convert
       * ASCIIMath expression to MathML markup.
       * @param options Options
       */
  def apply(options: ascii2mathmlLib.ascii2mathmlMod.A2MMLNs.Options): ascii2mathml = js.native
}

