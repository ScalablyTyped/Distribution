package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KESTHB extends js.Object {
  var CDF: js.Array[String]
  var JPY: js.Array[String]
  var KES: js.Array[String]
  var THB: js.Array[String]
  var TWD: js.Array[String]
  var TZS: js.Array[String]
  var USD: js.Array[String]
}

object KESTHB {
  @scala.inline
  def apply(
    CDF: js.Array[String],
    JPY: js.Array[String],
    KES: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    TZS: js.Array[String],
    USD: js.Array[String]
  ): KESTHB = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KESTHB]
  }
}

