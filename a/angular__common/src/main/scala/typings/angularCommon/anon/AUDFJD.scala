package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDFJD extends js.Object {
  var AUD: js.Array[String]
  var FJD: js.Array[js.UndefOr[String]]
  var JPY: js.Array[String]
  var NZD: js.Array[String]
  var SBD: js.Array[js.UndefOr[String]]
  var TOP: js.Array[String]
  var USD: js.Array[String]
}

object AUDFJD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    FJD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NZD: js.Array[String],
    SBD: js.Array[js.UndefOr[String]],
    TOP: js.Array[String],
    USD: js.Array[String]
  ): AUDFJD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDFJD]
  }
}

