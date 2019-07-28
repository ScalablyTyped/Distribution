package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterOperationResponse extends js.Object {
  /**
    * 
    Cluster operation information
    
    */
  var ClusterOperationInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ClusterOperationInfo] = js.undefined
}

object DescribeClusterOperationResponse {
  @scala.inline
  def apply(ClusterOperationInfo: ClusterOperationInfo = null): DescribeClusterOperationResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterOperationInfo != null) __obj.updateDynamic("ClusterOperationInfo")(ClusterOperationInfo)
    __obj.asInstanceOf[DescribeClusterOperationResponse]
  }
}

