package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodeAuthorizationMessageResponse extends js.Object {
  /**
    * An XML document that contains the decoded message.
    */
  var DecodedMessage: js.UndefOr[decodedMessageType] = js.native
}

object DecodeAuthorizationMessageResponse {
  @scala.inline
  def apply(DecodedMessage: decodedMessageType = null): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (DecodedMessage != null) __obj.updateDynamic("DecodedMessage")(DecodedMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
}

