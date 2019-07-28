package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDefaultPatchBaselineResult extends js.Object {
  /**
    * The ID of the default patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.undefined
}

object RegisterDefaultPatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): RegisterDefaultPatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    __obj.asInstanceOf[RegisterDefaultPatchBaselineResult]
  }
}

