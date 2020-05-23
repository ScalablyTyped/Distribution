package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleGetObjectsResponse[TObject] extends js.Object {
  /**
    * The list of objects.
    */
  var results: js.Array[TObject with ObjectWithObjectID]
}

object MultipleGetObjectsResponse {
  @scala.inline
  def apply[TObject](results: js.Array[TObject with ObjectWithObjectID]): MultipleGetObjectsResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleGetObjectsResponse[TObject]]
  }
}

