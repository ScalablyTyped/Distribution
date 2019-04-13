package typings
package awsDashSdkLib.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAffectedEntitiesRequest extends js.Object {
  /**
    * Values to narrow the results returned. At least one event ARN is required. 
    */
  var filter: EntityFilter
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[locale] = js.undefined
  /**
    * The maximum number of items to return in one batch, between 10 and 100, inclusive.
    */
  var maxResults: js.UndefOr[maxResults] = js.undefined
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[nextToken] = js.undefined
}

object DescribeAffectedEntitiesRequest {
  @scala.inline
  def apply(
    filter: EntityFilter,
    locale: locale = null,
    maxResults: js.UndefOr[maxResults] = js.undefined,
    nextToken: nextToken = null
  ): DescribeAffectedEntitiesRequest = {
    val __obj = js.Dynamic.literal(filter = filter)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeAffectedEntitiesRequest]
  }
}

