package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRemediationExecutionStatusResponse extends js.Object {
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[StringWithCharLimit256] = js.undefined
  /**
    * Returns a list of remediation execution statuses objects.
    */
  var RemediationExecutionStatuses: js.UndefOr[RemediationExecutionStatuses] = js.undefined
}

object DescribeRemediationExecutionStatusResponse {
  @scala.inline
  def apply(
    NextToken: StringWithCharLimit256 = null,
    RemediationExecutionStatuses: RemediationExecutionStatuses = null
  ): DescribeRemediationExecutionStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RemediationExecutionStatuses != null) __obj.updateDynamic("RemediationExecutionStatuses")(RemediationExecutionStatuses)
    __obj.asInstanceOf[DescribeRemediationExecutionStatusResponse]
  }
}

