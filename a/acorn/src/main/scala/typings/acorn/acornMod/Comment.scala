package typings.acorn.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends AbstractToken {
  var `type`: String
  var value: String
}

object Comment {
  @scala.inline
  def apply(
    end: Double,
    start: Double,
    `type`: String,
    value: String,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null
  ): Comment = {
    val __obj = js.Dynamic.literal(end = end, start = start, value = value)
    __obj.updateDynamic("type")(`type`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Comment]
  }
}

