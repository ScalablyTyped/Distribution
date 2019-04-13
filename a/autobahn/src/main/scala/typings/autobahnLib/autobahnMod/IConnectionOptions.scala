package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionOptions extends js.Object {
  var authid: js.UndefOr[java.lang.String] = js.undefined
  var authmethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var initial_retry_delay: js.UndefOr[scala.Double] = js.undefined
  var max_retries: js.UndefOr[scala.Double] = js.undefined
  var max_retry_delay: js.UndefOr[scala.Double] = js.undefined
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.undefined
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var realm: java.lang.String
  var retry_delay_growth: js.UndefOr[scala.Double] = js.undefined
  var retry_delay_jitter: js.UndefOr[scala.Double] = js.undefined
  var retry_if_unreachable: js.UndefOr[scala.Boolean] = js.undefined
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.undefined
  var use_es6_promises: js.UndefOr[scala.Boolean] = js.undefined
}

object IConnectionOptions {
  @scala.inline
  def apply(
    realm: java.lang.String,
    authid: java.lang.String = null,
    authmethods: js.Array[java.lang.String] = null,
    initial_retry_delay: scala.Int | scala.Double = null,
    max_retries: scala.Int | scala.Double = null,
    max_retry_delay: scala.Int | scala.Double = null,
    onchallenge: OnChallengeHandler = null,
    protocols: js.Array[java.lang.String] = null,
    retry_delay_growth: scala.Int | scala.Double = null,
    retry_delay_jitter: scala.Int | scala.Double = null,
    retry_if_unreachable: js.UndefOr[scala.Boolean] = js.undefined,
    transports: js.Array[ITransportDefinition] = null,
    url: java.lang.String = null,
    use_deferred: DeferFactory = null,
    use_es6_promises: js.UndefOr[scala.Boolean] = js.undefined
  ): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm)
    if (authid != null) __obj.updateDynamic("authid")(authid)
    if (authmethods != null) __obj.updateDynamic("authmethods")(authmethods)
    if (initial_retry_delay != null) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.asInstanceOf[js.Any])
    if (max_retries != null) __obj.updateDynamic("max_retries")(max_retries.asInstanceOf[js.Any])
    if (max_retry_delay != null) __obj.updateDynamic("max_retry_delay")(max_retry_delay.asInstanceOf[js.Any])
    if (onchallenge != null) __obj.updateDynamic("onchallenge")(onchallenge)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (retry_delay_growth != null) __obj.updateDynamic("retry_delay_growth")(retry_delay_growth.asInstanceOf[js.Any])
    if (retry_delay_jitter != null) __obj.updateDynamic("retry_delay_jitter")(retry_delay_jitter.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_if_unreachable)) __obj.updateDynamic("retry_if_unreachable")(retry_if_unreachable)
    if (transports != null) __obj.updateDynamic("transports")(transports)
    if (url != null) __obj.updateDynamic("url")(url)
    if (use_deferred != null) __obj.updateDynamic("use_deferred")(use_deferred)
    if (!js.isUndefined(use_es6_promises)) __obj.updateDynamic("use_es6_promises")(use_es6_promises)
    __obj.asInstanceOf[IConnectionOptions]
  }
}

