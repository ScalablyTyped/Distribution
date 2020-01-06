package typings.awsDashSdk.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClusterResponse extends js.Object {
  /**
    * 
    The cluster information.
    
    */
  var ClusterInfo: js.UndefOr[typings.awsDashSdk.clientsKafkaMod.ClusterInfo] = js.native
}

object DescribeClusterResponse {
  @scala.inline
  def apply(ClusterInfo: ClusterInfo = null): DescribeClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (ClusterInfo != null) __obj.updateDynamic("ClusterInfo")(ClusterInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClusterResponse]
  }
}

