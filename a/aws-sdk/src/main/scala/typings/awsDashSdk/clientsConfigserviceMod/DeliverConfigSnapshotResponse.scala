package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeliverConfigSnapshotResponse extends js.Object {
  /**
    * The ID of the snapshot that is being created.
    */
  var configSnapshotId: js.UndefOr[String] = js.native
}

object DeliverConfigSnapshotResponse {
  @scala.inline
  def apply(configSnapshotId: String = null): DeliverConfigSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    if (configSnapshotId != null) __obj.updateDynamic("configSnapshotId")(configSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeliverConfigSnapshotResponse]
  }
}

