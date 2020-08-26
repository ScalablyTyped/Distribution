package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.BrowseRequestData
import typings.algoliaClientSearch.mod.BrowseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[TObject] extends js.Object {
  def request(data: BrowseRequestData): js.Promise[BrowseResponse[TObject]] = js.native
  def shouldStop(response: BrowseResponse[TObject]): Boolean = js.native
}

object Request {
  @scala.inline
  def apply[TObject](
    request: BrowseRequestData => js.Promise[BrowseResponse[TObject]],
    shouldStop: BrowseResponse[TObject] => Boolean
  ): Request[TObject] = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request), shouldStop = js.Any.fromFunction1(shouldStop))
    __obj.asInstanceOf[Request[TObject]]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request[_], TObject] (val x: Self with Request[TObject]) extends AnyVal {
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
    def setRequest(value: BrowseRequestData => js.Promise[BrowseResponse[TObject]]): Self = this.set("request", js.Any.fromFunction1(value))
    @scala.inline
    def setShouldStop(value: BrowseResponse[TObject] => Boolean): Self = this.set("shouldStop", js.Any.fromFunction1(value))
  }
  
}

