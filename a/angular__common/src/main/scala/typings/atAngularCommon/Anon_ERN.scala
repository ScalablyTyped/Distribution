package typings.atAngularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ERN extends js.Object {
  var ERN: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object Anon_ERN {
  @scala.inline
  def apply(ERN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): Anon_ERN = {
    val __obj = js.Dynamic.literal(ERN = ERN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ERN]
  }
}

