package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceFilter extends js.Object {
  /**
    * The operator that you want to use to determine whether a service is returned by ListServices. Valid values for Condition include the following:    EQ: When you specify EQ, specify one namespace ID for Values. EQ is the default condition and can be omitted.    IN: When you specify IN, specify a list of the IDs for the namespaces that you want ListServices to return a list of services for.    BETWEEN: Not applicable.  
    */
  var Condition: js.UndefOr[FilterCondition] = js.undefined
  /**
    * Specify NAMESPACE_ID.
    */
  var Name: ServiceFilterName
  /**
    * The values that are applicable to the value that you specify for Condition to filter the list of services.
    */
  var Values: FilterValues
}

object ServiceFilter {
  @scala.inline
  def apply(Name: ServiceFilterName, Values: FilterValues, Condition: FilterCondition = null): ServiceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFilter]
  }
}

