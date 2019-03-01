package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextualizedTypeStats extends js.Object {
  /** ContextualizedTypeStats context */
  var context: js.UndefOr[IStatsContext | scala.Null] = js.undefined
  /** ContextualizedTypeStats perTypeStat */
  var perTypeStat: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ITypeStat] | scala.Null] = js.undefined
}

object IContextualizedTypeStats {
  @scala.inline
  def apply(
    context: IStatsContext = null,
    perTypeStat: org.scalablytyped.runtime.StringDictionary[ITypeStat] = null
  ): IContextualizedTypeStats = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (perTypeStat != null) __obj.updateDynamic("perTypeStat")(perTypeStat)
    __obj.asInstanceOf[IContextualizedTypeStats]
  }
}

