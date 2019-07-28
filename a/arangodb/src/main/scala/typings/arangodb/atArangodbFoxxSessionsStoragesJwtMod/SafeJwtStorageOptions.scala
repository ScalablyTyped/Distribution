package typings.arangodb.atArangodbFoxxSessionsStoragesJwtMod

import typings.arangodb.ArangoDBNs.JwtAlgorithm
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
    maxExp: Int | Double = null,
    ttl: Int | Double = null,
    verify: js.UndefOr[Boolean] = js.undefined
  ): SafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(secret = secret)
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (maxExp != null) __obj.updateDynamic("maxExp")(maxExp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[SafeJwtStorageOptions]
  }
}

