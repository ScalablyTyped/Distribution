package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @param uid ID of the user or host who joins the channel.  */
trait AnonUidString extends js.Object {
  var uid: String
}

object AnonUidString {
  @scala.inline
  def apply(uid: String): AnonUidString = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonUidString]
  }
}

