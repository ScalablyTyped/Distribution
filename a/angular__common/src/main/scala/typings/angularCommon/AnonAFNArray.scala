package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAFNArray extends js.Object {
  var AFN: js.Array[String]
  var JPY: js.Array[String]
}

object AnonAFNArray {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String]): AnonAFNArray = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAFNArray]
  }
}

