package typings
package algoliasearchLib.liteMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing available options when initializing a client
  */
trait ClientOptions extends js.Object {
  /**
    * enable the experimental feature: caching requests instead of responses
    * see https://github.com/algolia/algoliasearch-client-javascript/pull/694
    */
  var _useRequestCache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * read: array of read hosts to use to call  servers, computed automatically
    * write: array of read hosts to use to call  servers, computed automatically
    * https://github.com/algolia/algoliasearch-client-js#client-options
    */
  var hosts: js.UndefOr[algoliasearchLib.Anon_Read] = js.undefined
  /**
    * (node only) httpAgent instance to use when communicating with  servers.
    * https://github.com/algolia/algoliasearch-client-js#client-options
    */
  var httpAgent: js.UndefOr[js.Any] = js.undefined
  /**
    * Protocol to use when communicating with algolia
    * default: current protocol(browser), https(node)
    * https://github.com/algolia/algoliasearch-client-js#client-options
    */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Timeout for requests to our servers, in milliseconds
    * default: 15s (node), 2s (browser)
    * https://github.com/algolia/algoliasearch-client-js#client-options
    */
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    _useRequestCache: js.UndefOr[scala.Boolean] = js.undefined,
    hosts: algoliasearchLib.Anon_Read = null,
    httpAgent: js.Any = null,
    protocol: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_useRequestCache)) __obj.updateDynamic("_useRequestCache")(_useRequestCache)
    if (hosts != null) __obj.updateDynamic("hosts")(hosts)
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

