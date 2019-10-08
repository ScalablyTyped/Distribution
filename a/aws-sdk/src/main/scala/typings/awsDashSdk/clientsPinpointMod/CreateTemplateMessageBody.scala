package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTemplateMessageBody extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the message template.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The message that's returned from the API.
    */
  var Message: js.UndefOr[__string] = js.undefined
  /**
    * The unique identifier for the request or response.
    */
  var RequestID: js.UndefOr[__string] = js.undefined
}

object CreateTemplateMessageBody {
  @scala.inline
  def apply(Arn: __string = null, Message: __string = null, RequestID: __string = null): CreateTemplateMessageBody = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID)
    __obj.asInstanceOf[CreateTemplateMessageBody]
  }
}

