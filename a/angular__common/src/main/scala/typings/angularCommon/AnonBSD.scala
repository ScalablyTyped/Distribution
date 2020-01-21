package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBSD extends js.Object {
  var BSD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBSD {
  @scala.inline
  def apply(BSD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonBSD = {
    val __obj = js.Dynamic.literal(BSD = BSD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBSD]
  }
}

