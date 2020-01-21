package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observation extends js.Object {
  /**
    * The time when the observation ended, in epoch seconds.
    */
  var EndTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.EndTime] = js.native
  /**
    * The ID of the observation type.
    */
  var Id: js.UndefOr[ObservationId] = js.native
  /**
    * The timestamp in the CloudWatch Logs that specifies when the matched line occurred.
    */
  var LineTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.LineTime] = js.native
  /**
    * The log filter of the observation.
    */
  var LogFilter: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogFilter] = js.native
  /**
    * The log group name.
    */
  var LogGroup: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogGroup] = js.native
  /**
    * The log text of the observation.
    */
  var LogText: js.UndefOr[typings.awsSdk.applicationinsightsMod.LogText] = js.native
  /**
    * The name of the observation metric.
    */
  var MetricName: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricName] = js.native
  /**
    * The namespace of the observation metric.
    */
  var MetricNamespace: js.UndefOr[typings.awsSdk.applicationinsightsMod.MetricNamespace] = js.native
  /**
    * The source resource ARN of the observation.
    */
  var SourceARN: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceARN] = js.native
  /**
    * The source type of the observation.
    */
  var SourceType: js.UndefOr[typings.awsSdk.applicationinsightsMod.SourceType] = js.native
  /**
    * The time when the observation was first detected, in epoch seconds.
    */
  var StartTime: js.UndefOr[typings.awsSdk.applicationinsightsMod.StartTime] = js.native
  /**
    * The unit of the source observation metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.applicationinsightsMod.Unit] = js.native
  /**
    * The value of the source observation metric.
    */
  var Value: js.UndefOr[typings.awsSdk.applicationinsightsMod.Value] = js.native
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
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LineTime != null) __obj.updateDynamic("LineTime")(LineTime.asInstanceOf[js.Any])
    if (LogFilter != null) __obj.updateDynamic("LogFilter")(LogFilter.asInstanceOf[js.Any])
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup.asInstanceOf[js.Any])
    if (LogText != null) __obj.updateDynamic("LogText")(LogText.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (MetricNamespace != null) __obj.updateDynamic("MetricNamespace")(MetricNamespace.asInstanceOf[js.Any])
    if (SourceARN != null) __obj.updateDynamic("SourceARN")(SourceARN.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Observation]
  }
}

