package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Content extends js.Object {
  var content: SearchResults[_] = js.native
  var state: SearchParameters = js.native
}

object Content {
  @scala.inline
  def apply(content: SearchResults[_], state: SearchParameters): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
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
    def setContent(value: SearchResults[_]): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: SearchParameters): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

