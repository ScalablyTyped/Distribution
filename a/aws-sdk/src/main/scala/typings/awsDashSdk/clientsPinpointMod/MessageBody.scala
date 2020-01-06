package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageBody extends js.Object {
  /**
    * The message that's returned from the API.
    */
  var Message: js.UndefOr[__string] = js.native
  /**
    * The unique identifier for the request or response.
    */
  var RequestID: js.UndefOr[__string] = js.native
}

object MessageBody {
  @scala.inline
  def apply(Message: __string = null, RequestID: __string = null): MessageBody = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (RequestID != null) __obj.updateDynamic("RequestID")(RequestID.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBody]
  }
}

