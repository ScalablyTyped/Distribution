package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKESUGX extends js.Object {
  var JPY: js.Array[String]
  var KES: js.Array[String]
  var UGX: js.Array[String]
  var USD: js.Array[String]
}

object AnonKESUGX {
  @scala.inline
  def apply(JPY: js.Array[String], KES: js.Array[String], UGX: js.Array[String], USD: js.Array[String]): AnonKESUGX = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], UGX = UGX.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKESUGX]
  }
}

