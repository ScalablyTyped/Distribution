package typings.autobahn.mod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionOptions extends js.Object {
  var authid: js.UndefOr[String] = js.undefined
  var authmethods: js.UndefOr[js.Array[String]] = js.undefined
  var initial_retry_delay: js.UndefOr[Double] = js.undefined
  var max_retries: js.UndefOr[Double] = js.undefined
  var max_retry_delay: js.UndefOr[Double] = js.undefined
  var onchallenge: js.UndefOr[OnChallengeHandler] = js.undefined
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var realm: String
  var retry_delay_growth: js.UndefOr[Double] = js.undefined
  var retry_delay_jitter: js.UndefOr[Double] = js.undefined
  var retry_if_unreachable: js.UndefOr[Boolean] = js.undefined
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.undefined
  var use_es6_promises: js.UndefOr[Boolean] = js.undefined
}

object IConnectionOptions {
  @scala.inline
  def apply(
    realm: String,
    authid: String = null,
    authmethods: js.Array[String] = null,
    initial_retry_delay: js.UndefOr[Double] = js.undefined,
    max_retries: js.UndefOr[Double] = js.undefined,
    max_retry_delay: js.UndefOr[Double] = js.undefined,
    onchallenge: (/* session */ Session, /* method */ String, /* extra */ js.Any) => String | Promise[String] = null,
    protocols: js.Array[String] = null,
    retry_delay_growth: js.UndefOr[Double] = js.undefined,
    retry_delay_jitter: js.UndefOr[Double] = js.undefined,
    retry_if_unreachable: js.UndefOr[Boolean] = js.undefined,
    transports: js.Array[ITransportDefinition] = null,
    url: String = null,
    use_deferred: () => Promise[js.Any] = null,
    use_es6_promises: js.UndefOr[Boolean] = js.undefined
  ): IConnectionOptions = {
    val __obj = js.Dynamic.literal(realm = realm.asInstanceOf[js.Any])
    if (authid != null) __obj.updateDynamic("authid")(authid.asInstanceOf[js.Any])
    if (authmethods != null) __obj.updateDynamic("authmethods")(authmethods.asInstanceOf[js.Any])
    if (!js.isUndefined(initial_retry_delay)) __obj.updateDynamic("initial_retry_delay")(initial_retry_delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_retries)) __obj.updateDynamic("max_retries")(max_retries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_retry_delay)) __obj.updateDynamic("max_retry_delay")(max_retry_delay.get.asInstanceOf[js.Any])
    if (onchallenge != null) __obj.updateDynamic("onchallenge")(js.Any.fromFunction3(onchallenge))
    if (protocols != null) __obj.updateDynamic("protocols")(protocols.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_delay_growth)) __obj.updateDynamic("retry_delay_growth")(retry_delay_growth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_delay_jitter)) __obj.updateDynamic("retry_delay_jitter")(retry_delay_jitter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retry_if_unreachable)) __obj.updateDynamic("retry_if_unreachable")(retry_if_unreachable.get.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (use_deferred != null) __obj.updateDynamic("use_deferred")(js.Any.fromFunction0(use_deferred))
    if (!js.isUndefined(use_es6_promises)) __obj.updateDynamic("use_es6_promises")(use_es6_promises.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionOptions]
  }
}

