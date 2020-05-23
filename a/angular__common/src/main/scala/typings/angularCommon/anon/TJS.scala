package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TJS extends js.Object {
  var JPY: js.Array[String]
  var TJS: js.Array[String]
}

object TJS {
  @scala.inline
  def apply(JPY: js.Array[String], TJS: js.Array[String]): TJS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TJS = TJS.asInstanceOf[js.Any])
    __obj.asInstanceOf[TJS]
  }
}

