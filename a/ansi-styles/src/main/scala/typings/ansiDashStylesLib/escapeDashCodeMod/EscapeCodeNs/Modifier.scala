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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bold")(bold)
    __obj.updateDynamic("dim")(dim)
    __obj.updateDynamic("hidden")(hidden)
    __obj.updateDynamic("inverse")(inverse)
    __obj.updateDynamic("italic")(italic)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("strikethrough")(strikethrough)
    __obj.updateDynamic("underline")(underline)
    __obj.asInstanceOf[Modifier]
  }
}

