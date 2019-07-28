package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the endpoint.
    */
  var EndpointId: __string
}

object GetEndpointRequest {
  @scala.inline
  def apply(ApplicationId: __string, EndpointId: __string): GetEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EndpointId = EndpointId)
  
    __obj.asInstanceOf[GetEndpointRequest]
  }
}

