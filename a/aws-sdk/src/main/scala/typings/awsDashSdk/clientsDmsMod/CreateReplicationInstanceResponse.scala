package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationInstanceResponse extends js.Object {
  /**
    * The replication instance that was created.
    */
  var ReplicationInstance: js.UndefOr[typings.awsDashSdk.clientsDmsMod.ReplicationInstance] = js.undefined
}

object CreateReplicationInstanceResponse {
  @scala.inline
  def apply(ReplicationInstance: ReplicationInstance = null): CreateReplicationInstanceResponse = {
    val __obj = js.Dynamic.literal()
    if (ReplicationInstance != null) __obj.updateDynamic("ReplicationInstance")(ReplicationInstance)
    __obj.asInstanceOf[CreateReplicationInstanceResponse]
  }
}

