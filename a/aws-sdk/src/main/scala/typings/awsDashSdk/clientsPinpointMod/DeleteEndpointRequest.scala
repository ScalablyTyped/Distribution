package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEndpointRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string = js.native
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: __string = js.native
}

object DeleteEndpointRequest {
  @scala.inline
  def apply(ApplicationId: __string, EndpointId: __string): DeleteEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEndpointRequest]
  }
}

