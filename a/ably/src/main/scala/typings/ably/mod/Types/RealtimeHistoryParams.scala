package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeHistoryParams extends js.Object {
  var direction: js.UndefOr[String] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var untilAttach: js.UndefOr[Boolean] = js.undefined
}

object RealtimeHistoryParams {
  @scala.inline
  def apply(
    direction: String = null,
    end: js.UndefOr[Double] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    untilAttach: js.UndefOr[Boolean] = js.undefined
  ): RealtimeHistoryParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (!js.isUndefined(untilAttach)) __obj.updateDynamic("untilAttach")(untilAttach.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeHistoryParams]
  }
}

