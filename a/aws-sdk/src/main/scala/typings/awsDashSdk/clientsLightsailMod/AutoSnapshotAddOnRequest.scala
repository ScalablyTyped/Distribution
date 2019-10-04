package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoSnapshotAddOnRequest extends js.Object {
  /**
    * The daily time when an automatic snapshot will be created. Constraints:   Must be in HH:00 format, and in an hourly increment.   Specified in Coordinated Universal Time (UTC).   The snapshot will be automatically created between the time specified and up to 45 minutes after.  
    */
  var snapshotTimeOfDay: js.UndefOr[TimeOfDay] = js.undefined
}

object AutoSnapshotAddOnRequest {
  @scala.inline
  def apply(snapshotTimeOfDay: TimeOfDay = null): AutoSnapshotAddOnRequest = {
    val __obj = js.Dynamic.literal()
    if (snapshotTimeOfDay != null) __obj.updateDynamic("snapshotTimeOfDay")(snapshotTimeOfDay)
    __obj.asInstanceOf[AutoSnapshotAddOnRequest]
  }
}

