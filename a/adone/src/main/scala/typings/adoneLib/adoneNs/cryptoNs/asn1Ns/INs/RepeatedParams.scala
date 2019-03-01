package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepeatedParams extends js.Object {
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[adoneLib.adoneNs.cryptoNs.asn1Ns.Any] = js.undefined
}

object RepeatedParams {
  @scala.inline
  def apply(
    local: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined,
    value: adoneLib.adoneNs.cryptoNs.asn1Ns.Any = null
  ): RepeatedParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RepeatedParams]
  }
}

