package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MZN extends js.Object {
  var JPY: js.Array[String]
  var MZN: js.Array[String]
  var USD: js.Array[String]
}

object MZN {
  @scala.inline
  def apply(JPY: js.Array[String], MZN: js.Array[String], USD: js.Array[String]): MZN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MZN = MZN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MZN]
  }
}

