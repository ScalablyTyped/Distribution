package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchIndexRequest extends js.Object {
  /**
    * The search index name.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The maximum number of results to return at one time.
    */
  var maxResults: js.UndefOr[QueryMaxResults] = js.undefined
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The search query string.
    */
  var queryString: QueryString
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}

object SearchIndexRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    indexName: IndexName = null,
    maxResults: js.UndefOr[QueryMaxResults] = js.undefined,
    nextToken: NextToken = null,
    queryVersion: QueryVersion = null
  ): SearchIndexRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString)
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    __obj.asInstanceOf[SearchIndexRequest]
  }
}

