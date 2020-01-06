package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster that is being deleted.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsDaxMod.Cluster] = js.native
}

object DeleteClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

