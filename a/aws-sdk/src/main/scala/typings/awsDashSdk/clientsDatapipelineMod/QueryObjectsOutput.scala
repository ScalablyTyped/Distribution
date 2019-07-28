package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[Boolean] = js.undefined
  /**
    * The identifiers that match the query selectors.
    */
  var ids: js.UndefOr[idList] = js.undefined
  /**
    * The starting point for the next page of results. To view the next page of results, call QueryObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[String] = js.undefined
}

object QueryObjectsOutput {
  @scala.inline
  def apply(hasMoreResults: js.UndefOr[Boolean] = js.undefined, ids: idList = null, marker: String = null): QueryObjectsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[QueryObjectsOutput]
  }
}

