package typings.algoliasearch.algoliasearchMod

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
  var description: js.UndefOr[String] = js.undefined
  /**
    * Specify the list of targeted indices
    */
  var indexes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specify the maximum number of hits this API key can retrieve in one call
    */
  var maxHitsPerQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour
    */
  var maxQueriesPerIPPerHour: js.UndefOr[Double] = js.undefined
  /**
    * Specify the list of query parameters
    */
  var queryParameters: js.UndefOr[QueryParameters] = js.undefined
  /**
    * Specify the list of referers
    */
  var referers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Add a validity period. The key will be valid for a specific period of time (in seconds).
    */
  var validity: js.UndefOr[Double] = js.undefined
}

object ApiKeyOptions {
  @scala.inline
  def apply(
    description: String = null,
    indexes: js.Array[String] = null,
    maxHitsPerQuery: js.UndefOr[Boolean] = js.undefined,
    maxQueriesPerIPPerHour: Int | Double = null,
    queryParameters: QueryParameters = null,
    referers: js.Array[String] = null,
    validity: Int | Double = null
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

