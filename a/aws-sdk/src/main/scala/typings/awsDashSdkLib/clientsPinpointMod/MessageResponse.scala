package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageResponse extends js.Object {
  /**
    * Application id of the message.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * A map containing a multi part response for each address, with the endpointId as the key and the result as the value.
    */
  var EndpointResult: js.UndefOr[MapOfEndpointMessageResult] = js.undefined
  /**
    * Original request Id for which this message was delivered.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * A map containing a multi part response for each address, with the address as the key(Email address, phone number or push token) and the result as the value.
    */
  var Result: js.UndefOr[MapOfMessageResult] = js.undefined
}

object MessageResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    EndpointResult: MapOfEndpointMessageResult = null,
    RequestId: __string = null,
    Result: MapOfMessageResult = null
  ): MessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (EndpointResult != null) __obj.updateDynamic("EndpointResult")(EndpointResult)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[MessageResponse]
  }
}

