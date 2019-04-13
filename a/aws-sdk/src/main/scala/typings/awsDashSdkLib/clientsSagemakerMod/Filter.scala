package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  /**
    * A property name. For example, TrainingJobName. For the list of valid property names returned in a search result for each supported resource, see TrainingJob properties. You must specify a valid property name for the resource.
    */
  var Name: ResourcePropertyName
  /**
    * A Boolean binary operator that is used to evaluate the filter. The operator field contains one of the following values:  Equals  The specified resource in Name equals the specified Value.  NotEquals  The specified resource in Name does not equal the specified Value.  GreaterThan  The specified resource in Name is greater than the specified Value. Not supported for text-based properties.  GreaterThanOrEqualTo  The specified resource in Name is greater than or equal to the specified Value. Not supported for text-based properties.  LessThan  The specified resource in Name is less than the specified Value. Not supported for text-based properties.  LessThanOrEqualTo  The specified resource in Name is less than or equal to the specified Value. Not supported for text-based properties.  Contains  Only supported for text-based properties. The word-list of the property contains the specified Value.   If you have specified a filter Value, the default is Equals.
    */
  var Operator: js.UndefOr[Operator] = js.undefined
  /**
    * A value used with Resource and Operator to determine if objects satisfy the filter's condition. For numerical properties, Value must be an integer or floating-point decimal. For timestamp properties, Value must be an ISO 8601 date-time string of the following format: YYYY-mm-dd'T'HH:MM:SS.
    */
  var Value: js.UndefOr[FilterValue] = js.undefined
}

object Filter {
  @scala.inline
  def apply(Name: ResourcePropertyName, Operator: Operator = null, Value: FilterValue = null): Filter = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Filter]
  }
}

