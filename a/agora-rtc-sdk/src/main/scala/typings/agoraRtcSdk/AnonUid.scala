package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUid extends js.Object {
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}

object AnonUid {
  @scala.inline
  def apply(uid: Double | String): AnonUid = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUid]
  }
}

