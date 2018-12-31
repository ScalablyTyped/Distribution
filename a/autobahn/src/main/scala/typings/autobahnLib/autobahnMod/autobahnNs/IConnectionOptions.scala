package typings
package autobahnLib.autobahnMod.autobahnNs

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
  var realm: js.UndefOr[java.lang.String] = js.undefined
  var retry_delay_growth: js.UndefOr[scala.Double] = js.undefined
  var retry_delay_jitter: js.UndefOr[scala.Double] = js.undefined
  var retry_if_unreachable: js.UndefOr[scala.Boolean] = js.undefined
  var transports: js.UndefOr[js.Array[ITransportDefinition]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  // use explicit deferred factory, e.g. jQuery.Deferred or Q.defer
  var use_deferred: js.UndefOr[DeferFactory] = js.undefined
  var use_es6_promises: js.UndefOr[scala.Boolean] = js.undefined
}

