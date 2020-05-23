package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LAK extends js.Object {
  var JPY: js.Array[String]
  var LAK: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[String]
}

object LAK {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    LAK: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): LAK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LAK = LAK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LAK]
  }
}

