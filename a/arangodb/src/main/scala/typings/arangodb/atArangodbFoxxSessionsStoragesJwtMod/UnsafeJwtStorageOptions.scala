package typings.arangodb.atArangodbFoxxSessionsStoragesJwtMod

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
    maxExp: Int | Double = null,
    ttl: Int | Double = null,
    verify: js.UndefOr[Boolean] = js.undefined
  ): UnsafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(algorithm = algorithm)
    if (maxExp != null) __obj.updateDynamic("maxExp")(maxExp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[UnsafeJwtStorageOptions]
  }
}

