package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEcsClustersRequest extends js.Object {
  /**
    * A list of ARNs, one for each cluster to be described.
    */
  var EcsClusterArns: js.UndefOr[Strings] = js.undefined
  /**
    * To receive a paginated response, use this parameter to specify the maximum number of results to be returned with a single call. If the number of available results exceeds this maximum, the response includes a NextToken value that you can assign to the NextToken request parameter to get the next set of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * If the previous paginated request did not return all of the remaining results, the response object'sNextToken parameter value is set to a token. To retrieve the next set of results, call DescribeEcsClusters again and assign that token to the request object's NextToken parameter. If there are no remaining results, the previous response object's NextToken parameter is set to null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * A stack ID. DescribeEcsClusters returns a description of the cluster that is registered with the stack.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeEcsClustersRequest {
  @scala.inline
  def apply(
    EcsClusterArns: Strings = null,
    MaxResults: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    StackId: String = null
  ): DescribeEcsClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArns != null) __obj.updateDynamic("EcsClusterArns")(EcsClusterArns)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeEcsClustersRequest]
  }
}

