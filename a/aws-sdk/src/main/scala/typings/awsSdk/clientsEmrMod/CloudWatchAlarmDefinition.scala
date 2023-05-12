package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloudWatchAlarmDefinition extends StObject {
  
  /**
    * Determines how the metric specified by MetricName is compared to the value specified by Threshold.
    */
  var ComparisonOperator: typings.awsSdk.clientsEmrMod.ComparisonOperator
  
  /**
    * A CloudWatch metric dimension.
    */
  var Dimensions: js.UndefOr[MetricDimensionList] = js.undefined
  
  /**
    * The number of periods, in five-minute increments, during which the alarm condition must exist before the alarm triggers automatic scaling activity. The default value is 1.
    */
  var EvaluationPeriods: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the CloudWatch metric that is watched to determine an alarm condition.
    */
  var MetricName: String
  
  /**
    * The namespace for the CloudWatch metric. The default is AWS/ElasticMapReduce.
    */
  var Namespace: js.UndefOr[String] = js.undefined
  
  /**
    * The period, in seconds, over which the statistic is applied. CloudWatch metrics for Amazon EMR are emitted every five minutes (300 seconds), so if you specify a CloudWatch metric, specify 300.
    */
  var Period: Integer
  
  /**
    * The statistic to apply to the metric associated with the alarm. The default is AVERAGE.
    */
  var Statistic: js.UndefOr[typings.awsSdk.clientsEmrMod.Statistic] = js.undefined
  
  /**
    * The value against which the specified statistic is compared.
    */
  var Threshold: NonNegativeDouble
  
  /**
    * The unit of measure associated with the CloudWatch metric being watched. The value specified for Unit must correspond to the units specified in the CloudWatch metric.
    */
  var Unit: js.UndefOr[typings.awsSdk.clientsEmrMod.Unit] = js.undefined
}
object CloudWatchAlarmDefinition {
  
  inline def apply(
    ComparisonOperator: ComparisonOperator,
    MetricName: String,
    Period: Integer,
    Threshold: NonNegativeDouble
  ): CloudWatchAlarmDefinition = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator.asInstanceOf[js.Any], MetricName = MetricName.asInstanceOf[js.Any], Period = Period.asInstanceOf[js.Any], Threshold = Threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchAlarmDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloudWatchAlarmDefinition] (val x: Self) extends AnyVal {
    
    inline def setComparisonOperator(value: ComparisonOperator): Self = StObject.set(x, "ComparisonOperator", value.asInstanceOf[js.Any])
    
    inline def setDimensions(value: MetricDimensionList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: MetricDimension*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setEvaluationPeriods(value: Integer): Self = StObject.set(x, "EvaluationPeriods", value.asInstanceOf[js.Any])
    
    inline def setEvaluationPeriodsUndefined: Self = StObject.set(x, "EvaluationPeriods", js.undefined)
    
    inline def setMetricName(value: String): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: String): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "Namespace", js.undefined)
    
    inline def setPeriod(value: Integer): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setStatistic(value: Statistic): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
    
    inline def setThreshold(value: NonNegativeDouble): Self = StObject.set(x, "Threshold", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: Unit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
