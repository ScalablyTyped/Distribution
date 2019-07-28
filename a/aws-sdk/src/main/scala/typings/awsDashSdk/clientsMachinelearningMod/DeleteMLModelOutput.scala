package typings.awsDashSdk.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMLModelOutput extends js.Object {
  /**
    * A user-supplied ID that uniquely identifies the MLModel. This value should be identical to the value of the MLModelID in the request.
    */
  var MLModelId: js.UndefOr[EntityId] = js.undefined
}

object DeleteMLModelOutput {
  @scala.inline
  def apply(MLModelId: EntityId = null): DeleteMLModelOutput = {
    val __obj = js.Dynamic.literal()
    if (MLModelId != null) __obj.updateDynamic("MLModelId")(MLModelId)
    __obj.asInstanceOf[DeleteMLModelOutput]
  }
}

