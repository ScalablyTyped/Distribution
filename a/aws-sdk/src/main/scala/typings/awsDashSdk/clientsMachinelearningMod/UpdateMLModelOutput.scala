package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMLModelOutput extends js.Object {
  /**
    * The ID assigned to the MLModel during creation. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.native
}

object UpdateMLModelOutput {
  @scala.inline
  def apply(MLModelId: EntityId = null): UpdateMLModelOutput = {
    val __obj = js.Dynamic.literal()
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateMLModelOutput]
  }
}

