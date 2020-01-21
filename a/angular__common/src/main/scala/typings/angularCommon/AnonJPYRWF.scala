package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJPYRWF extends js.Object {
  var JPY: js.Array[String]
  var RWF: js.Array[String]
  var USD: js.Array[String]
}

object AnonJPYRWF {
  @scala.inline
  def apply(JPY: js.Array[String], RWF: js.Array[String], USD: js.Array[String]): AnonJPYRWF = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJPYRWF]
  }
}

