package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClusterResponse extends js.Object {
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ClusterInfo] = js.undefined
}

object DescribeClusterResponse {
  @scala.inline
  def apply(ClusterInfo: ClusterInfo = null): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterInfo != null) __obj.updateDynamic("ClusterInfo")(ClusterInfo)
    __obj.asInstanceOf[DescribeClusterResponse]
  }
}

