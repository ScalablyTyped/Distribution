package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePatchBaselineResult extends js.Object {
  /**
    * The ID of the created patch baseline.
    */
  var BaselineId: js.UndefOr[BaselineId] = js.undefined
}

object CreatePatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): CreatePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    __obj.asInstanceOf[CreatePatchBaselineResult]
  }
}

