package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeConfigurationOptionsFilter extends js.Object {
  /**
    * The name of the element to filter.
    */
  var Name: js.UndefOr[NodeConfigurationOptionsFilterName] = js.undefined
  /**
    * The filter operator. If filter Name is NodeType only the 'in' operator is supported. Provide one value to evaluate for 'eq', 'lt', 'le', 'gt', and 'ge'. Provide two values to evaluate for 'between'. Provide a list of values for 'in'.
    */
  var Operator: js.UndefOr[OperatorType] = js.undefined
  /**
    * List of values. Compare Name using Operator to Values. If filter Name is NumberOfNodes, then values can range from 0 to 200. If filter Name is EstimatedDiskUtilizationPercent, then values can range from 0 to 100. For example, filter NumberOfNodes (name) GT (operator) 3 (values).
    */
  var Values: js.UndefOr[ValueStringList] = js.undefined
}

object NodeConfigurationOptionsFilter {
  @scala.inline
  def apply(
    Name: NodeConfigurationOptionsFilterName = null,
    Operator: OperatorType = null,
    Values: ValueStringList = null
  ): NodeConfigurationOptionsFilter = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[NodeConfigurationOptionsFilter]
  }
}

