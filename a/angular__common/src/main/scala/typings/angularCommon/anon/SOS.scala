package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SOS extends js.Object {
  var BBD: js.Array[String]
  var DJF: js.Array[String]
  var JPY: js.Array[String]
  var SOS: js.Array[String]
  var USD: js.Array[String]
}

object SOS {
  @scala.inline
  def apply(
    BBD: js.Array[String],
    DJF: js.Array[String],
    JPY: js.Array[String],
    SOS: js.Array[String],
    USD: js.Array[String]
  ): SOS = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], DJF = DJF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SOS]
  }
}

