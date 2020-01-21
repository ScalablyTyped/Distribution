package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGNF extends js.Object {
  var GNF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonGNF {
  @scala.inline
  def apply(GNF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonGNF = {
    val __obj = js.Dynamic.literal(GNF = GNF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGNF]
  }
}

