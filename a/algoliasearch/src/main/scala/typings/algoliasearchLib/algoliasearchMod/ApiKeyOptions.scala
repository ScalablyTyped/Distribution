package typings
package algoliasearchLib.algoliasearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the option used when creating user key
  */
trait ApiKeyOptions extends js.Object {
  /**
    * Specify a description to describe where the key is used.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specify the list of targeted indices
    */
  var indexes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Specify the maximum number of hits this API key can retrieve in one call
    */
  var maxHitsPerQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour
    */
  var maxQueriesPerIPPerHour: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specify the list of query parameters
    */
  var queryParameters: js.UndefOr[QueryParameters] = js.undefined
  /**
    * Specify the list of referers
    */
  var referers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Add a validity period. The key will be valid for a specific period of time (in seconds).
    */
  var validity: js.UndefOr[scala.Double] = js.undefined
}

object ApiKeyOptions {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    indexes: js.Array[java.lang.String] = null,
    maxHitsPerQuery: js.UndefOr[scala.Boolean] = js.undefined,
    maxQueriesPerIPPerHour: scala.Int | scala.Double = null,
    queryParameters: QueryParameters = null,
    referers: js.Array[java.lang.String] = null,
    validity: scala.Int | scala.Double = null
  ): ApiKeyOptions = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (indexes != null) __obj.updateDynamic("indexes")(indexes)
    if (!js.isUndefined(maxHitsPerQuery)) __obj.updateDynamic("maxHitsPerQuery")(maxHitsPerQuery)
    if (maxQueriesPerIPPerHour != null) __obj.updateDynamic("maxQueriesPerIPPerHour")(maxQueriesPerIPPerHour.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters)
    if (referers != null) __obj.updateDynamic("referers")(referers)
    if (validity != null) __obj.updateDynamic("validity")(validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiKeyOptions]
  }
}

