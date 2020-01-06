package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetModelVersionResult extends js.Object {
  /**
    * The model version description.
    */
  var description: js.UndefOr[typings.awsDashSdk.clientsFrauddetectorMod.description] = js.native
  /**
    * The model ID. 
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type. 
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The model version. 
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The model version status. 
    */
  var status: js.UndefOr[String] = js.native
}

object GetModelVersionResult {
  @scala.inline
  def apply(
    description: description = null,
    modelId: identifier = null,
    modelType: ModelTypeEnum = null,
    modelVersionNumber: nonEmptyString = null,
    status: String = null
  ): GetModelVersionResult = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (modelId != null) __obj.updateDynamic("modelId")(modelId.asInstanceOf[js.Any])
    if (modelType != null) __obj.updateDynamic("modelType")(modelType.asInstanceOf[js.Any])
    if (modelVersionNumber != null) __obj.updateDynamic("modelVersionNumber")(modelVersionNumber.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetModelVersionResult]
  }
}

