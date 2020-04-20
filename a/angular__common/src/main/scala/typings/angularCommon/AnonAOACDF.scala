package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAOACDF extends js.Object {
  var AOA: js.Array[String]
  var CDF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonAOACDF {
  @scala.inline
  def apply(AOA: js.Array[String], CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonAOACDF = {
    val __obj = js.Dynamic.literal(AOA = AOA.asInstanceOf[js.Any], CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAOACDF]
  }
}

