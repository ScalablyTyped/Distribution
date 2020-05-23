package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Uid extends js.Object {
  /** The ID of the remote user. */
  var uid: String
}

object Uid {
  @scala.inline
  def apply(uid: String): Uid = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Uid]
  }
}

