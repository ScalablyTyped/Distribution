package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CNYArray extends js.Object {
  var CNY: js.Array[String]
  var JPY: js.Array[String]
}

object CNYArray {
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String]): CNYArray = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYArray]
  }
}

