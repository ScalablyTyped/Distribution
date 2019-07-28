package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterResponse extends js.Object {
  /**
    * A description of the DAX cluster that is being deleted.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsDaxMod.Cluster] = js.undefined
}

object DeleteClusterResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DeleteClusterResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[DeleteClusterResponse]
  }
}

