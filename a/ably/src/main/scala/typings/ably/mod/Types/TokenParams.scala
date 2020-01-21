package typings.ably.mod.Types

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenParams extends js.Object {
  var capability: js.UndefOr[StringDictionary[js.Array[capabilityOp]] | String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var timestamp: js.UndefOr[Double] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
}

object TokenParams {
  @scala.inline
  def apply(
    capability: StringDictionary[js.Array[capabilityOp]] | String = null,
    clientId: String = null,
    nonce: String = null,
    timestamp: Int | Double = null,
    ttl: Int | Double = null
  ): TokenParams = {
    val __obj = js.Dynamic.literal()
    if (capability != null) __obj.updateDynamic("capability")(capability.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenParams]
  }
}

