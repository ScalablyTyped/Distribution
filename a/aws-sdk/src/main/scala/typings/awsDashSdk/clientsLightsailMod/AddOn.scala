package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddOn extends js.Object {
  /**
    * The name of the add-on.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The next daily time an automatic snapshot will be created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var nextSnapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The daily time when an automatic snapshot is created. The time shown is in HH:00 format, and in Coordinated Universal Time (UTC). The snapshot is automatically created between the time shown and up to 45 minutes after.
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.native
  /**
    * The status of the add-on.
    */
  var status: js.UndefOr[String] = js.native
}

object AddOn {
  @scala.inline
  def apply(
    name: String = null,
    nextSnapshotTimeOfDay: TimeOfDay = null,
    snapshotTimeOfDay: TimeOfDay = null,
    status: String = null
  ): AddOn = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nextSnapshotTimeOfDay != null) __obj.updateDynamic("nextSnapshotTimeOfDay")(nextSnapshotTimeOfDay.asInstanceOf[js.Any])
    if (snapshotTimeOfDay != null) __obj.updateDynamic("snapshotTimeOfDay")(snapshotTimeOfDay.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOn]
  }
}

