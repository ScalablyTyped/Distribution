package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerParams extends js.Object {
  var value: js.UndefOr[scala.Double] = js.undefined
}

object IntegerParams {
  @scala.inline
  def apply(value: scala.Int | scala.Double = null): IntegerParams = {
    val __obj = js.Dynamic.literal()
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerParams]
  }
}

