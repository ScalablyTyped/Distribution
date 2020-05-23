package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLogsResponse extends js.Object {
  /**
    * The list of logs.
    */
  var logs: js.Array[Log]
}

object GetLogsResponse {
  @scala.inline
  def apply(logs: js.Array[Log]): GetLogsResponse = {
    val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLogsResponse]
  }
}

