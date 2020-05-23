package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AMD extends js.Object {
  var AMD: js.Array[String]
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AMD {
  @scala.inline
  def apply(AMD: js.Array[String], JPY: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): AMD = {
    val __obj = js.Dynamic.literal(AMD = AMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AMD]
  }
}

