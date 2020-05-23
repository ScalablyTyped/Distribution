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
trait Reason extends js.Object {
  var reason: String
  var uid: String
}

object Reason {
  @scala.inline
  def apply(reason: String, uid: String): Reason = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

