package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootReplicationInstanceResponse extends js.Object {
  /**
    * The replication instance that is being rebooted. 
    */
  var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
}

object RebootReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): RebootReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance)
    __obj.asInstanceOf[RebootReplicationInstanceResponse]
  }
}

