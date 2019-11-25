package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @param uid ID of the user or host who joins the channel.  */
trait Anon_UidString extends js.Object {
  var uid: String
}

object Anon_UidString {
  @scala.inline
  def apply(uid: String): Anon_UidString = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_UidString]
  }
}

