package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /** Event code. */
  var code: scala.Double
  /** Event message. */
  var msg: java.lang.String
  /** The uid of the user who experiences the exception or recovery event. */
  var uid: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: scala.Double, msg: java.lang.String, uid: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, msg = msg, uid = uid)
  
    __obj.asInstanceOf[Anon_Code]
  }
}

