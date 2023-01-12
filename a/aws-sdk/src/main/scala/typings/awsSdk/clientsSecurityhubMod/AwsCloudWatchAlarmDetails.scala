package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsCloudWatchAlarmDetails extends StObject {
  
  /**
    * Indicates whether actions should be executed during any changes to the alarm state. 
    */
  var ActionsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of actions, specified as Amazon Resource Names (ARNs) to execute when this alarm transitions into an ALARM state from any other state. 
    */
  var AlarmActions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The ARN of the alarm. 
    */
  var AlarmArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The time stamp of the last update to the alarm configuration. 
    */
  var AlarmConfigurationUpdatedTimestamp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The description of the alarm. 
    */
  var AlarmDescription: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the alarm. If you don't specify a name, CloudFront generates a unique physical ID and uses that ID for the alarm name. 
    */
  var AlarmName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The arithmetic operation to use when comparing the specified statistic and threshold. The specified statistic value is used as the first operand. 
    */
  var ComparisonOperator: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of datapoints that must be breaching to trigger the alarm. 
    */
  var DatapointsToAlarm: js.UndefOr[Integer] = js.undefined
  
  /**
    * The dimensions for the metric associated with the alarm. 
    */
  var Dimensions: js.UndefOr[AwsCloudWatchAlarmDimensionsList] = js.undefined
  
  /**
    * Used only for alarms based on percentiles. If ignore, the alarm state does not change during periods with too few data points to be statistically significant. If evaluate or this parameter is not used, the alarm is always evaluated and possibly changes state no matter how many data points are available. 
    */
  var EvaluateLowSampleCountPercentile: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The number of periods over which data is compared to the specified threshold. 
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.undefined
  
  /**
    * The percentile statistic for the metric associated with the alarm. 
    */
  var ExtendedStatistic: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the INSUFFICIENT_DATA state from any other state. Each action is specified as an ARN. 
    */
  var InsufficientDataActions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The name of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm based on a math expression, you use Metrics instead and you can't specify MetricName. 
    */
  var MetricName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The namespace of the metric associated with the alarm. This is required for an alarm based on a metric. For an alarm based on a math expression, you can't specify Namespace and you use Metrics instead. 
    */
  var Namespace: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The actions to execute when this alarm transitions to the OK state from any other state. Each action is specified as an ARN. 
    */
  var OkActions: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The period, in seconds, over which the statistic is applied. This is required for an alarm based on a metric. 
    */
  var Period: js.UndefOr[Integer] = js.undefined
  
  /**
    * The statistic for the metric associated with the alarm, other than percentile. For percentile statistics, use ExtendedStatistic. For an alarm based on a metric, you must specify either Statistic or ExtendedStatistic but not both. For an alarm based on a math expression, you can't specify Statistic. Instead, you use Metrics.
    */
  var Statistic: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The value to compare with the specified statistic. 
    */
  var Threshold: js.UndefOr[Double] = js.undefined
  
  /**
    * n an alarm based on an anomaly detection model, this is the ID of the ANOMALY_DETECTION_BAND function used as the threshold for the alarm. 
    */
  var ThresholdMetricId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Sets how this alarm is to handle missing data points. 
    */
  var TreatMissingData: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The unit of the metric associated with the alarm. 
    */
  var Unit: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsCloudWatchAlarmDetails {
  
  inline def apply(): AwsCloudWatchAlarmDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCloudWatchAlarmDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsCloudWatchAlarmDetails] (val x: Self) extends AnyVal {
    
    inline def setActionsEnabled(value: Boolean): Self = StObject.set(x, "ActionsEnabled", value.asInstanceOf[js.Any])
    
    inline def setActionsEnabledUndefined: Self = StObject.set(x, "ActionsEnabled", js.undefined)
    
    inline def setAlarmActions(value: NonEmptyStringList): Self = StObject.set(x, "AlarmActions", value.asInstanceOf[js.Any])
    
    inline def setAlarmActionsUndefined: Self = StObject.set(x, "AlarmActions", js.undefined)
    
    inline def setAlarmActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "AlarmActions", js.Array(value*))
    
    inline def setAlarmArn(value: NonEmptyString): Self = StObject.set(x, "AlarmArn", value.asInstanceOf[js.Any])
    
    inline def setAlarmArnUndefined: Self = StObject.set(x, "AlarmArn", js.undefined)
    
    inline def setAlarmConfigurationUpdatedTimestamp(value: NonEmptyString): Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAlarmConfigurationUpdatedTimestampUndefined: Self = StObject.set(x, "AlarmConfigurationUpdatedTimestamp", js.undefined)
    
    inline def setAlarmDescription(value: NonEmptyString): Self = StObject.set(x, "AlarmDescription", value.asInstanceOf[js.Any])
    
    inline def setAlarmDescriptionUndefined: Self = StObject.set(x, "AlarmDescription", js.undefined)
    
    inline def setAlarmName(value: NonEmptyString): Self = StObject.set(x, "AlarmName", value.asInstanceOf[js.Any])
    
    inline def setAlarmNameUndefined: Self = StObject.set(x, "AlarmName", js.undefined)
    
    inline def setComparisonOperator(value: NonEmptyString): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setComparisonOperatorUndefined: Self = StObject.set(x, "ComparisonOperator", js.undefined)
    
    inline def setDatapointsToAlarm(value: Integer): Self = StObject.set(x, "DatapointsToAlarm", value.asInstanceOf[js.Any])
    
    inline def setDatapointsToAlarmUndefined: Self = StObject.set(x, "DatapointsToAlarm", js.undefined)
    
    inline def setDimensions(value: AwsCloudWatchAlarmDimensionsList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: AwsCloudWatchAlarmDimensionsDetails*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setEvaluateLowSampleCountPercentile(value: NonEmptyString): Self = StObject.set(x, "EvaluateLowSampleCountPercentile", value.asInstanceOf[js.Any])
    
    inline def setEvaluateLowSampleCountPercentileUndefined: Self = StObject.set(x, "EvaluateLowSampleCountPercentile", js.undefined)
    
    inline def setEvaluationPeriods(value: Integer): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriodsUndefined: Self = StObject.set(x, "EvaluationPeriods", js.undefined)
    
    inline def setExtendedStatistic(value: NonEmptyString): Self = StObject.set(x, "ExtendedStatistic", value.asInstanceOf[js.Any])
    
    inline def setExtendedStatisticUndefined: Self = StObject.set(x, "ExtendedStatistic", js.undefined)
    
    inline def setInsufficientDataActions(value: NonEmptyStringList): Self = StObject.set(x, "InsufficientDataActions", value.asInstanceOf[js.Any])
    
    inline def setInsufficientDataActionsUndefined: Self = StObject.set(x, "InsufficientDataActions", js.undefined)
    
    inline def setInsufficientDataActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "InsufficientDataActions", js.Array(value*))
    
    inline def setMetricName(value: NonEmptyString): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNamespace(value: NonEmptyString): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setOkActions(value: NonEmptyStringList): Self = StObject.set(x, "OkActions", value.asInstanceOf[js.Any])
    
    inline def setOkActionsUndefined: Self = StObject.set(x, "OkActions", js.undefined)
    
    inline def setOkActionsVarargs(value: NonEmptyString*): Self = StObject.set(x, "OkActions", js.Array(value*))
    
    inline def setPeriod(value: Integer): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setStatistic(value: NonEmptyString): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdMetricId(value: NonEmptyString): Self = StObject.set(x, "ThresholdMetricId", value.asInstanceOf[js.Any])
    
    inline def setThresholdMetricIdUndefined: Self = StObject.set(x, "ThresholdMetricId", js.undefined)
    
    inline def setThresholdUndefined: Self = StObject.set(x, "Threshold", js.undefined)
    
    inline def setTreatMissingData(value: NonEmptyString): Self = StObject.set(x, "TreatMissingData", value.asInstanceOf[js.Any])
    
    inline def setTreatMissingDataUndefined: Self = StObject.set(x, "TreatMissingData", js.undefined)
    
    inline def setUnit(value: NonEmptyString): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
