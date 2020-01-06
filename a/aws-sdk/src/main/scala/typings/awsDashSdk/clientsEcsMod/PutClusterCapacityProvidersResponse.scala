package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutClusterCapacityProvidersResponse extends js.Object {
  var cluster: js.UndefOr[Cluster] = js.native
}

object PutClusterCapacityProvidersResponse {
  @scala.inline
  def apply(cluster: Cluster = null): PutClusterCapacityProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutClusterCapacityProvidersResponse]
  }
}

