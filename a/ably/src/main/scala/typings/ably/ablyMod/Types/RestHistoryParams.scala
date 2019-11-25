package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestHistoryParams extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object RestHistoryParams {
  @scala.inline
  def apply(
    direction: String = null,
    end: Int | Double = null,
    limit: Int | Double = null,
    start: Int | Double = null
  ): RestHistoryParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestHistoryParams]
  }
}

