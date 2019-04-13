package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicaUpdate extends js.Object {
  /**
    * The parameters required for creating a replica on an existing global table.
    */
  var Create: js.UndefOr[CreateReplicaAction] = js.undefined
  /**
    * The name of the existing replica to be removed.
    */
  var Delete: js.UndefOr[DeleteReplicaAction] = js.undefined
}

object ReplicaUpdate {
  @scala.inline
  def apply(Create: CreateReplicaAction = null, Delete: DeleteReplicaAction = null): ReplicaUpdate = {
    val __obj = js.Dynamic.literal()
    if (Create != null) __obj.updateDynamic("Create")(Create)
    if (Delete != null) __obj.updateDynamic("Delete")(Delete)
    __obj.asInstanceOf[ReplicaUpdate]
  }
}

