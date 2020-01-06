package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The name of the cluster to be deleted.
    */
  var ClusterName: String = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

