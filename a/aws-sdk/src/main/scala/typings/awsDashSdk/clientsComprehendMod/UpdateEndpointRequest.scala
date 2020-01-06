package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointRequest extends js.Object {
  /**
    *  The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: InferenceUnitsInteger = js.native
  /**
    * The Amazon Resource Number (ARN) of the endpoint being updated.
    */
  var EndpointArn: ComprehendEndpointArn = js.native
}

object UpdateEndpointRequest {
  @scala.inline
  def apply(DesiredInferenceUnits: InferenceUnitsInteger, EndpointArn: ComprehendEndpointArn): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(DesiredInferenceUnits = DesiredInferenceUnits.asInstanceOf[js.Any], EndpointArn = EndpointArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
}

