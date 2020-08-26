package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object containing the response from an autocomplete request.
  */
@js.native
trait SearchAutocompleteResponse extends js.Object {
  /**
    * The query string used to perform the autocomplete request.
    */
  var query: String = js.native
  /**
    * The results from an autocomplete request.
    */
  var results: js.Array[SearchAutocompleteResult] = js.native
}

object SearchAutocompleteResponse {
  @scala.inline
  def apply(query: String, results: js.Array[SearchAutocompleteResult]): SearchAutocompleteResponse = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAutocompleteResponse]
  }
  @scala.inline
  implicit class SearchAutocompleteResponseOps[Self <: SearchAutocompleteResponse] (val x: Self) extends AnyVal {
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
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResultsVarargs(value: SearchAutocompleteResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[SearchAutocompleteResult]): Self = this.set("results", value.asInstanceOf[js.Any])
  }
  
}

