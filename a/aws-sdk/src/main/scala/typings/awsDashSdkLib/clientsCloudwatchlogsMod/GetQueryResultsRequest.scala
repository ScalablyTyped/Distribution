package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueryResultsRequest extends js.Object {
  /**
    * The ID number of the query.
    */
  var queryId: QueryId
}

object GetQueryResultsRequest {
  @scala.inline
  def apply(queryId: QueryId): GetQueryResultsRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId)
  
    __obj.asInstanceOf[GetQueryResultsRequest]
  }
}

