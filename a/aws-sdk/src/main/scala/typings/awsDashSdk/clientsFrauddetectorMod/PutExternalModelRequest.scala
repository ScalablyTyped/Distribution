package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutExternalModelRequest extends js.Object {
  /**
    * The model endpoint input configuration.
    */
  var inputConfiguration: ModelInputConfiguration = js.native
  /**
    * The model endpoints name.
    */
  var modelEndpoint: String = js.native
  /**
    * The model endpoint’s status in Amazon Fraud Detector.
    */
  var modelEndpointStatus: ModelEndpointStatus = js.native
  /**
    * The source of the model.
    */
  var modelSource: ModelSource = js.native
  /**
    * The model endpoint output configuration.
    */
  var outputConfiguration: ModelOutputConfiguration = js.native
  /**
    * The IAM role used to invoke the model endpoint.
    */
  var role: Role = js.native
}

object PutExternalModelRequest {
  @scala.inline
  def apply(
    inputConfiguration: ModelInputConfiguration,
    modelEndpoint: String,
    modelEndpointStatus: ModelEndpointStatus,
    modelSource: ModelSource,
    outputConfiguration: ModelOutputConfiguration,
    role: Role
  ): PutExternalModelRequest = {
    val __obj = js.Dynamic.literal(inputConfiguration = inputConfiguration.asInstanceOf[js.Any], modelEndpoint = modelEndpoint.asInstanceOf[js.Any], modelEndpointStatus = modelEndpointStatus.asInstanceOf[js.Any], modelSource = modelSource.asInstanceOf[js.Any], outputConfiguration = outputConfiguration.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutExternalModelRequest]
  }
}

