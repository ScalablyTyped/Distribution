package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopQueryRequest extends js.Object {
  /**
    * The ID number of the query to stop. If necessary, you can use DescribeQueries to find this ID number.
    */
  var queryId: QueryId
}

object StopQueryRequest {
  @scala.inline
  def apply(queryId: QueryId): StopQueryRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId)
  
    __obj.asInstanceOf[StopQueryRequest]
  }
}

