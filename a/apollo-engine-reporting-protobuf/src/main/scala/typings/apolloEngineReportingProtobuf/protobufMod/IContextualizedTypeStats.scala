package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualizedTypeStats extends js.Object {
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | Null] = js.undefined
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[StringDictionary[ITypeStat] | Null] = js.undefined
}

object IContextualizedTypeStats {
  @scala.inline
  def apply(
    context: js.UndefOr[Null | IStatsContext] = js.undefined,
    perTypeStat: js.UndefOr[Null | StringDictionary[ITypeStat]] = js.undefined
  ): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(context)) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(perTypeStat)) __obj.updateDynamic("perTypeStat")(perTypeStat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
}

