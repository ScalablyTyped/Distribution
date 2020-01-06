package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListClusterOperationsResponse extends js.Object {
  /**
    * 
    An array of cluster operation information objects.
    
    */
  var ClusterOperationInfoList: js.UndefOr[__listOfClusterOperationInfo] = js.native
  /**
    * 
    If the response of ListClusterOperations is truncated, it returns a NextToken in the response. This Nexttoken should be sent in the subsequent request to ListClusterOperations.
    
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object ListClusterOperationsResponse {
  @scala.inline
  def apply(ClusterOperationInfoList: __listOfClusterOperationInfo = null, NextToken: __string = null): ListClusterOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterOperationInfoList != null) __obj.updateDynamic("ClusterOperationInfoList")(ClusterOperationInfoList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListClusterOperationsResponse]
  }
}

