package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBNDCAD extends js.Object {
  var BND: js.Array[String]
  var CAD: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var MXN: js.Array[js.UndefOr[String]]
  var MYR: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[js.UndefOr[String]]
}

object AnonBNDCAD {
  @scala.inline
  def apply(
    BND: js.Array[String],
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]]
  ): AnonBNDCAD = {
    val __obj = js.Dynamic.literal(BND = BND.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBNDCAD]
  }
}

