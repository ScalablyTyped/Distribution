package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyReplicationInstanceResponse extends js.Object {
  /**
    * The modified replication instance.
    */
  var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
}

object ModifyReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): ModifyReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance)
    __obj.asInstanceOf[ModifyReplicationInstanceResponse]
  }
}

