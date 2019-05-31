package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClusterOperationsRequest extends js.Object {
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    
    */
  var ClusterArn: __string
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListClusterOperationsRequest {
  @scala.inline
  def apply(
    ClusterArn: __string,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null
  ): ListClusterOperationsRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClusterOperationsRequest]
  }
}

