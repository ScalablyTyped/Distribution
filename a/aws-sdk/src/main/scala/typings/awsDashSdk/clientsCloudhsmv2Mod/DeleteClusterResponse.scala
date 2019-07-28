package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterResponse extends js.Object {
  /**
    * Information about the cluster that was deleted.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Cluster] = js.undefined
}

object DeleteClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

