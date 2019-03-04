package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMeta extends js.Object {
  var pid: scala.Double
  var uid: scala.Double
}

object UserMeta {
  @scala.inline
  def apply(pid: scala.Double, uid: scala.Double): UserMeta = {
    val __obj = js.Dynamic.literal(pid = pid, uid = uid)
  
    __obj.asInstanceOf[UserMeta]
  }
}

