package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCNYJPYArray extends js.Object {
  var CNY: js.Array[String]
  var JPY: js.Array[String]
}

object AnonCNYJPYArray {
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String]): AnonCNYJPYArray = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCNYJPYArray]
  }
}

