package typings.awsDashSdk.clientsConnectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendMessageResponse extends js.Object {
  /**
    * The time when the message was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  /**
    * The ID of the message.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
}

object SendMessageResponse {
  @scala.inline
  def apply(AbsoluteTime: Instant = null, Id: ChatItemId = null): SendMessageResponse = {
    val __obj = js.Dynamic.literal()
    if (AbsoluteTime != null) __obj.updateDynamic("AbsoluteTime")(AbsoluteTime.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendMessageResponse]
  }
}

