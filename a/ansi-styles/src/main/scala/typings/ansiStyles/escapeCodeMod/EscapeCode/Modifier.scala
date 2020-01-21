package typings.ansiStyles.escapeCodeMod.EscapeCode

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
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Modifier]
  }
}

