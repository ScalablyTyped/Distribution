package typings
package arangodbLib.atArangodbFoxxSessionsStoragesJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeJwtStorageOptions extends js.Object {
  var algorithm: js.UndefOr[arangodbLib.ArangoDBNs.JwtAlgorithm] = js.undefined
  var maxExp: js.UndefOr[scala.Double] = js.undefined
  var secret: java.lang.String
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var verify: js.UndefOr[scala.Boolean] = js.undefined
}

object SafeJwtStorageOptions {
  @scala.inline
  def apply(
    secret: java.lang.String,
    algorithm: arangodbLib.ArangoDBNs.JwtAlgorithm = null,
    maxExp: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null,
    verify: js.UndefOr[scala.Boolean] = js.undefined
  ): SafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secret")(secret)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (maxExp != null) __obj.updateDynamic("maxExp")(maxExp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SafeJwtStorageOptions]
  }
}

