package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsReport extends js.Object {
  /** StatsReport endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** StatsReport header */
  var header: js.UndefOr[IReportHeader | Null] = js.undefined
  /** StatsReport legacyPerQueryImplicitOperationName */
  var legacyPerQueryImplicitOperationName: js.UndefOr[StringDictionary[IQueryStats] | Null] = js.undefined
  /** StatsReport memStats */
  var memStats: js.UndefOr[IMemStats | Null] = js.undefined
  /** StatsReport perQuery */
  var perQuery: js.UndefOr[StringDictionary[IQueryStats] | Null] = js.undefined
  /** StatsReport realtimeDuration */
  var realtimeDuration: js.UndefOr[Double | Null] = js.undefined
  /** StatsReport startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** StatsReport timeStats */
  var timeStats: js.UndefOr[ITimeStats | Null] = js.undefined
  /** StatsReport type */
  var `type`: js.UndefOr[js.Array[IType] | Null] = js.undefined
}

object IStatsReport {
  @scala.inline
  def apply(
    endTime: ITimestamp = null,
    header: IReportHeader = null,
    legacyPerQueryImplicitOperationName: StringDictionary[IQueryStats] = null,
    memStats: IMemStats = null,
    perQuery: StringDictionary[IQueryStats] = null,
    realtimeDuration: Int | Double = null,
    startTime: ITimestamp = null,
    timeStats: ITimeStats = null,
    `type`: js.Array[IType] = null
  ): IStatsReport = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (legacyPerQueryImplicitOperationName != null) __obj.updateDynamic("legacyPerQueryImplicitOperationName")(legacyPerQueryImplicitOperationName.asInstanceOf[js.Any])
    if (memStats != null) __obj.updateDynamic("memStats")(memStats.asInstanceOf[js.Any])
    if (perQuery != null) __obj.updateDynamic("perQuery")(perQuery.asInstanceOf[js.Any])
    if (realtimeDuration != null) __obj.updateDynamic("realtimeDuration")(realtimeDuration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timeStats != null) __obj.updateDynamic("timeStats")(timeStats.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatsReport]
  }
}

