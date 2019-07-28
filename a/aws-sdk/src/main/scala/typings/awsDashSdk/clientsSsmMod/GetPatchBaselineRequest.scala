package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPatchBaselineRequest extends js.Object {
  /**
    * The ID of the patch baseline to retrieve.
    */
  var BaselineId: typings.awsDashSdk.clientsSsmMod.BaselineId
}

object GetPatchBaselineRequest {
  @scala.inline
  def apply(BaselineId: BaselineId): GetPatchBaselineRequest = {
    val __obj = js.Dynamic.literal(BaselineId = BaselineId)
  
    __obj.asInstanceOf[GetPatchBaselineRequest]
  }
}

