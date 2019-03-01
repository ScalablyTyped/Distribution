package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenParams extends js.Object {
  var capability: js.UndefOr[java.lang.String] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var timestamp: js.UndefOr[scala.Double] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object TokenParams {
  @scala.inline
  def apply(
    capability: java.lang.String = null,
    clientId: java.lang.String = null,
    nonce: java.lang.String = null,
    timestamp: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null
  ): TokenParams = {
    val __obj = js.Dynamic.literal()
    if (capability != null) __obj.updateDynamic("capability")(capability)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenParams]
  }
}

