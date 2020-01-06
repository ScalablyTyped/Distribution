package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterResponse extends js.Object {
  /**
    * Information about the cluster that was created.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Cluster] = js.native
}

object CreateClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): CreateClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterResponse]
  }
}

