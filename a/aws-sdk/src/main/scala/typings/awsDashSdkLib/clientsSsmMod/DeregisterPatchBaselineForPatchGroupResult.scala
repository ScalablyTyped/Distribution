package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline the patch group was deregistered from.
    */
  var BaselineId: js.UndefOr[BaselineId] = js.undefined
  /**
    * The name of the patch group deregistered from the patch baseline.
    */
  var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
}

object DeregisterPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(BaselineId: BaselineId = null, PatchGroup: PatchGroup = null): DeregisterPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup)
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupResult]
  }
}

