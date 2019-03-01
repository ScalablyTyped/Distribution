package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniversalStringParams extends js.Object {
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object UniversalStringParams {
  @scala.inline
  def apply(value: java.lang.String = null): UniversalStringParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[UniversalStringParams]
  }
}

