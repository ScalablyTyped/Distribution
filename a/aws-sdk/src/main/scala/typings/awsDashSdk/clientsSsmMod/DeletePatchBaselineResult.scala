package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePatchBaselineResult extends js.Object {
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.undefined
}

object DeletePatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): DeletePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    __obj.asInstanceOf[DeletePatchBaselineResult]
  }
}

