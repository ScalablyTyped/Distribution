package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBAM extends js.Object {
  var BAM: js.Array[String]
  var CZK: js.Array[String]
  var PLN: js.Array[String]
  var RSD: js.Array[String]
  var TRY: js.Array[String]
  var USD: js.Array[String]
}

object AnonBAM {
  @scala.inline
  def apply(
    BAM: js.Array[String],
    CZK: js.Array[String],
    PLN: js.Array[String],
    RSD: js.Array[String],
    TRY: js.Array[String],
    USD: js.Array[String]
  ): AnonBAM = {
    val __obj = js.Dynamic.literal(BAM = BAM.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBAM]
  }
}

