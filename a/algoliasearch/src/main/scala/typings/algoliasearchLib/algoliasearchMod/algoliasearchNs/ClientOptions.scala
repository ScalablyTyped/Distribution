package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

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

