package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: __string = js.native
  var EndpointRequest: typings.awsDashSdk.clientsPinpointMod.EndpointRequest = js.native
}

object UpdateEndpointRequest {
  @scala.inline
  def apply(ApplicationId: __string, EndpointId: __string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
}

