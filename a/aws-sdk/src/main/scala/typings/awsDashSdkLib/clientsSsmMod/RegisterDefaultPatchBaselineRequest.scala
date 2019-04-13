package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterDefaultPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline that should be the default patch baseline.
    */
  var BaselineId: awsDashSdkLib.clientsSsmMod.BaselineId
}

object RegisterDefaultPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): RegisterDefaultPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId)
  
    __obj.asInstanceOf[RegisterDefaultPatchBaselineRequest]
  }
}

