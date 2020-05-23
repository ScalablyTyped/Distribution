package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KZT extends js.Object {
  var JPY: js.Array[String]
  var KZT: js.Array[String]
  var RUB: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object KZT {
  @scala.inline
  def apply(
    JPY: js.Array[String],
    KZT: js.Array[String],
    RUB: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): KZT = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KZT = KZT.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KZT]
  }
}

