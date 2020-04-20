package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.BrowseRequestData
import typings.algoliaClientSearch.mod.BrowseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequest[TObject] extends js.Object {
  def request(data: BrowseRequestData): js.Promise[BrowseResponse[TObject]]
  def shouldStop(response: BrowseResponse[TObject]): Boolean
}

object AnonRequest {
  @scala.inline
  def apply[TObject](
    request: BrowseRequestData => js.Promise[BrowseResponse[TObject]],
    shouldStop: BrowseResponse[TObject] => Boolean
  ): AnonRequest[TObject] = {
    val __obj = js.Dynamic.literal(request = js.Any.fromFunction1(request), shouldStop = js.Any.fromFunction1(shouldStop))
    __obj.asInstanceOf[AnonRequest[TObject]]
  }
}

