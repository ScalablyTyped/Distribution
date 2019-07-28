package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComputeEnvironmentsResponse extends js.Object {
  /**
    * The list of compute environments.
    */
  var computeEnvironments: js.UndefOr[ComputeEnvironmentDetailList] = js.undefined
  /**
    * The nextToken value to include in a future DescribeComputeEnvironments request. When the results of a DescribeJobDefinitions request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object DescribeComputeEnvironmentsResponse {
  @scala.inline
  def apply(computeEnvironments: ComputeEnvironmentDetailList = null, nextToken: String = null): DescribeComputeEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (computeEnvironments != null) __obj.updateDynamic("computeEnvironments")(computeEnvironments)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeComputeEnvironmentsResponse]
  }
}

