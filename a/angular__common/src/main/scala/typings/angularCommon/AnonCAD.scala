package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCAD extends js.Object {
  var CAD: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var MXN: js.Array[js.UndefOr[String]]
  var NAD: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var USD: js.Array[js.UndefOr[String]]
  var ZAR: js.Array[String]
}

object AnonCAD {
  @scala.inline
  def apply(
    CAD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    NAD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]],
    ZAR: js.Array[String]
  ): AnonCAD = {
    val __obj = js.Dynamic.literal(CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZAR = ZAR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCAD]
  }
}

