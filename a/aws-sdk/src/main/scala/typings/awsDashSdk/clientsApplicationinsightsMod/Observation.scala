package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observation extends js.Object {
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.EndTime] = js.undefined
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.undefined
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.LineTime] = js.undefined
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.LogFilter] = js.undefined
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.LogGroup] = js.undefined
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.LogText] = js.undefined
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.MetricName] = js.undefined
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.MetricNamespace] = js.undefined
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.SourceARN] = js.undefined
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.SourceType] = js.undefined
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.StartTime] = js.undefined
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Unit] = js.undefined
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.Value] = js.undefined
}

object Observation {
  @scala.inline
  def apply(
    EndTime: EndTime = null,
    Id: ObservationId = null,
    LineTime: LineTime = null,
    LogFilter: LogFilter = null,
    LogGroup: LogGroup = null,
    LogText: LogText = null,
    MetricName: MetricName = null,
    MetricNamespace: MetricNamespace = null,
    SourceARN: SourceARN = null,
    SourceType: SourceType = null,
    StartTime: StartTime = null,
    Unit: Unit = null,
    Value: Int | Double = null
  ): Observation = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LineTime != null) __obj.updateDynamic("LineTime")(LineTime)
    if (LogFilter != null) __obj.updateDynamic("LogFilter")(LogFilter.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup)
    if (LogText != null) __obj.updateDynamic("LogText")(LogText)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (MetricNamespace != null) __obj.updateDynamic("MetricNamespace")(MetricNamespace)
    if (SourceARN != null) __obj.updateDynamic("SourceARN")(SourceARN)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Unit != null) __obj.updateDynamic("Unit")(Unit)
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
}

