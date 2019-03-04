package typings
package ansiDashStylesLib.escapeDashCodeMod.EscapeCodeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifier extends js.Object {
  var bold: CodePair
  var dim: CodePair
  var hidden: CodePair
  var inverse: CodePair
  /**
    * Not widely supported
    */
  var italic: CodePair
  var reset: CodePair
  /**
    * Not widely supported
    */
  var strikethrough: CodePair
  var underline: CodePair
}

object Modifier {
  @scala.inline
  def apply(
    bold: CodePair,
    dim: CodePair,
    hidden: CodePair,
    inverse: CodePair,
    italic: CodePair,
    reset: CodePair,
    strikethrough: CodePair,
    underline: CodePair
  ): Modifier = {
    val __obj = js.Dynamic.literal(bold = bold, dim = dim, hidden = hidden, inverse = inverse, italic = italic, reset = reset, strikethrough = strikethrough, underline = underline)
  
    __obj.asInstanceOf[Modifier]
  }
}

