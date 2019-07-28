package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LustreFileSystemConfiguration extends js.Object {
  var DataRepositoryConfiguration: js.UndefOr[typings.awsDashSdk.clientsFsxMod.DataRepositoryConfiguration] = js.undefined
  /**
    * The UTC time that you want to begin your weekly maintenance window.
    */
  var WeeklyMaintenanceStartTime: js.UndefOr[WeeklyTime] = js.undefined
}

object LustreFileSystemConfiguration {
  @scala.inline
  def apply(
    DataRepositoryConfiguration: DataRepositoryConfiguration = null,
    WeeklyMaintenanceStartTime: WeeklyTime = null
  ): LustreFileSystemConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DataRepositoryConfiguration != null) __obj.updateDynamic("DataRepositoryConfiguration")(DataRepositoryConfiguration)
    if (WeeklyMaintenanceStartTime != null) __obj.updateDynamic("WeeklyMaintenanceStartTime")(WeeklyMaintenanceStartTime)
    __obj.asInstanceOf[LustreFileSystemConfiguration]
  }
}

