package typings.ascii2mathml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ascii2mathml extends js.Object {
  
  /**
    * Converts ASCIIMath expression to MathML markup.
    * @param asciimath ASCIIMath expression
    * @param options Options
    */
  def apply(asciimath: String): String = js.native
  def apply(asciimath: String, options: Options): String = js.native
  /**
    * Generates a function with default options set to convert
    * ASCIIMath expression to MathML markup.
    * @param options Options
    */
  def apply(options: Options): ascii2mathml = js.native
}
