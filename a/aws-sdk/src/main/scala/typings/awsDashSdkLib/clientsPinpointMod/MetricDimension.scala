package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDimension extends js.Object {
  /**
    * The operator to use when comparing metric values. Valid values are: GREATER_THAN, LESS_THAN, GREATER_THAN_OR_EQUAL, LESS_THAN_OR_EQUAL, and EQUAL.
    */
  var ComparisonOperator: __string
  /**
    * The value to compare.
    */
  var Value: __double
}

object MetricDimension {
  @scala.inline
  def apply(ComparisonOperator: __string, Value: __double): MetricDimension = {
    val __obj = js.Dynamic.literal(ComparisonOperator = ComparisonOperator, Value = Value)
  
    __obj.asInstanceOf[MetricDimension]
  }
}

