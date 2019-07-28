package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterRequest extends js.Object {
  /**
    * The identifier (ID) of the cluster that you are deleting. To find the cluster ID, use DescribeClusters.
    */
  var ClusterId: typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterId: ClusterId): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

