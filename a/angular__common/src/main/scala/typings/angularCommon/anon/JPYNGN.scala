package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYNGN extends js.Object {
  var JPY: js.Array[String]
  var NGN: js.Array[String]
  var RUB: js.Array[String]
}

object JPYNGN {
  @scala.inline
  def apply(JPY: js.Array[String], NGN: js.Array[String], RUB: js.Array[String]): JPYNGN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NGN = NGN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYNGN]
  }
}

