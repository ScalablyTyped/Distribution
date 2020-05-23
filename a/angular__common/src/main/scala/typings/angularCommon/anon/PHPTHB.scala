package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PHPTHB extends js.Object {
  var PHP: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object PHPTHB {
  @scala.inline
  def apply(PHP: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): PHPTHB = {
    val __obj = js.Dynamic.literal(PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PHPTHB]
  }
}

