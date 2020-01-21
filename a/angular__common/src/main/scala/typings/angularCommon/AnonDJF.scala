package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDJF extends js.Object {
  var DJF: js.Array[String]
  var JPY: js.Array[String]
  var SOS: js.Array[String]
  var USD: js.Array[String]
}

object AnonDJF {
  @scala.inline
  def apply(DJF: js.Array[String], JPY: js.Array[String], SOS: js.Array[String], USD: js.Array[String]): AnonDJF = {
    val __obj = js.Dynamic.literal(DJF = DJF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDJF]
  }
}

