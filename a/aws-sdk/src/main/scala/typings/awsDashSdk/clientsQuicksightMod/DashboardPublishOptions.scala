package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DashboardPublishOptions extends js.Object {
  /**
    * Ad hoc (one-time) filtering option.
    */
  var AdHocFilteringOption: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.AdHocFilteringOption] = js.native
  /**
    * Export to .csv option.
    */
  var ExportToCSVOption: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.ExportToCSVOption] = js.native
  /**
    * Sheet controls option.
    */
  var SheetControlsOption: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.SheetControlsOption] = js.native
}

object DashboardPublishOptions {
  @scala.inline
  def apply(
    AdHocFilteringOption: AdHocFilteringOption = null,
    ExportToCSVOption: ExportToCSVOption = null,
    SheetControlsOption: SheetControlsOption = null
  ): DashboardPublishOptions = {
    val __obj = js.Dynamic.literal()
    if (AdHocFilteringOption != null) __obj.updateDynamic("AdHocFilteringOption")(AdHocFilteringOption.asInstanceOf[js.Any])
    if (ExportToCSVOption != null) __obj.updateDynamic("ExportToCSVOption")(ExportToCSVOption.asInstanceOf[js.Any])
    if (SheetControlsOption != null) __obj.updateDynamic("SheetControlsOption")(SheetControlsOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardPublishOptions]
  }
}

