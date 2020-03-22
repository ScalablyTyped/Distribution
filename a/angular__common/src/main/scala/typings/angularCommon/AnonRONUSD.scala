package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRONUSD extends js.Object {
  var JPY: js.Array[String]
  var RON: js.Array[String]
  var USD: js.Array[String]
}

object AnonRONUSD {
  @scala.inline
  def apply(JPY: js.Array[String], RON: js.Array[String], USD: js.Array[String]): AnonRONUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRONUSD]
  }
}

