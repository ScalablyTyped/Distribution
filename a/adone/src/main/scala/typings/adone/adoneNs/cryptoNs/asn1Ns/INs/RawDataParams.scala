package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawDataParams extends js.Object {
  var data: js.UndefOr[ArrayBuffer] = js.undefined
}

object RawDataParams {
  @scala.inline
  def apply(data: ArrayBuffer = null): RawDataParams = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[RawDataParams]
  }
}

