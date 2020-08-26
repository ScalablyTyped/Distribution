package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @param uid ID of the remote user.
  * @param reason Reason why the user goes offline.
  * - "Quit": The user calls {@link Client.leave} and leaves the channel.
  * - "ServerTimeOut": The user drops offline.
  * - "BecomeAudience": The client role switches from `"host"` to `"audience"`.
  */
@js.native
trait Reason extends js.Object {
  var reason: String = js.native
  var uid: String = js.native
}

object Reason {
  @scala.inline
  def apply(reason: String, uid: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  @scala.inline
  implicit class ReasonOps[Self <: Reason] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

