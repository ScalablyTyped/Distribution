package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonESPJPY extends js.Object {
  var ESP: js.Array[String]
  var JPY: js.Array[String]
  var KMF: js.Array[js.UndefOr[String]]
  var MXN: js.Array[String]
  var RUB: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
}

object AnonESPJPY {
  @scala.inline
  def apply(
    ESP: js.Array[String],
    JPY: js.Array[String],
    KMF: js.Array[js.UndefOr[String]],
    MXN: js.Array[String],
    RUB: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): AnonESPJPY = {
    val __obj = js.Dynamic.literal(ESP = ESP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KMF = KMF.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonESPJPY]
  }
}

