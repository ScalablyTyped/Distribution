package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopQueryRequest extends js.Object {
  /**
    * The ID number of the query to stop. If necessary, you can use DescribeQueries to find this ID number.
    */
  var queryId: QueryId = js.native
}

object StopQueryRequest {
  @scala.inline
  def apply(queryId: QueryId): StopQueryRequest = {
    val __obj = js.Dynamic.literal(queryId = queryId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopQueryRequest]
  }
}

