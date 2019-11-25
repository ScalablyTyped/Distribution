package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** Event code. */
  var code: Double
  /** Event message. */
  var msg: String
  /** The uid of the user who experiences the exception or recovery event. */
  var uid: String
}

object Anon_Code {
  @scala.inline
  def apply(code: Double, msg: String, uid: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Code]
  }
}

