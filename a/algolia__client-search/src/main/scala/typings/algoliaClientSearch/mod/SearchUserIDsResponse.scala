package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchUserIDsResponse extends js.Object {
  /**
    * List of userID matching the query.
    */
  var hits: js.Array[UserIDResponse] = js.native
  /**
    * Number of hits retrieved per page.
    */
  var hitsPerPage: Double = js.native
  /**
    * Number of userIDs matching the query.
    */
  var nbHits: Double = js.native
  /**
    * Current page.
    */
  var page: Double = js.native
  /**
    * Timestamp of the last update of the index.
    */
  var updatedAt: Double = js.native
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
  @scala.inline
  implicit class SearchUserIDsResponseOps[Self <: SearchUserIDsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHitsVarargs(value: UserIDResponse*): Self = this.set("hits", js.Array(value :_*))
    @scala.inline
    def setHits(value: js.Array[UserIDResponse]): Self = this.set("hits", value.asInstanceOf[js.Any])
    @scala.inline
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setNbHits(value: Double): Self = this.set("nbHits", value.asInstanceOf[js.Any])
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedAt(value: Double): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
  }
  
}

