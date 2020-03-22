package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUid extends js.Object {
  /** The ID of the remote user. */
  var uid: String
}

object AnonUid {
  @scala.inline
  def apply(uid: String): AnonUid = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUid]
  }
}

