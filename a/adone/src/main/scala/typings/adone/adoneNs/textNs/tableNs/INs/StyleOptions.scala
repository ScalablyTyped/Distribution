package typings.adone.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var border: js.Array[String]
  var compact: Boolean
  var head: js.Array[String]
  var `padding-left`: Double
  var `padding-right`: Double
}

object StyleOptions {
  @scala.inline
  def apply(
    border: js.Array[String],
    compact: Boolean,
    head: js.Array[String],
    `padding-left`: Double,
    `padding-right`: Double
  ): StyleOptions = {
    val __obj = js.Dynamic.literal(border = border, compact = compact, head = head)
    __obj.updateDynamic("padding-left")(`padding-left`)
    __obj.updateDynamic("padding-right")(`padding-right`)
    __obj.asInstanceOf[StyleOptions]
  }
}

