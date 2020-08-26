package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseRequestData extends js.Object {
  /**
    * If available, should be used for browsing to the next page.
    */
  val cursor: js.UndefOr[String] = js.native
  /**
    * If cursor is not available, should be used for browsing to the next page.
    */
  val page: js.UndefOr[Double] = js.native
}

object BrowseRequestData {
  @scala.inline
  def apply(): BrowseRequestData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseRequestData]
  }
  @scala.inline
  implicit class BrowseRequestDataOps[Self <: BrowseRequestData] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

