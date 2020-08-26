package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsPageReset extends js.Object {
  var isPageReset: Boolean = js.native
  var results: SearchResults[_] = js.native
  var state: SearchParameters = js.native
}

object IsPageReset {
  @scala.inline
  def apply(isPageReset: Boolean, results: SearchResults[_], state: SearchParameters): IsPageReset = {
    val __obj = js.Dynamic.literal(isPageReset = isPageReset.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPageReset]
  }
  @scala.inline
  implicit class IsPageResetOps[Self <: IsPageReset] (val x: Self) extends AnyVal {
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
    def setIsPageReset(value: Boolean): Self = this.set("isPageReset", value.asInstanceOf[js.Any])
    @scala.inline
    def setResults(value: SearchResults[_]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: SearchParameters): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

