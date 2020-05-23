package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JMD extends js.Object {
  var JMD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object JMD {
  @scala.inline
  def apply(JMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): JMD = {
    val __obj = js.Dynamic.literal(JMD = JMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JMD]
  }
}

