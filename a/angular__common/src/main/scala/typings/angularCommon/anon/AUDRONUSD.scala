package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AUDRONUSD extends js.Object {
  var AUD: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AUDRONUSD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AUDRONUSD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDRONUSD]
  }
}

