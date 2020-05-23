package typings.asana.mod.resources

import typings.asana.anon.AsanaBaseUrl
import typings.asana.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceList[T /* <: Resource */] extends js.Object {
  var _dispatcher: AsanaBaseUrl
  var _response: Data[T]
  var data: js.Array[T]
  /**
    * Get the next page of results in a collection.
    *
    * @returns {Promise<Collection?>} Resolves to either a collection representing
    *     the next page of results, or null if no more pages.
    */
  def nextPage(): typings.bluebird.mod.^[ResourceList[T] | Null]
}

object ResourceList {
  @scala.inline
  def apply[T](
    _dispatcher: AsanaBaseUrl,
    _response: Data[T],
    data: js.Array[T],
    nextPage: () => typings.bluebird.mod.^[ResourceList[T] | Null]
  ): ResourceList[T] = {
    val __obj = js.Dynamic.literal(_dispatcher = _dispatcher.asInstanceOf[js.Any], _response = _response.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], nextPage = js.Any.fromFunction0(nextPage))
    __obj.asInstanceOf[ResourceList[T]]
  }
}

