package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSnapshotDetails extends js.Object {
  /**
    * The timestamp when the automatic snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.undefined
  /**
    * The date of the automatic snapshot in YYYY-MM-DD format.
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * An array of objects that describe the block storage disks attached to the instance when the automatic snapshot was created.
    */
  var fromAttachedDisks: js.UndefOr[AttachedDiskList] = js.undefined
  /**
    * The status of the automatic snapshot.
    */
  var status: js.UndefOr[AutoSnapshotStatus] = js.undefined
}

object AutoSnapshotDetails {
  @scala.inline
  def apply(
    createdAt: IsoDate = null,
    date: String = null,
    fromAttachedDisks: AttachedDiskList = null,
    status: AutoSnapshotStatus = null
  ): AutoSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt)
    if (date != null) __obj.updateDynamic("date")(date)
    if (fromAttachedDisks != null) __obj.updateDynamic("fromAttachedDisks")(fromAttachedDisks)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoSnapshotDetails]
  }
}

