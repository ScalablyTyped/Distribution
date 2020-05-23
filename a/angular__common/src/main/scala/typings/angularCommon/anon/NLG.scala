package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NLG extends js.Object {
  var JPY: js.Array[String]
  var NLG: js.Array[String]
  var RUB: js.Array[String]
  var USD: js.Array[String]
}

object NLG {
  @scala.inline
  def apply(JPY: js.Array[String], NLG: js.Array[String], RUB: js.Array[String], USD: js.Array[String]): NLG = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NLG = NLG.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NLG]
  }
}

