package typings.asyncRetry.mod

import typings.retry.mod.OperationOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends OperationOptions {
  var onRetry: js.UndefOr[js.Function2[/* e */ Error, /* attempt */ Double, _]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    factor: js.UndefOr[Double] = js.undefined,
    forever: js.UndefOr[Boolean] = js.undefined,
    maxRetryTime: js.UndefOr[Double] = js.undefined,
    maxTimeout: js.UndefOr[Double] = js.undefined,
    minTimeout: js.UndefOr[Double] = js.undefined,
    onRetry: (/* e */ Error, /* attempt */ Double) => _ = null,
    randomize: js.UndefOr[Boolean] = js.undefined,
    retries: js.UndefOr[Double] = js.undefined,
    unref: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forever)) __obj.updateDynamic("forever")(forever.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetryTime)) __obj.updateDynamic("maxRetryTime")(maxRetryTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxTimeout)) __obj.updateDynamic("maxTimeout")(maxTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minTimeout)) __obj.updateDynamic("minTimeout")(minTimeout.get.asInstanceOf[js.Any])
    if (onRetry != null) __obj.updateDynamic("onRetry")(js.Any.fromFunction2(onRetry))
    if (!js.isUndefined(randomize)) __obj.updateDynamic("randomize")(randomize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unref)) __obj.updateDynamic("unref")(unref.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

