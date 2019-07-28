package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Information about the task invocation results per invocation.
    */
  var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.undefined
}

object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    WindowExecutionTaskInvocationIdentities: MaintenanceWindowExecutionTaskInvocationIdentityList = null
  ): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (WindowExecutionTaskInvocationIdentities != null) __obj.updateDynamic("WindowExecutionTaskInvocationIdentities")(WindowExecutionTaskInvocationIdentities)
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
  }
}

