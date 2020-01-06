package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEndpointRequest extends js.Object {
  /**
    * An idempotency token provided by the customer. If this token matches a previous endpoint creation request, Amazon Comprehend will not return a ResourceInUseException. 
    */
  var ClientRequestToken: js.UndefOr[ClientRequestTokenString] = js.native
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger = js.native
  /**
    * This is the descriptive suffix that becomes part of the EndpointArn used for all subsequent requests to this resource. 
    */
  var EndpointName: ComprehendEndpointName = js.native
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint will be attached.
    */
  var ModelArn: ComprehendModelArn = js.native
  /**
    * Tags associated with the endpoint being created. A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales" as the key might be added to an endpoint to indicate its use by the sales department. 
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateEndpointRequest {
  @scala.inline
  def apply(
    DesiredInferenceUnits: InferenceUnitsInteger,
    EndpointName: ComprehendEndpointName,
    ModelArn: ComprehendModelArn,
    ClientRequestToken: ClientRequestTokenString = null,
    Tags: TagList = null
  ): CreateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], ModelArn = ModelArn.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEndpointRequest]
  }
}

