package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectsResponse[TObject] extends js.Object {
  /**
    * The list of results.
    */
  val results: js.Array[TObject with ObjectWithObjectID]
}

object GetObjectsResponse {
  @scala.inline
  def apply[TObject](results: js.Array[TObject with ObjectWithObjectID]): GetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectsResponse[TObject]]
  }
}

