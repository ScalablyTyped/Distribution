package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateModelVersionRequest extends js.Object {
  /**
    * The model version description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The model ID. 
    */
  var modelId: identifier = js.native
  /**
    * The model type.
    */
  var modelType: ModelTypeEnum = js.native
}

object CreateModelVersionRequest {
  @scala.inline
  def apply(modelId: identifier, modelType: ModelTypeEnum, description: description = null): CreateModelVersionRequest = {
    val __obj = js.Dynamic.literal(modelId = modelId.asInstanceOf[js.Any], modelType = modelType.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelVersionRequest]
  }
}

