package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KES extends js.Object {
  var JPY: js.Array[String]
  var KES: js.Array[String]
  var USD: js.Array[String]
}

object KES {
  @scala.inline
  def apply(JPY: js.Array[String], KES: js.Array[String], USD: js.Array[String]): KES = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KES]
  }
}

