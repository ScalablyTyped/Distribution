package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDefaultPatchBaselineResult extends js.Object {
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.undefined
  /**
    * The operating system for the returned patch baseline. 
    */
  var OperatingSystem: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OperatingSystem] = js.undefined
}

object GetDefaultPatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null, OperatingSystem: OperatingSystem = null): GetDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultPatchBaselineResult]
  }
}

