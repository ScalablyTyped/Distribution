package typings.agoraRtcSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  /** Event code. */
  var code: Double
  /** Event message. */
  var msg: String
  /** The uid of the user who experiences the exception or recovery event. */
  var uid: String
}

object AnonCode {
  @scala.inline
  def apply(code: Double, msg: String, uid: String): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

