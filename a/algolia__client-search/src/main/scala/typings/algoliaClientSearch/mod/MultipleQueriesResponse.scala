package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleQueriesResponse[TObject] extends js.Object {
  /**
    * The list of results.
    */
  val results: js.Array[SearchResponse[TObject with ObjectWithObjectID]]
}

object MultipleQueriesResponse {
  @scala.inline
  def apply[TObject](results: js.Array[SearchResponse[TObject with ObjectWithObjectID]]): MultipleQueriesResponse[TObject] = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultipleQueriesResponse[TObject]]
  }
}

