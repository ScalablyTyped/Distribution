package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSSP extends js.Object {
  var GBP: js.Array[String]
  var JPY: js.Array[String]
  var SSP: js.Array[String]
  var USD: js.Array[String]
}

object AnonSSP {
  @scala.inline
  def apply(GBP: js.Array[String], JPY: js.Array[String], SSP: js.Array[String], USD: js.Array[String]): AnonSSP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SSP = SSP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSSP]
  }
}

