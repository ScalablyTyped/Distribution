package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonALL extends js.Object {
  var ALL: js.Array[String]
  var JPY: js.Array[String]
  var MKD: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
}

object AnonALL {
  @scala.inline
  def apply(
    ALL: js.Array[String],
    JPY: js.Array[String],
    MKD: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String]
  ): AnonALL = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MKD = MKD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonALL]
  }
}

