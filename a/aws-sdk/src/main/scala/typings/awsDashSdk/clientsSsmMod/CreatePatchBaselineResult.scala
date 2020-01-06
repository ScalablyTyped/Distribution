package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePatchBaselineResult extends js.Object {
  /**
    * The ID of the created patch baseline.
    */
  var BaselineId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.BaselineId] = js.native
}

object CreatePatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): CreatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePatchBaselineResult]
  }
}

