package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYRUB extends js.Object {
  var JPY: js.Array[String]
  var RUB: js.Array[String]
  var USD: js.Array[String]
}

object JPYRUB {
  @scala.inline
  def apply(JPY: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): JPYRUB = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYRUB]
  }
}

