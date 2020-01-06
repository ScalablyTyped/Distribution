package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClustersResponse extends js.Object {
  /**
    * 
    Information on each of the MSK clusters in the response.
    
    */
  var ClusterInfoList: js.UndefOr[__listOfClusterInfo] = js.native
  /**
    * 
    The paginated results marker. When the result of a ListClusters operation is truncated, the call returns NextToken in the response. 
    To get another batch of clusters, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListClustersResponse {
  @scala.inline
  def apply(ClusterInfoList: __listOfClusterInfo = null, NextToken: __string = null): ListClustersResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterInfoList != null) __obj.updateDynamic("ClusterInfoList")(ClusterInfoList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClustersResponse]
  }
}

