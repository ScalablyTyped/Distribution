package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersRequest extends js.Object {
  /**
    * Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    */
  var ClusterNameFilter: js.UndefOr[__string] = js.undefined
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

object ListClustersRequest {
  @scala.inline
  def apply(
    ClusterNameFilter: __string = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null
  ): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterNameFilter != null) __obj.updateDynamic("ClusterNameFilter")(ClusterNameFilter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClustersRequest]
  }
}

