package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the response from an autocomplete request.
  */
trait SearchAutocompleteResponse extends js.Object {
  /**
    * The query string used to perform the autocomplete request.
    */
  var query: String
  /**
    * The results from an autocomplete request.
    */
  var results: js.Array[SearchAutocompleteResult]
}

object SearchAutocompleteResponse {
  @scala.inline
  def apply(query: String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query, results = results)
  
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
}

