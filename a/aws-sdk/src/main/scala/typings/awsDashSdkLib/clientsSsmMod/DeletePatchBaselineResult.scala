package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePatchBaselineResult extends js.Object {
  /**
    * The ID of the deleted patch baseline.
    */
  var BaselineId: js.UndefOr[BaselineId] = js.undefined
}

object DeletePatchBaselineResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null): DeletePatchBaselineResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    __obj.asInstanceOf[DeletePatchBaselineResult]
  }
}

