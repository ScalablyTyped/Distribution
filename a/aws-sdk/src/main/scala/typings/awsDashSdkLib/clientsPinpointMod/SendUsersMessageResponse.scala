package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendUsersMessageResponse extends js.Object {
  /**
    * The unique ID of the Amazon Pinpoint project used to send the message.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The unique ID assigned to the users-messages request.
    */
  var RequestId: js.UndefOr[__string] = js.undefined
  /**
    * An object that shows the endpoints that were messaged for each user. The object provides a list of user IDs. For each user ID, it provides the endpoint IDs that were messaged. For each endpoint ID, it provides an EndpointMessageResult object.
    */
  var Result: js.UndefOr[MapOfMapOfEndpointMessageResult] = js.undefined
}

object SendUsersMessageResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    RequestId: __string = null,
    Result: MapOfMapOfEndpointMessageResult = null
  ): SendUsersMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    __obj.asInstanceOf[SendUsersMessageResponse]
  }
}

