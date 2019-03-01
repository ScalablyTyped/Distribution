package typings
package acornLib.acornMod.acornNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractToken extends js.Object {
  var end: scala.Double
  var loc: js.UndefOr[SourceLocation] = js.undefined
  var range: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var start: scala.Double
}

object AbstractToken {
  @scala.inline
  def apply(
    end: scala.Double,
    start: scala.Double,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): AbstractToken = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[AbstractToken]
  }
}

