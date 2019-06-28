package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessageResponse extends js.Object {
  /**
    * The unique identifier for the application that was used to send the message.
    */
  var ApplicationId: __string
  /**
    * The unique identifier that was assigned to the message request.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * An object that indicates which endpoints the message was sent to, for each user. The object lists user IDs and, for each user ID, provides the endpoint IDs that the message was sent to. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
}

object SendUsersMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    RequestId: __string = null,
    Result: MapOfMapOfEndpointMessageResult = null
  ): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
}

