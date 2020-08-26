package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUserIDsOptions extends js.Object {
  /**
    * Number of users to retrieve per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.native
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.native
}

object ListUserIDsOptions {
  @scala.inline
  def apply(): ListUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserIDsOptions]
  }
  @scala.inline
  implicit class ListUserIDsOptionsOps[Self <: ListUserIDsOptions] (val x: Self) extends AnyVal {
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
    def setHitsPerPage(value: Double): Self = this.set("hitsPerPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHitsPerPage: Self = this.set("hitsPerPage", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

