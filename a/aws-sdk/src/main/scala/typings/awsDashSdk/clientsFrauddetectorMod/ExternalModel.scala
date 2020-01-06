package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalModel extends js.Object {
  /**
    * Timestamp of when the model was last created.
    */
  var createdTime: js.UndefOr[time] = js.native
  /**
    * The input configuration.
    */
  var inputConfiguration: js.UndefOr[ModelInputConfiguration] = js.native
  /**
    * Timestamp of when the model was last updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  /**
    * The Amazon SageMaker model endpoints.
    */
  var modelEndpoint: js.UndefOr[String] = js.native
  /**
    * The Amazon Fraud Detector status for the external model endpoint
    */
  var modelEndpointStatus: js.UndefOr[ModelEndpointStatus] = js.native
  /**
    * The source of the model.
    */
  var modelSource: js.UndefOr[ModelSource] = js.native
  /**
    * The output configuration.
    */
  var outputConfiguration: js.UndefOr[ModelOutputConfiguration] = js.native
  /**
    * The role used to invoke the model. 
    */
  var role: js.UndefOr[Role] = js.native
}

object ExternalModel {
  @scala.inline
  def apply(
    createdTime: time = null,
    inputConfiguration: ModelInputConfiguration = null,
    lastUpdatedTime: time = null,
    modelEndpoint: String = null,
    modelEndpointStatus: ModelEndpointStatus = null,
    modelSource: ModelSource = null,
    outputConfiguration: ModelOutputConfiguration = null,
    role: Role = null
  ): ExternalModel = {
    val __obj = js.Dynamic.literal()
    if (createdTime != null) __obj.updateDynamic("createdTime")(createdTime.asInstanceOf[js.Any])
    if (inputConfiguration != null) __obj.updateDynamic("inputConfiguration")(inputConfiguration.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (modelEndpoint != null) __obj.updateDynamic("modelEndpoint")(modelEndpoint.asInstanceOf[js.Any])
    if (modelEndpointStatus != null) __obj.updateDynamic("modelEndpointStatus")(modelEndpointStatus.asInstanceOf[js.Any])
    if (modelSource != null) __obj.updateDynamic("modelSource")(modelSource.asInstanceOf[js.Any])
    if (outputConfiguration != null) __obj.updateDynamic("outputConfiguration")(outputConfiguration.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalModel]
  }
}

