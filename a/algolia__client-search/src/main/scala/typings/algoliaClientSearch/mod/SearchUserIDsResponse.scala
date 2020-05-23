package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserIDsResponse extends js.Object {
  /**
    * List of userID matching the query.
    */
  var hits: js.Array[UserIDResponse]
  /**
    * Number of hits retrieved per page.
    */
  var hitsPerPage: Double
  /**
    * Number of userIDs matching the query.
    */
  var nbHits: Double
  /**
    * Current page.
    */
  var page: Double
  /**
    * Timestamp of the last update of the index.
    */
  var updatedAt: Double
}

object SearchUserIDsResponse {
  @scala.inline
  def apply(
    hits: js.Array[UserIDResponse],
    hitsPerPage: Double,
    nbHits: Double,
    page: Double,
    updatedAt: Double
  ): SearchUserIDsResponse = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any], hitsPerPage = hitsPerPage.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserIDsResponse]
  }
}

