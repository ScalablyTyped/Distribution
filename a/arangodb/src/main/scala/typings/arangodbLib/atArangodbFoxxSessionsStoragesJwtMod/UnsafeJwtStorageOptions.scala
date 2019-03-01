package typings
package arangodbLib.atArangodbFoxxSessionsStoragesJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsafeJwtStorageOptions extends js.Object {
  var algorithm: arangodbLib.arangodbLibStrings.none
  var maxExp: js.UndefOr[scala.Double] = js.undefined
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var verify: js.UndefOr[scala.Boolean] = js.undefined
}

object UnsafeJwtStorageOptions {
  @scala.inline
  def apply(
    algorithm: arangodbLib.arangodbLibStrings.none,
    maxExp: scala.Int | scala.Double = null,
    ttl: scala.Int | scala.Double = null,
    verify: js.UndefOr[scala.Boolean] = js.undefined
  ): UnsafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    if (maxExp != null) __obj.updateDynamic("maxExp")(maxExp.asInstanceOf[js.Any])
    if (ttl != null) __obj.updateDynamic("ttl")(ttl.asInstanceOf[js.Any])
    if (!js.isUndefined(verify)) __obj.updateDynamic("verify")(verify)
    __obj.asInstanceOf[UnsafeJwtStorageOptions]
  }
}

