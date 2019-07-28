package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAutocompleteResponse extends js.Object {
  var query: String
  var results: js.Array[SearchAutocompleteResult]
}

object SearchAutocompleteResponse {
  @scala.inline
  def apply(query: String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query, results = results)
  
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
}

