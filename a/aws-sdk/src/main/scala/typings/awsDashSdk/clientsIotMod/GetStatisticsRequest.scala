package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStatisticsRequest extends js.Object {
  /**
    * The aggregation field name. Currently not supported.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.undefined
  /**
    * The name of the index to search. The default value is AWS_Things.
    */
  var indexName: js.UndefOr[IndexName] = js.undefined
  /**
    * The query used to search. You can specify "*" for the query string to get the count of all indexed things in your AWS account.
    */
  var queryString: QueryString
  /**
    * The version of the query used to search.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.undefined
}

object GetStatisticsRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    aggregationField: AggregationField = null,
    indexName: IndexName = null,
    queryVersion: QueryVersion = null
  ): GetStatisticsRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString)
    if (aggregationField != null) __obj.updateDynamic("aggregationField")(aggregationField)
    if (indexName != null) __obj.updateDynamic("indexName")(indexName)
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion)
    __obj.asInstanceOf[GetStatisticsRequest]
  }
}

