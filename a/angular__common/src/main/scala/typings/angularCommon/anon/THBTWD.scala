package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait THBTWD extends js.Object {
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object THBTWD {
  @scala.inline
  def apply(THB: js.Array[String], TWD: js.Array[String]): THBTWD = {
    val __obj = js.Dynamic.literal(THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[THBTWD]
  }
}

