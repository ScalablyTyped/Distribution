package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualizedStats extends js.Object {
  /** ContextualizedStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  /** ContextualizedStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.undefined
  /** ContextualizedStats queryLatencyStats */
  var queryLatencyStats: js.UndefOr[IQueryLatencyStats | Null] = js.undefined
}

object IContextualizedStats {
  @scala.inline
  def apply(
    context: js.UndefOr[Null | IStatsContext] = js.undefined,
    perTypeStat: js.UndefOr[Null | StringDictionary[ITypeStat]] = js.undefined,
    queryLatencyStats: js.UndefOr[Null | IQueryLatencyStats] = js.undefined
  ): IContextualizedStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(perTypeStat)) __obj.updateDynamic("perTypeStat")(perTypeStat.asInstanceOf[js.Any])
    if (!js.isUndefined(queryLatencyStats)) __obj.updateDynamic("queryLatencyStats")(queryLatencyStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualizedStats]
  }
}

