package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CNY extends js.Object {
  var CNY: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object CNY {
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CNY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNY]
  }
}

