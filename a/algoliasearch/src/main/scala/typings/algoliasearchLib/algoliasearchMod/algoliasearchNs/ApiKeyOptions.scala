package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Describes the option used when creating user key
   */

trait ApiKeyOptions extends js.Object {
  /**
       * Specify a description to describe where the key is used.
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
       * Specify the list of targeted indices
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var indexes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Specify the maximum number of hits this API key can retrieve in one call
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var maxHitsPerQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Specify the maximum number of API calls allowed from an IP address per hour
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var maxQueriesPerIPPerHour: js.UndefOr[scala.Double] = js.undefined
  /**
       * Specify the list of query parameters
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var queryParameters: js.UndefOr[QueryParameters] = js.undefined
  /**
       * Specify the list of referers
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var referers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
       * Add a validity period. The key will be valid for a specific period of time (in seconds).
       * https://github.com/algolia/algoliasearch-client-js#add-user-key---addapikey
       */
  var validity: js.UndefOr[scala.Double] = js.undefined
}

