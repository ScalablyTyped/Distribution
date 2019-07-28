package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserMeta extends js.Object {
  var pid: Double
  var uid: Double
}

object UserMeta {
  @scala.inline
  def apply(pid: Double, uid: Double): UserMeta = {
    val __obj = js.Dynamic.literal(pid = pid, uid = uid)
  
    __obj.asInstanceOf[UserMeta]
  }
}

