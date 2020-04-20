package typings.algoliaClientSearch.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTopUserIDsResponse extends js.Object {
  /**
    * Mapping of cluster names to top users.
    */
  val topUsers: Record[String, js.Array[UserIDResponse]]
}

object GetTopUserIDsResponse {
  @scala.inline
  def apply(topUsers: Record[String, js.Array[UserIDResponse]]): GetTopUserIDsResponse = {
    val __obj = js.Dynamic.literal(topUsers = topUsers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTopUserIDsResponse]
  }
}

