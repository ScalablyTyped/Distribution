package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to delete.
    */
  var BaselineId: typings.awsDashSdk.clientsSsmMod.BaselineId
}

object DeletePatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): DeletePatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId)
  
    __obj.asInstanceOf[DeletePatchBaselineRequest]
  }
}

