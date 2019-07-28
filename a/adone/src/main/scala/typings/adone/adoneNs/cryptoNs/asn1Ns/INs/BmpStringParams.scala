package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BmpStringParams extends js.Object {
  var value: js.UndefOr[String] = js.undefined
}

object BmpStringParams {
  @scala.inline
  def apply(value: String = null): BmpStringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[BmpStringParams]
  }
}

