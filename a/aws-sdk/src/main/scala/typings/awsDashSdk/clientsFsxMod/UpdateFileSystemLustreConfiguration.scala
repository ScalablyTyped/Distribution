package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemLustreConfiguration extends js.Object {
  /**
    * The preferred time to perform weekly maintenance, in the UTC time zone.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.native
}

object UpdateFileSystemLustreConfiguration {
  @scala.inline
  def apply(WeeklyMaintenanceStartTime: WeeklyTime = null): UpdateFileSystemLustreConfiguration = {
    val __obj = js.Dynamic.literal()
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemLustreConfiguration]
  }
}

