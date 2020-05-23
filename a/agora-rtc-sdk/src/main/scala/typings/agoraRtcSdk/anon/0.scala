package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0` extends js.Object {
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}

object `0` {
  @scala.inline
  def apply(uid: Double | String): `0` = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
}

