package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualizedQueryLatencyStats extends js.Object {
  /** ContextualizedQueryLatencyStats context */
  var context: js.UndefOr[IStatsContext | scala.Null] = js.undefined
  /** ContextualizedQueryLatencyStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | scala.Null] = js.undefined
}

object IContextualizedQueryLatencyStats {
  @scala.inline
  def apply(context: IStatsContext = null, queryLatencyStats: IQueryLatencyStats = null): IContextualizedQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (queryLatencyStats != null) __obj.updateDynamic("queryLatencyStats")(queryLatencyStats)
    __obj.asInstanceOf[IContextualizedQueryLatencyStats]
  }
}

