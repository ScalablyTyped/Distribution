package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteReplicationInstanceResponse extends js.Object {
  /**
    * The replication instance that was deleted.
    */
  var ReplicationInstance: js.UndefOr[ReplicationInstance] = js.undefined
}

object DeleteReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): DeleteReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance)
    __obj.asInstanceOf[DeleteReplicationInstanceResponse]
  }
}

