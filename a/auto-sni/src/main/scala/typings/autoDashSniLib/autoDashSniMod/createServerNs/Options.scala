package typings
package autoDashSniLib.autoDashSniMod.createServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var agreeTos: scala.Boolean
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var domains: js.Array[java.lang.String | js.Array[java.lang.String]]
  var email: java.lang.String
  var ports: js.UndefOr[autoDashSniLib.Anon_Http] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    agreeTos: scala.Boolean,
    domains: js.Array[java.lang.String | js.Array[java.lang.String]],
    email: java.lang.String,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    ports: autoDashSniLib.Anon_Http = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agreeTos")(agreeTos)
    __obj.updateDynamic("domains")(domains)
    __obj.updateDynamic("email")(email)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (ports != null) __obj.updateDynamic("ports")(ports)
    __obj.asInstanceOf[Options]
  }
}

