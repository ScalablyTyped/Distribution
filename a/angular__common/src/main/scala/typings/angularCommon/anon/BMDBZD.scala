package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BMDBZD extends js.Object {
  var BBD: js.Array[String]
  var BMD: js.Array[String]
  var BZD: js.Array[String]
  var CAD: js.Array[String]
  var JPY: js.Array[String]
}

object BMDBZD {
  @scala.inline
  def apply(
    BBD: js.Array[String],
    BMD: js.Array[String],
    BZD: js.Array[String],
    CAD: js.Array[String],
    JPY: js.Array[String]
  ): BMDBZD = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], BMD = BMD.asInstanceOf[js.Any], BZD = BZD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[BMDBZD]
  }
}

