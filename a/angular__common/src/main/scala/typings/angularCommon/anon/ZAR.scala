package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZAR extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var ZAR: js.Array[String]
}

object ZAR {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], ZAR: js.Array[String]): ZAR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZAR]
  }
}

