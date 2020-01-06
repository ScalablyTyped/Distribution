package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster to delete.
    */
  var cluster: String = js.native
}

object DeleteClusterRequest {
  @scala.inline
  def apply(cluster: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteClusterRequest]
  }
}

