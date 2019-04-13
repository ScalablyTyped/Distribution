package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPatchBaselineForPatchGroupResult extends js.Object {
  /**
    * The ID of the patch baseline that should be used for the patch group.
    */
  var BaselineId: js.UndefOr[BaselineId] = js.undefined
  /**
    * The operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  /**
    * The name of the patch group.
    */
  var PatchGroup: js.UndefOr[PatchGroup] = js.undefined
}

object GetPatchBaselineForPatchGroupResult {
  @scala.inline
  def apply(
    BaselineId: BaselineId = null,
    OperatingSystem: OperatingSystem = null,
    PatchGroup: PatchGroup = null
  ): GetPatchBaselineForPatchGroupResult = {
    val __obj = js.Dynamic.literal()
    if (BaselineId != null) __obj.updateDynamic("BaselineId")(BaselineId)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    if (PatchGroup != null) __obj.updateDynamic("PatchGroup")(PatchGroup)
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupResult]
  }
}

