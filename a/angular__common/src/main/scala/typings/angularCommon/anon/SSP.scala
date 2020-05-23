package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSP extends js.Object {
  var GBP: js.Array[String]
  var JPY: js.Array[String]
  var SSP: js.Array[String]
  var USD: js.Array[String]
}

object SSP {
  @scala.inline
  def apply(GBP: js.Array[String], JPY: js.Array[String], SSP: js.Array[String], USD: js.Array[String]): SSP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SSP = SSP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSP]
  }
}

