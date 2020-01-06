package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterResponse extends js.Object {
  /**
    * The full description of the cluster to delete.
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object DeleteClusterResponse {
  @scala.inline
  def apply(cluster: Cluster = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

