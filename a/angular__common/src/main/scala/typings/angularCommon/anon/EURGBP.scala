package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EURGBP extends js.Object {
  var EUR: js.Array[js.UndefOr[String]]
  var GBP: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object EURGBP {
  @scala.inline
  def apply(
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    USD: js.Array[String]
  ): EURGBP = {
    val __obj = js.Dynamic.literal(EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[EURGBP]
  }
}

