package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KYD extends js.Object {
  var JPY: js.Array[String]
  var KYD: js.Array[String]
  var USD: js.Array[String]
}

object KYD {
  @scala.inline
  def apply(JPY: js.Array[String], KYD: js.Array[String], USD: js.Array[String]): KYD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KYD = KYD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KYD]
  }
}

