package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TRY extends js.Object {
  var JPY: js.Array[String]
  var TRY: js.Array[String]
  var USD: js.Array[String]
}

object TRY {
  @scala.inline
  def apply(JPY: js.Array[String], TRY: js.Array[String], USD: js.Array[String]): TRY = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TRY]
  }
}

