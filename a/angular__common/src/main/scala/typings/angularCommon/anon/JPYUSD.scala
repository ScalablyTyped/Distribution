package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JPYUSD extends js.Object {
  var AFN: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object JPYUSD {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): JPYUSD = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYUSD]
  }
}

