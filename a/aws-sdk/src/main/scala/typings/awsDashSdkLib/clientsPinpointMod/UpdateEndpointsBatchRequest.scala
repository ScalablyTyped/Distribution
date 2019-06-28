package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointsBatchRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var EndpointBatchRequest: awsDashSdkLib.clientsPinpointMod.EndpointBatchRequest
}

object UpdateEndpointsBatchRequest {
  @scala.inline
  def apply(ApplicationId: __string, EndpointBatchRequest: EndpointBatchRequest): UpdateEndpointsBatchRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, EndpointBatchRequest = EndpointBatchRequest)
  
    __obj.asInstanceOf[UpdateEndpointsBatchRequest]
  }
}

