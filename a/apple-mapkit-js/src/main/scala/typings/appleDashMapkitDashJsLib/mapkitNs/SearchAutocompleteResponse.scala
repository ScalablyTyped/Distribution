package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAutocompleteResponse extends js.Object {
  var query: java.lang.String
  var results: js.Array[SearchAutocompleteResult]
}

object SearchAutocompleteResponse {
  @scala.inline
  def apply(query: java.lang.String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query, results = results)
  
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
}

