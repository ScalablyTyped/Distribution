package typings.arangodb.jwtMod

import typings.arangodb.ArangoDB.JwtAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeJwtStorageOptions extends js.Object {
  var algorithm: js.UndefOr[JwtAlgorithm] = js.undefined
  var maxExp: js.UndefOr[Double] = js.undefined
  var secret: String
  var ttl: js.UndefOr[Double] = js.undefined
  var verify: js.UndefOr[Boolean] = js.undefined
}

object SafeJwtStorageOptions {
  @scala.inline
  def apply(
    secret: String,
    algorithm: JwtAlgorithm = null,
    maxExp: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    verify: js.UndefOr[Boolean] = js.undefined
  ): SafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExp)) __obj.updateDynamic("maxExp")(maxExp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeJwtStorageOptions]
  }
}

