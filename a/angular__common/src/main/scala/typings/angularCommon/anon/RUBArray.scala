package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RUBArray extends js.Object {
  var JPY: js.Array[String]
  var RUB: js.Array[String]
}

object RUBArray {
  @scala.inline
  def apply(JPY: js.Array[String], RUB: js.Array[String]): RUBArray = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[RUBArray]
  }
}

