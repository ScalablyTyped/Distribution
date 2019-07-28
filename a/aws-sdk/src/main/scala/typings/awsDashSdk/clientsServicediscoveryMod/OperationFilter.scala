package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationFilter extends js.Object {
  /**
    * The operator that you want to use to determine whether an operation matches the specified value. Valid values for condition include:    EQ: When you specify EQ for the condition, you can specify only one value. EQ is supported for NAMESPACE_ID, SERVICE_ID, STATUS, and TYPE. EQ is the default condition and can be omitted.    IN: When you specify IN for the condition, you can specify a list of one or more values. IN is supported for STATUS and TYPE. An operation must match one of the specified values to be returned in the response.    BETWEEN: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value. BETWEEN is supported for UPDATE_DATE.   
    */
  var Condition: js.UndefOr[FilterCondition] = js.undefined
  /**
    * Specify the operations that you want to get:    NAMESPACE_ID: Gets operations related to specified namespaces.    SERVICE_ID: Gets operations related to specified services.    STATUS: Gets operations based on the status of the operations: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Gets specified types of operation.    UPDATE_DATE: Gets operations that changed status during a specified date/time range.   
    */
  var Name: OperationFilterName
  /**
    * Specify values that are applicable to the value that you specify for Name:     NAMESPACE_ID: Specify one namespace ID.    SERVICE_ID: Specify one service ID.    STATUS: Specify one or more statuses: SUBMITTED, PENDING, SUCCEED, or FAIL.    TYPE: Specify one or more of the following types: CREATE_NAMESPACE, DELETE_NAMESPACE, UPDATE_SERVICE, REGISTER_INSTANCE, or DEREGISTER_INSTANCE.    UPDATE_DATE: Specify a start date and an end date in Unix date/time format and Coordinated Universal Time (UTC). The start date must be the first value.  
    */
  var Values: FilterValues
}

object OperationFilter {
  @scala.inline
  def apply(Name: OperationFilterName, Values: FilterValues, Condition: FilterCondition = null): OperationFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values)
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationFilter]
  }
}

