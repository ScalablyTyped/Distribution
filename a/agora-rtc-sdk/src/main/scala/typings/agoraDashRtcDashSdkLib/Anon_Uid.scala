package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Uid extends js.Object {
  /** The corresponding uid of the stream being republished or re-subscribed to. */
  var uid: scala.Double | java.lang.String
}

object Anon_Uid {
  @scala.inline
  def apply(uid: scala.Double | java.lang.String): Anon_Uid = {
    val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Uid]
  }
}

