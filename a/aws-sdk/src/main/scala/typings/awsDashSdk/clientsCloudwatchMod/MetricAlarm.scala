package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAlarm extends js.Object {
  /**
    * Indicates whether actions should be executed during any changes to the alarm state.
    */
  var ActionsEnabled: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ActionsEnabled] = js.native
  /**
    * The actions to execute when this alarm transitions to the ALARM state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var AlarmActions: js.UndefOr[ResourceList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the alarm.
    */
  var AlarmArn: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmArn] = js.native
  /**
    * The time stamp of the last update to the alarm configuration.
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the alarm.
    */
  var AlarmDescription: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmDescription] = js.native
  /**
    * The name of the alarm.
    */
  var AlarmName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.AlarmName] = js.native
  /**
    * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand.
    */
  var ComparisonOperator: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ComparisonOperator] = js.native
  /**
    * The number of data points that must be breaching to trigger the alarm.
    */
  var DatapointsToAlarm: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.DatapointsToAlarm] = js.native
  /**
    * The dimensions for the metric associated with the alarm.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Dimensions] = js.native
  /**
    * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available.
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.EvaluateLowSampleCountPercentile] = js.native
  /**
    * The number of periods over which data is compared to the specified threshold.
    */
  var EvaluationPeriods: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.EvaluationPeriods] = js.native
  /**
    * The percentile statistic for the metric associated with the alarm. Specify a value between p0.0 and p100.
    */
  var ExtendedStatistic: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ExtendedStatistic] = js.native
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var InsufficientDataActions: js.UndefOr[ResourceList] = js.native
  /**
    * The name of the metric associated with the alarm, if this is an alarm based on a single metric.
    */
  var MetricName: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricName] = js.native
  /**
    * An array of MetricDataQuery structures, used in an alarm based on a metric math expression. Each structure either retrieves a metric or performs a math expression. One item in the Metrics array is the math expression that the alarm watches. This expression by designated by having ReturnValue set to true.
    */
  var Metrics: js.UndefOr[MetricDataQueries] = js.native
  /**
    * The namespace of the metric associated with the alarm.
    */
  var Namespace: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Namespace] = js.native
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an Amazon Resource Name (ARN).
    */
  var OKActions: js.UndefOr[ResourceList] = js.native
  /**
    * The period, in seconds, over which the statistic is applied.
    */
  var Period: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Period] = js.native
  /**
    * An explanation for the alarm state, in text format.
    */
  var StateReason: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.StateReason] = js.native
  /**
    * An explanation for the alarm state, in JSON format.
    */
  var StateReasonData: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.StateReasonData] = js.native
  /**
    * The time stamp of the last update to the alarm state.
    */
  var StateUpdatedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The state value for the alarm.
    */
  var StateValue: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.StateValue] = js.native
  /**
    * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic.
    */
  var Statistic: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Statistic] = js.native
  /**
    * The value to compare with the specified statistic.
    */
  var Threshold: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Threshold] = js.native
  /**
    * In an alarm based on an anomaly detection model, this is the ID of the ANOMALY_DETECTION_BAND function used as the threshold for the alarm.
    */
  var ThresholdMetricId: js.UndefOr[MetricId] = js.native
  /**
    * Sets how this alarm is to handle missing data points. If this parameter is omitted, the default behavior of missing is used.
    */
  var TreatMissingData: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.TreatMissingData] = js.native
  /**
    * The unit of the metric associated with the alarm.
    */
  var Unit: js.UndefOr[StandardUnit] = js.native
}

