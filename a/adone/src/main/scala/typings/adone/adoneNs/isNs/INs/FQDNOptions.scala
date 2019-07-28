package typings.adone.adoneNs.isNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FQDNOptions extends js.Object {
  /**
    * Whether to allow trailing dot, default `false`
    */
  var allowTrailingDot: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to allow underscores("_"), default `false`
    */
  var allowUnderscores: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to require top-level domain, default `true`
    */
  var requireTld: js.UndefOr[Boolean] = js.undefined
}

object FQDNOptions {
  @scala.inline
  def apply(
    allowTrailingDot: js.UndefOr[Boolean] = js.undefined,
    allowUnderscores: js.UndefOr[Boolean] = js.undefined,
    requireTld: js.UndefOr[Boolean] = js.undefined
  ): FQDNOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowTrailingDot)) __obj.updateDynamic("allowTrailingDot")(allowTrailingDot)
    if (!js.isUndefined(allowUnderscores)) __obj.updateDynamic("allowUnderscores")(allowUnderscores)
    if (!js.isUndefined(requireTld)) __obj.updateDynamic("requireTld")(requireTld)
    __obj.asInstanceOf[FQDNOptions]
  }
}

