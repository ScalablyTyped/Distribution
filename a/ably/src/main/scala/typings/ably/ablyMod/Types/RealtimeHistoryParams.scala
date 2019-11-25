package typings.ably.ablyMod.Types

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
    end: Int | Double = null,
    limit: Int | Double = null,
    start: Int | Double = null,
    untilAttach: js.UndefOr[Boolean] = js.undefined
  ): RealtimeHistoryParams = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(untilAttach)) __obj.updateDynamic("untilAttach")(untilAttach.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeHistoryParams]
  }
}

