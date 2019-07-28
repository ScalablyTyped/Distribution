package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartQueryResponse extends js.Object {
  /**
    * The unique ID of the query. 
    */
  var queryId: js.UndefOr[QueryId] = js.undefined
}

object StartQueryResponse {
  @scala.inline
  def apply(queryId: QueryId = null): StartQueryResponse = {
    val __obj = js.Dynamic.literal()
    if (queryId != null) __obj.updateDynamic("queryId")(queryId)
    __obj.asInstanceOf[StartQueryResponse]
  }
}

