package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UZS extends js.Object {
  var JPY: js.Array[String]
  var THB: js.Array[String]
  var USD: js.Array[String]
  var UZS: js.Array[String]
}

object UZS {
  @scala.inline
  def apply(JPY: js.Array[String], THB: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): UZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UZS]
  }
}

