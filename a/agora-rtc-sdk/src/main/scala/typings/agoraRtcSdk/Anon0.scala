package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: Double | String
}

object Anon0 {
  @scala.inline
  def apply(uid: Double | String): Anon0 = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon0]
  }
}

