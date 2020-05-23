package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GNF extends js.Object {
  var GNF: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object GNF {
  @scala.inline
  def apply(GNF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GNF = {
    val __obj = js.Dynamic.literal(GNF = GNF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GNF]
  }
}

