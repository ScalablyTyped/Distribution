package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBBDBMD extends js.Object {
  var BBD: js.Array[String]
  var BMD: js.Array[String]
  var BOB: js.Array[String]
  var BZD: js.Array[String]
  var CAD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBBDBMD {
  @scala.inline
  def apply(
    BBD: js.Array[String],
    BMD: js.Array[String],
    BOB: js.Array[String],
    BZD: js.Array[String],
    CAD: js.Array[String],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): AnonBBDBMD = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], BMD = BMD.asInstanceOf[js.Any], BOB = BOB.asInstanceOf[js.Any], BZD = BZD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBBDBMD]
  }
}

