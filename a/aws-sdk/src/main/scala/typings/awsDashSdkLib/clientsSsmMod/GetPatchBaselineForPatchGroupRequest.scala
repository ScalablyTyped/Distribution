package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * Returns he operating system rule specified for patch groups using the patch baseline.
    */
  var OperatingSystem: js.UndefOr[OperatingSystem] = js.undefined
  /**
    * The name of the patch group whose patch baseline should be retrieved.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
}

object GetPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(PatchGroup: PatchGroup, OperatingSystem: OperatingSystem = null): GetPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(PatchGroup = PatchGroup)
    if (OperatingSystem != null) __obj.updateDynamic("OperatingSystem")(OperatingSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatchBaselineForPatchGroupRequest]
  }
}

