package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEndpointRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  /**
    * The unique ID of the endpoint.
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

