package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestHistoryParams extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var end: js.UndefOr[scala.Double] = js.undefined
  var limit: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
}

object RestHistoryParams {
  @scala.inline
  def apply(
    direction: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    limit: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null
  ): RestHistoryParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestHistoryParams]
  }
}

