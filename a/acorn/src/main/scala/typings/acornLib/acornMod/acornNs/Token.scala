package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends AbstractToken {
  var `type`: TokenType
  var value: js.Any
}

object Token {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    `type`: TokenType,
    value: js.Any,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Token = {
    val __obj = js.Dynamic.literal(end = end, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Token]
  }
}

