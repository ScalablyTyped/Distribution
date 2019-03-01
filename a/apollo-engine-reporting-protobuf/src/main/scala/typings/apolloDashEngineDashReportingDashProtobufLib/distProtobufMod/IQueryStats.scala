package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryStats extends js.Object {
  /** QueryStats perClientName */
  var perClientName: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IClientNameStats] | scala.Null] = js.undefined
  /** QueryStats perType */
  var perType: js.UndefOr[js.Array[ITypeStat] | scala.Null] = js.undefined
  /** QueryStats perTypeStat */
  var perTypeStat: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ITypeStat] | scala.Null] = js.undefined
  /** QueryStats queryStatsWithContext */
  var queryStatsWithContext: js.UndefOr[js.Array[IContextualizedQueryLatencyStats] | scala.Null] = js.undefined
  /** QueryStats typeStatsWithContext */
  var typeStatsWithContext: js.UndefOr[js.Array[IContextualizedTypeStats] | scala.Null] = js.undefined
}

object IQueryStats {
  @scala.inline
  def apply(
    perClientName: org.scalablytyped.runtime.StringDictionary[IClientNameStats] = null,
    perType: js.Array[ITypeStat] = null,
    perTypeStat: org.scalablytyped.runtime.StringDictionary[ITypeStat] = null,
    queryStatsWithContext: js.Array[IContextualizedQueryLatencyStats] = null,
    typeStatsWithContext: js.Array[IContextualizedTypeStats] = null
  ): IQueryStats = {
    val __obj = js.Dynamic.literal()
    if (perClientName != null) __obj.updateDynamic("perClientName")(perClientName)
    if (perType != null) __obj.updateDynamic("perType")(perType)
    if (perTypeStat != null) __obj.updateDynamic("perTypeStat")(perTypeStat)
    if (queryStatsWithContext != null) __obj.updateDynamic("queryStatsWithContext")(queryStatsWithContext)
    if (typeStatsWithContext != null) __obj.updateDynamic("typeStatsWithContext")(typeStatsWithContext)
    __obj.asInstanceOf[IQueryStats]
  }
}

