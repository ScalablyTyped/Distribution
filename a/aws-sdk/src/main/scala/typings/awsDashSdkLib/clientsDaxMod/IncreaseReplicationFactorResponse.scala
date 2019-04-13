package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncreaseReplicationFactorResponse extends js.Object {
  /**
    * A description of the DAX cluster. with its new replication factor.
    */
  var Cluster: js.UndefOr[Cluster] = js.undefined
}

object IncreaseReplicationFactorResponse {
  @scala.inline
  def apply(Cluster: Cluster = null): IncreaseReplicationFactorResponse = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster)
    __obj.asInstanceOf[IncreaseReplicationFactorResponse]
  }
}

