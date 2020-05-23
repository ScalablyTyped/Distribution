package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MYR extends js.Object {
  var JPY: js.Array[String]
  var MYR: js.Array[String]
  var USD: js.Array[String]
}

object MYR {
  @scala.inline
  def apply(JPY: js.Array[String], MYR: js.Array[String], USD: js.Array[String]): MYR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MYR]
  }
}

