package typings.apolloEngineReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualizedQueryLatencyStats extends js.Object {
  /** ContextualizedQueryLatencyStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  /** ContextualizedQueryLatencyStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.undefined
}

object IContextualizedQueryLatencyStats {
  @scala.inline
  def apply(
    context: js.UndefOr[Null | IStatsContext] = js.undefined,
    queryLatencyStats: js.UndefOr[Null | IQueryLatencyStats] = js.undefined
  ): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(queryLatencyStats)) __obj.updateDynamic("queryLatencyStats")(queryLatencyStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
}

