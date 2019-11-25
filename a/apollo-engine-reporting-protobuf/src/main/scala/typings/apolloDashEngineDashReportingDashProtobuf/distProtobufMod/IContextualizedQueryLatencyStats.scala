package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

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
  def apply(context: IStatsContext = null, queryLatencyStats: IQueryLatencyStats = null): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (queryLatencyStats != null) __obj.updateDynamic("queryLatencyStats")(queryLatencyStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
}

