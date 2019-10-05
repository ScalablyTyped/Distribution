package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListClustersRequest extends js.Object {
  /**
    * 
    Specify a prefix of the name of the clusters that you want to list. The service lists all the clusters whose names start with this prefix.
    
    */
  var ClusterNameFilter: js.UndefOr[__string] = js.undefined
  /**
    * 
    The maximum number of results to return in the response. If there are more results, the response includes a NextToken parameter.
    
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.MaxResults] = js.undefined
  /**
    * 
    The paginated results marker. When the result of the operation is truncated, the call returns NextToken in the response. 
    To get the next batch, provide this token in your next request.
    
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListClustersRequest {
  @scala.inline
  def apply(ClusterNameFilter: __string = null, MaxResults: Int | Double = null, NextToken: __string = null): ListClustersRequest = {
    val __obj = js.Dynamic.literal()
    if (ClusterNameFilter != null) __obj.updateDynamic("ClusterNameFilter")(ClusterNameFilter)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListClustersRequest]
  }
}

