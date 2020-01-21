package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYSLL extends js.Object {
  var JPY: js.Array[String]
  var SLL: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYSLL {
  @scala.inline
  def apply(JPY: js.Array[String], SLL: js.Array[String], USD: js.Array[String]): AnonJPYSLL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SLL = SLL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYSLL]
  }
}

