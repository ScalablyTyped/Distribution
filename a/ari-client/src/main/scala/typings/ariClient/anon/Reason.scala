package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  var channelId: String
  var reason: js.UndefOr[String] = js.undefined
}

object Reason {
  @scala.inline
  def apply(channelId: String, reason: String = null): Reason = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

