package typings.acorn.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractToken extends js.Object {
  var end: Double
  var loc: js.UndefOr[SourceLocation] = js.undefined
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var start: Double
}

object AbstractToken {
  @scala.inline
  def apply(end: Double, start: Double, loc: SourceLocation = null, range: js.Tuple2[Double, Double] = null): AbstractToken = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractToken]
  }
}

