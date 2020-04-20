package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSuggestCompleteEvent extends js.Object {
  var activeSourceIndex: Double
  var errors: js.Array[Error]
  var numResults: Double
  var results: js.Array[SearchSuggestCompleteEventResults]
  var searchTerm: String
}

object SearchSuggestCompleteEvent {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchSuggestCompleteEventResults],
    searchTerm: String
  ): SearchSuggestCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], numResults = numResults.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], searchTerm = searchTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSuggestCompleteEvent]
  }
}

