package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAUDMOP extends js.Object {
  var AUD: js.Array[String]
  var MOP: js.Array[String]
  var RON: js.Array[js.UndefOr[String]]
  var USD: js.Array[String]
  var XXX: js.Array[scala.Nothing]
}

object AnonAUDMOP {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    MOP: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AnonAUDMOP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAUDMOP]
  }
}

