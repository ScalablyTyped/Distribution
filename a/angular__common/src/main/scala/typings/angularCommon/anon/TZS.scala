package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TZS extends js.Object {
  var JPY: js.Array[String]
  var TZS: js.Array[String]
  var USD: js.Array[String]
}

object TZS {
  @scala.inline
  def apply(JPY: js.Array[String], TZS: js.Array[String], USD: js.Array[String]): TZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TZS = TZS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TZS]
  }
}

