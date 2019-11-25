package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

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
  def apply(context: IStatsContext = null, perTypeStat: StringDictionary[ITypeStat] = null): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (perTypeStat != null) __obj.updateDynamic("perTypeStat")(perTypeStat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
}

