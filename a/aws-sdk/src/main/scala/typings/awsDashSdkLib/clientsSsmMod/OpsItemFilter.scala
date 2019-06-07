package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsItemFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var Key: OpsItemFilterKey
  /**
    * The operator used by the filter call.
    */
  var Operator: OpsItemFilterOperator
  /**
    * The filter value.
    */
  var Values: OpsItemFilterValues
}

object OpsItemFilter {
  @scala.inline
  def apply(Key: OpsItemFilterKey, Operator: OpsItemFilterOperator, Values: OpsItemFilterValues): OpsItemFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values)
  
    __obj.asInstanceOf[OpsItemFilter]
  }
}

