package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsReport extends js.Object {
  /** StatsReport endTime */
  var endTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** StatsReport header */
  var header: js.UndefOr[IReportHeader | scala.Null] = js.undefined
  /** StatsReport legacyPerQueryImplicitOperationName */
  var legacyPerQueryImplicitOperationName: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IQueryStats] | scala.Null] = js.undefined
  /** StatsReport memStats */
  var memStats: js.UndefOr[IMemStats | scala.Null] = js.undefined
  /** StatsReport perQuery */
  var perQuery: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IQueryStats] | scala.Null] = js.undefined
  /** StatsReport realtimeDuration */
  var realtimeDuration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** StatsReport startTime */
  var startTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** StatsReport timeStats */
  var timeStats: js.UndefOr[ITimeStats | scala.Null] = js.undefined
  /** StatsReport type */
  var `type`: js.UndefOr[js.Array[IType] | scala.Null] = js.undefined
}

object IStatsReport {
  @scala.inline
  def apply(
    endTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null,
    header: IReportHeader = null,
    legacyPerQueryImplicitOperationName: org.scalablytyped.runtime.StringDictionary[IQueryStats] = null,
    memStats: IMemStats = null,
    perQuery: org.scalablytyped.runtime.StringDictionary[IQueryStats] = null,
    realtimeDuration: scala.Int | scala.Double = null,
    startTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null,
    timeStats: ITimeStats = null,
    `type`: js.Array[IType] = null
  ): IStatsReport = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (header != null) __obj.updateDynamic("header")(header)
    if (legacyPerQueryImplicitOperationName != null) __obj.updateDynamic("legacyPerQueryImplicitOperationName")(legacyPerQueryImplicitOperationName)
    if (memStats != null) __obj.updateDynamic("memStats")(memStats)
    if (perQuery != null) __obj.updateDynamic("perQuery")(perQuery)
    if (realtimeDuration != null) __obj.updateDynamic("realtimeDuration")(realtimeDuration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (timeStats != null) __obj.updateDynamic("timeStats")(timeStats)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[IStatsReport]
  }
}

