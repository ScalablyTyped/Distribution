package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreStateErrorItem extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The error.
    */
  var Error: js.UndefOr[EnableFastSnapshotRestoreStateError] = js.native
}

object EnableFastSnapshotRestoreStateErrorItem {
  @scala.inline
  def apply(AvailabilityZone: String = null, Error: EnableFastSnapshotRestoreStateError = null): EnableFastSnapshotRestoreStateErrorItem = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (Error != null) __obj.updateDynamic("Error")(Error.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoreStateErrorItem]
  }
}