object MetricAlarm {
  @scala.inline
  def apply(
    ActionsEnabled: js.UndefOr[Boolean] = js.undefined,
    AlarmActions: ResourceList = null,
    AlarmArn: AlarmArn = null,
    AlarmConfigurationUpdatedTimestamp: Timestamp = null,
    AlarmDescription: AlarmDescription = null,
    AlarmName: AlarmName = null,
    ComparisonOperator: ComparisonOperator = null,
    DatapointsToAlarm: Int | Double = null,
    Dimensions: Dimensions = null,
    EvaluateLowSampleCountPercentile: EvaluateLowSampleCountPercentile = null,
    EvaluationPeriods: Int | Double = null,
    ExtendedStatistic: ExtendedStatistic = null,
    InsufficientDataActions: ResourceList = null,
    MetricName: MetricName = null,
    Metrics: MetricDataQueries = null,
    Namespace: Namespace = null,
    OKActions: ResourceList = null,
    Period: Int | Double = null,
    StateReason: StateReason = null,
    StateReasonData: StateReasonData = null,
    StateUpdatedTimestamp: Timestamp = null,
    StateValue: StateValue = null,
    Statistic: Statistic = null,
    Threshold: Int | Double = null,
    ThresholdMetricId: MetricId = null,
    TreatMissingData: TreatMissingData = null,
    Unit: StandardUnit = null
  ): MetricAlarm = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ActionsEnabled)) __obj.updateDynamic("ActionsEnabled")(ActionsEnabled.asInstanceOf[js.Any])
    if (AlarmActions != null) __obj.updateDynamic("AlarmActions")(AlarmActions.asInstanceOf[js.Any])
    if (AlarmArn != null) __obj.updateDynamic("AlarmArn")(AlarmArn.asInstanceOf[js.Any])
    if (AlarmConfigurationUpdatedTimestamp != null) __obj.updateDynamic("AlarmConfigurationUpdatedTimestamp")(AlarmConfigurationUpdatedTimestamp.asInstanceOf[js.Any])
    if (AlarmDescription != null) __obj.updateDynamic("AlarmDescription")(AlarmDescription.asInstanceOf[js.Any])
    if (AlarmName != null) __obj.updateDynamic("AlarmName")(AlarmName.asInstanceOf[js.Any])
    if (ComparisonOperator != null) __obj.updateDynamic("ComparisonOperator")(ComparisonOperator.asInstanceOf[js.Any])
    if (DatapointsToAlarm != null) __obj.updateDynamic("DatapointsToAlarm")(DatapointsToAlarm.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    if (EvaluateLowSampleCountPercentile != null) __obj.updateDynamic("EvaluateLowSampleCountPercentile")(EvaluateLowSampleCountPercentile.asInstanceOf[js.Any])
    if (EvaluationPeriods != null) __obj.updateDynamic("EvaluationPeriods")(EvaluationPeriods.asInstanceOf[js.Any])
    if (ExtendedStatistic != null) __obj.updateDynamic("ExtendedStatistic")(ExtendedStatistic.asInstanceOf[js.Any])
    if (InsufficientDataActions != null) __obj.updateDynamic("InsufficientDataActions")(InsufficientDataActions.asInstanceOf[js.Any])
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName.asInstanceOf[js.Any])
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics.asInstanceOf[js.Any])
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    if (OKActions != null) __obj.updateDynamic("OKActions")(OKActions.asInstanceOf[js.Any])
    if (Period != null) __obj.updateDynamic("Period")(Period.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    if (StateReasonData != null) __obj.updateDynamic("StateReasonData")(StateReasonData.asInstanceOf[js.Any])
    if (StateUpdatedTimestamp != null) __obj.updateDynamic("StateUpdatedTimestamp")(StateUpdatedTimestamp.asInstanceOf[js.Any])
    if (StateValue != null) __obj.updateDynamic("StateValue")(StateValue.asInstanceOf[js.Any])
    if (Statistic != null) __obj.updateDynamic("Statistic")(Statistic.asInstanceOf[js.Any])
    if (Threshold != null) __obj.updateDynamic("Threshold")(Threshold.asInstanceOf[js.Any])
    if (ThresholdMetricId != null) __obj.updateDynamic("ThresholdMetricId")(ThresholdMetricId.asInstanceOf[js.Any])
    if (TreatMissingData != null) __obj.updateDynamic("TreatMissingData")(TreatMissingData.asInstanceOf[js.Any])
    if (Unit != null) __obj.updateDynamic("Unit")(Unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricAlarm]
  }
}

