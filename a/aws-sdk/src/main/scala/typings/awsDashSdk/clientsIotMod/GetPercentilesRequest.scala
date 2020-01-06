package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPercentilesRequest extends js.Object {
  /**
    * The field to aggregate.
    */
  var aggregationField: js.UndefOr[AggregationField] = js.native
  /**
    * The name of the index to search.
    */
  var indexName: js.UndefOr[IndexName] = js.native
  /**
    * The percentile groups returned.
    */
  var percents: js.UndefOr[PercentList] = js.native
  /**
    * The query string.
    */
  var queryString: QueryString = js.native
  /**
    * The query version.
    */
  var queryVersion: js.UndefOr[QueryVersion] = js.native
}

object GetPercentilesRequest {
  @scala.inline
  def apply(
    queryString: QueryString,
    aggregationField: AggregationField = null,
    indexName: IndexName = null,
    percents: PercentList = null,
    queryVersion: QueryVersion = null
  ): GetPercentilesRequest = {
    val __obj = js.Dynamic.literal(queryString = queryString.asInstanceOf[js.Any])
    if (aggregationField != null) __obj.updateDynamic("aggregationField")(aggregationField.asInstanceOf[js.Any])
    if (indexName != null) __obj.updateDynamic("indexName")(indexName.asInstanceOf[js.Any])
    if (percents != null) __obj.updateDynamic("percents")(percents.asInstanceOf[js.Any])
    if (queryVersion != null) __obj.updateDynamic("queryVersion")(queryVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPercentilesRequest]
  }
}

