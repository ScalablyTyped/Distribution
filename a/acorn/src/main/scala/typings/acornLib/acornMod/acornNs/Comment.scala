package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends AbstractToken {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    `type`: java.lang.String,
    value: java.lang.String,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Comment = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Comment]
  }
}

