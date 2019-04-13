package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the endpoint.
    */
  var EndpointId: __string
  var EndpointRequest: awsDashSdkLib.clientsPinpointMod.EndpointRequest
}

object UpdateEndpointRequest {
  @scala.inline
  def apply(ApplicationId: __string, EndpointId: __string, EndpointRequest: EndpointRequest): UpdateEndpointRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EndpointId = EndpointId, EndpointRequest = EndpointRequest)
  
    __obj.asInstanceOf[UpdateEndpointRequest]
  }
}

