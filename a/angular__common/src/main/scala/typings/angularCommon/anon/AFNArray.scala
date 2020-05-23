package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AFNArray extends js.Object {
  var AFN: js.Array[String]
  var JPY: js.Array[String]
}

object AFNArray {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String]): AFNArray = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNArray]
  }
}

