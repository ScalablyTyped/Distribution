package typings
package asyncDashRetryLib.asyncDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends retryLib.retryMod.OperationOptions {
  var onRetry: js.UndefOr[js.Function2[/* e */ stdLib.Error, /* attempt */ scala.Double, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: scala.Int | scala.Double = null,
    forever: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetryTime: scala.Int | scala.Double = null,
    maxTimeout: scala.Int | scala.Double = null,
    minTimeout: scala.Int | scala.Double = null,
    onRetry: (/* e */ stdLib.Error, /* attempt */ scala.Double) => _ = null,
    randomize: js.UndefOr[scala.Boolean] = js.undefined,
    retries: scala.Int | scala.Double = null,
    unref: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever)
    if (maxRetryTime != null) __obj.updateDynamic("maxRetryTime")(maxRetryTime.asInstanceOf[js.Any])
    if (maxTimeout != null) __obj.updateDynamic("maxTimeout")(maxTimeout.asInstanceOf[js.Any])
    if (minTimeout != null) __obj.updateDynamic("minTimeout")(minTimeout.asInstanceOf[js.Any])
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction2(onRetry))
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize)
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref)
    __obj.asInstanceOf[Options]
  }
}

