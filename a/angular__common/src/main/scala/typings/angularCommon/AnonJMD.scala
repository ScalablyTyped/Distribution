package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJMD extends js.Object {
  var JMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonJMD {
  @scala.inline
  def apply(JMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonJMD = {
    val __obj = js.Dynamic.literal(JMD = JMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonJMD]
  }
}

