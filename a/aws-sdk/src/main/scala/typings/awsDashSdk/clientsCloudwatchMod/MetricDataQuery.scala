package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDataQuery extends js.Object {
  /**
    * The math expression to be performed on the returned data, if this object is performing a math expression. This expression can use the Id of the other metrics to refer to those metrics, and can also use the Id of other expressions to use the result of those expressions. For more information about metric math expressions, see Metric Math Syntax and Functions in the Amazon CloudWatch User Guide. Within each MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var Expression: js.UndefOr[MetricExpression] = js.undefined
  /**
    * A short name used to tie this object to the results in the response. This name must be unique within a single call to GetMetricData. If you are performing math expressions on this set of data, this name represents that data and can serve as a variable in the mathematical expression. The valid characters are letters, numbers, and underscore. The first character must be a lowercase letter.
    */
  var Id: MetricId
  /**
    * A human-readable label for this metric or expression. This is especially useful if this is an expression, so that you know what the value represents. If the metric or expression is shown in a CloudWatch dashboard widget, the label is shown. If Label is omitted, CloudWatch generates a default.
    */
  var Label: js.UndefOr[MetricLabel] = js.undefined
  /**
    * The metric to be returned, along with statistics, period, and units. Use this parameter only if this object is retrieving a metric and not performing a math expression on returned data. Within one MetricDataQuery object, you must specify either Expression or MetricStat but not both.
    */
  var MetricStat: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.MetricStat] = js.undefined
  /**
    * When used in GetMetricData, this option indicates whether to return the timestamps and raw data values of this metric. If you are performing this call just to do math expressions and do not also need the raw data returned, you can specify False. If you omit this, the default of True is used. When used in PutMetricAlarm, specify True for the one expression result to use as the alarm. For all other metrics and expressions in the same PutMetricAlarm operation, specify ReturnData as False.
    */
  var ReturnData: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ReturnData] = js.undefined
}

object MetricDataQuery {
  @scala.inline
  def apply(
    Id: MetricId,
    Expression: MetricExpression = null,
    Label: MetricLabel = null,
    MetricStat: MetricStat = null,
    ReturnData: js.UndefOr[ReturnData] = js.undefined
  ): MetricDataQuery = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (Expression != null) __obj.updateDynamic("Expression")(Expression)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (MetricStat != null) __obj.updateDynamic("MetricStat")(MetricStat)
    if (!js.isUndefined(ReturnData)) __obj.updateDynamic("ReturnData")(ReturnData)
    __obj.asInstanceOf[MetricDataQuery]
  }
}

