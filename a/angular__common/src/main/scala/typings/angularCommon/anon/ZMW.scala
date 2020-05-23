package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZMW extends js.Object {
  var JPY: js.Array[String]
  var USD: js.Array[String]
  var ZMW: js.Array[String]
}

object ZMW {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], ZMW: js.Array[String]): ZMW = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZMW]
  }
}

