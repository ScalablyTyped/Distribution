package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.adone.Anon_IsIndefiniteForm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalLengthBlockParams extends js.Object {
  var lenBlock: js.UndefOr[Anon_IsIndefiniteForm] = js.undefined
}

object LocalLengthBlockParams {
  @scala.inline
  def apply(lenBlock: Anon_IsIndefiniteForm = null): LocalLengthBlockParams = {
    val __obj = js.Dynamic.literal()
    if (lenBlock != null) __obj.updateDynamic("lenBlock")(lenBlock)
    __obj.asInstanceOf[LocalLengthBlockParams]
  }
}

