package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCNY extends js.Object {
  var CNY: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonCNY {
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonCNY = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCNY]
  }
}

