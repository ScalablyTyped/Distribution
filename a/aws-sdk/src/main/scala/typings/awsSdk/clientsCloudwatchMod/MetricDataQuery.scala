package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricDataQuery extends StObject {
  
  /**
    * The ID of the account where the metrics are located, if this is a cross-account alarm. Use this field only for PutMetricAlarm operations. It is not used in GetMetricData operations.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.AccountId] = js.undefined
  
  /**
    * This field can contain either a Metrics Insights query, or a metric math expression to be performed on the returned data. For more information about Metrics Insights queries, see Metrics Insights query components and syntax in the Amazon CloudWatch User Guide. A math expression can use the Id of the other metrics or queries to refer to those metrics, and can also use the Id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Within each MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var Expression: js.UndefOr[MetricExpression] = js.undefined
  
  /**
    * A short name used to tie this object to the results in the response. This name must be unique within a single call to GetMetricData. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
    */
  var Id: MetricId
  
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label is shown. If Label is omitted, CloudWatch generates a default. You can put dynamic expressions into a label, so that it is more descriptive. For more information, see Using Dynamic Labels.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
  
  /**
    * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data. Within one MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var MetricStat: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.MetricStat] = js.undefined
  
  /**
    * The granularity, in seconds, of the returned data points. For metrics with regular resolution, a period can be as short as one minute (60 seconds) and must be a multiple of 60. For high-resolution metrics that are collected at intervals of less than one minute, the period can be 1, 5, 10, 30, 60, or any multiple of 60. High-resolution metrics are those metrics stored by a PutMetricData operation that includes a StorageResolution of 1 second.
    */
  var Period: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Period] = js.undefined
  
  /**
    * When used in GetMetricData, this option indicates whether to return the timestamps and raw data values of this metric. If you are performing this call just to do math expressions and do not also need the raw data returned, you can specify False. If you omit this, the default of True is used. When used in PutMetricAlarm, specify True for the one expression result to use as the alarm. For all other metrics and expressions in the same PutMetricAlarm operation, specify ReturnData as False.
    */
  var ReturnData: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ReturnData] = js.undefined
}
object MetricDataQuery {
  
  inline def apply(Id: MetricId): MetricDataQuery = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDataQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricDataQuery] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setExpression(value: MetricExpression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "Expression", js.undefined)
    
    inline def setId(value: MetricId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: MetricLabel): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setMetricStat(value: MetricStat): Self = StObject.set(x, "MetricStat", value.asInstanceOf[js.Any])
    
    inline def setMetricStatUndefined: Self = StObject.set(x, "MetricStat", js.undefined)
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setReturnData(value: ReturnData): Self = StObject.set(x, "ReturnData", value.asInstanceOf[js.Any])
    
    inline def setReturnDataUndefined: Self = StObject.set(x, "ReturnData", js.undefined)
  }
}
