package typings.algoliasearch.mod

import typings.algoliasearch.anon.Read
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface describing available options when initializing a client
  */
trait ClientOptions extends js.Object {
  /**
    * enable the experimental feature: caching requests instead of responses
    */
  var _useRequestCache: js.UndefOr[Boolean] = js.undefined
  /**
    * read: array of read hosts to use to call  servers, computed automatically
    * write: array of read hosts to use to call  servers, computed automatically
    */
  var hosts: js.UndefOr[Read] = js.undefined
  /**
    * (node only) httpAgent instance to use when communicating with  servers.
    */
  var httpAgent: js.UndefOr[js.Any] = js.undefined
  /**
    * Protocol to use when communicating with algolia
    * default: current protocol(browser), https(node)
    */
  var protocol: js.UndefOr[String] = js.undefined
  /**
    * Timeout for requests to our servers, in milliseconds
    * default: 15s (node), 2s (browser)
    */
  var timeout: js.UndefOr[Double] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    _useRequestCache: js.UndefOr[Boolean] = js.undefined,
    hosts: Read = null,
    httpAgent: js.Any = null,
    protocol: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_useRequestCache)) __obj.updateDynamic("_useRequestCache")(_useRequestCache.get.asInstanceOf[js.Any])
    if (hosts != null) __obj.updateDynamic("hosts")(hosts.asInstanceOf[js.Any])
    if (httpAgent != null) __obj.updateDynamic("httpAgent")(httpAgent.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

