package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenRequest extends js.Object {
  var capability: java.lang.String
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var keyName: java.lang.String
  var mac: java.lang.String
  var nonce: java.lang.String
  var timestamp: scala.Double
  var ttl: js.UndefOr[scala.Double] = js.undefined
}

object TokenRequest {
  @scala.inline
  def apply(
    capability: java.lang.String,
    keyName: java.lang.String,
    mac: java.lang.String,
    nonce: java.lang.String,
    timestamp: scala.Double,
    clientId: java.lang.String = null,
    ttl: scala.Int | scala.Double = null
  ): TokenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capability")(capability)
    __obj.updateDynamic("keyName")(keyName)
    __obj.updateDynamic("mac")(mac)
    __obj.updateDynamic("nonce")(nonce)
    __obj.updateDynamic("timestamp")(timestamp)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenRequest]
  }
}

