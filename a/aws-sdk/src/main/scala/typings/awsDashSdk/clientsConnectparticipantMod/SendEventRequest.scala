package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEventRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the participant's connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The content of the event to be sent (for example, message text). This is not yet supported.
    */
  var Content: js.UndefOr[ChatContent] = js.native
  /**
    * The content type of the request. Supported types are:   application/vnd.amazonaws.connect.event.typing   application/vnd.amazonaws.connect.event.connection.acknowledged  
    */
  var ContentType: ChatContentType = js.native
}

object SendEventRequest {
  @scala.inline
  def apply(
    ConnectionToken: ParticipantToken,
    ContentType: ChatContentType,
    ClientToken: ClientToken = null,
    Content: ChatContent = null
  ): SendEventRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendEventRequest]
  }
}

