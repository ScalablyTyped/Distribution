package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageRequest extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsConnectparticipantMod.ClientToken] = js.native
  /**
    * The authentication token associated with the connection.
    */
  var ConnectionToken: ParticipantToken = js.native
  /**
    * The content of the message.
    */
  var Content: ChatContent = js.native
  /**
    * The type of the content. Supported types are text/plain.
    */
  var ContentType: ChatContentType = js.native
}

object SendMessageRequest {
  @scala.inline
  def apply(
    ConnectionToken: ParticipantToken,
    Content: ChatContent,
    ContentType: ChatContentType,
    ClientToken: ClientToken = null
  ): SendMessageRequest = {
    val __obj = js.Dynamic.literal(ConnectionToken = ConnectionToken.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageRequest]
  }
}

