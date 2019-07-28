package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecreaseReplicationFactorResponse extends js.Object {
  /**
    * A description of the DAX cluster, after you have decreased its replication factor.
    */
  var Cluster: js.UndefOr[typings.awsDashSdk.clientsDaxMod.Cluster] = js.undefined
}

object DecreaseReplicationFactorResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): DecreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[DecreaseReplicationFactorResponse]
  }
}

