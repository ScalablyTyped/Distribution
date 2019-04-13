package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterPatchBaselineForPatchGroupRequest extends js.Object {
  /**
    * The ID of the patch baseline to register the patch group with.
    */
  var BaselineId: awsDashSdkLib.clientsSsmMod.BaselineId
  /**
    * The name of the patch group that should be registered with the patch baseline.
    */
  var PatchGroup: awsDashSdkLib.clientsSsmMod.PatchGroup
}

object RegisterPatchBaselineForPatchGroupRequest {
  @scala.inline
  def apply(BaselineId: BaselineId, PatchGroup: PatchGroup): RegisterPatchBaselineForPatchGroupRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId, PatchGroup = PatchGroup)
  
    __obj.asInstanceOf[RegisterPatchBaselineForPatchGroupRequest]
  }
}

