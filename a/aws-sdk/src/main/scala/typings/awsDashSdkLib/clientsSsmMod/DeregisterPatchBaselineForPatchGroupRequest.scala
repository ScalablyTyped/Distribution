package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeregisterPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * The ID of the patch baseline to deregister the patch group from.
    */
  var BaselineId: awsDashSdkLib.clientsSsmMod.BaselineId
  /**
    * The name of the patch group that should be deregistered from the patch baseline.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
}

object DeregisterPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): DeregisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId, PatchGroup = PatchGroup)
  
    __obj.asInstanceOf[DeregisterPatchBaselineForPatchGroupRequest]
  }
}

