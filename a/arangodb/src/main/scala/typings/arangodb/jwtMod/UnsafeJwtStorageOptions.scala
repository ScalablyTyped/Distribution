package typings.arangodb.jwtMod

import typings.arangodb.arangodbStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsafeJwtStorageOptions extends js.Object {
  var algorithm: none
  var maxExp: js.UndefOr[Double] = js.undefined
  var ttl: js.UndefOr[Double] = js.undefined
  var verify: js.UndefOr[Boolean] = js.undefined
}

object UnsafeJwtStorageOptions {
  @scala.inline
  def apply(
    algorithm: none,
    maxExp: js.UndefOr[Double] = js.undefined,
    ttl: js.UndefOr[Double] = js.undefined,
    verify: js.UndefOr[Boolean] = js.undefined
  ): UnsafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(maxExp)) __obj.updateDynamic("maxExp")(maxExp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ttl)) __obj.updateDynamic("ttl")(ttl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsafeJwtStorageOptions]
  }
}

