package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeliverConfigSnapshotResponse extends js.Object {
  /**
    * The ID of the snapshot that is being created.
    */
  var configSnapshotId: js.UndefOr[String] = js.undefined
}

object DeliverConfigSnapshotResponse {
  @scala.inline
  def apply(configSnapshotId: String = null): DeliverConfigSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    if (configSnapshotId != null) __obj.updateDynamic("configSnapshotId")(configSnapshotId)
    __obj.asInstanceOf[DeliverConfigSnapshotResponse]
  }
}

