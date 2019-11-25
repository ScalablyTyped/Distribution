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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

