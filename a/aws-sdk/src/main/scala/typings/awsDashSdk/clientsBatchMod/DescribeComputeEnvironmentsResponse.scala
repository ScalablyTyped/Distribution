package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComputeEnvironmentsResponse extends js.Object {
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.native
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeComputeEnvironmentsResponse {
  @scala.inline
  def apply(computeEnvironments: ComputeEnvironmentDetailList = null, nextToken: String = null): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (computeEnvironments != null) __obj.updateDynamic("computeEnvironments")(computeEnvironments.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
}

