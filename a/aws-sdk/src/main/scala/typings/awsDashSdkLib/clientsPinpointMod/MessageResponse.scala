package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponse extends js.Object {
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: __string
  /**
    * A map that contains a multipart response for each address that the message was sent to. In the map, the endpoint ID is the key and the result is the value.
    */
  var EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined
  /**
    * The identifier for the original request that the message was delivered for.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * A map that contains a multipart response for each address (email address, phone number, or push notification token) that the message was sent to. In the map, the address is the key and the result is the value.
    */
  var Result: js.UndefOr[MapOfMessageResult] = js.undefined
}

object MessageResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    EndpointResult: MapOfEndpointMessageResult = null,
    RequestId: __string = null,
    Result: MapOfMessageResult = null
  ): MessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[MessageResponse]
  }
}

