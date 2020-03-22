package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetApiKeyResponse extends js.Object {
  /**
    * List of permissions the key contains.
    */
  val acl: js.Array[String]
  /**
    * Date of creation.
    */
  val createdAt: String
  /**
    * Specify a description of the API key. Used for informative purposes only. It has impact on the functionality of the API key.
    */
  val description: js.UndefOr[String] = js.undefined
  /**
    * Specify the list of targeted indices. You can target all indices starting with a prefix or ending with a suffix using the ‘*’ character.
    */
  val indexes: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Specify the maximum number of hits this API key can retrieve in one call.
    * This parameter can be used to protect you from attempts at retrieving your entire index contents by massively querying the index.
    */
  val maxHitsPerQuery: js.UndefOr[Double] = js.undefined
  /**
    * Specify the maximum number of API calls allowed from an IP address per hour. Each time an API call is performed with this key, a check is performed.
    */
  val maxQueriesPerIPPerHour: js.UndefOr[Double] = js.undefined
  /**
    * Specify the list of query parameters. You can force the query parameters for a query using the url string format.
    */
  val queryParameters: js.UndefOr[String] = js.undefined
  /**
    * Specify the list of referers. You can target all referers starting with a prefix, ending with a suffix using the ‘*’ character.
    */
  val referers: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val validity: Double
  /**
    * A Unix timestamp used to define the expiration date of the API key.
    */
  val value: String
}

object GetApiKeyResponse {
  @scala.inline
  def apply(
    acl: js.Array[String],
    createdAt: String,
    validity: Double,
    value: String,
    description: String = null,
    indexes: js.Array[String] = null,
    maxHitsPerQuery: Int | Double = null,
    maxQueriesPerIPPerHour: Int | Double = null,
    queryParameters: String = null,
    referers: js.Array[String] = null
  ): GetApiKeyResponse = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (indexes != null) __obj.updateDynamic("indexes")(indexes.asInstanceOf[js.Any])
    if (maxHitsPerQuery != null) __obj.updateDynamic("maxHitsPerQuery")(maxHitsPerQuery.asInstanceOf[js.Any])
    if (maxQueriesPerIPPerHour != null) __obj.updateDynamic("maxQueriesPerIPPerHour")(maxQueriesPerIPPerHour.asInstanceOf[js.Any])
    if (queryParameters != null) __obj.updateDynamic("queryParameters")(queryParameters.asInstanceOf[js.Any])
    if (referers != null) __obj.updateDynamic("referers")(referers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyResponse]
  }
}

