package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNodesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    */
  var ClusterArn: __string
  /**
    * The maximum number of clusters to return in the response. If there are more clusters, the response includes a NextToken parameter.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListNodesRequest {
  @scala.inline
  def apply(
    ClusterArn: __string,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null
  ): ListNodesRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListNodesRequest]
  }
}

