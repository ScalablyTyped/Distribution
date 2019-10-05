package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSearchCompleteEvent extends js.Object {
  var activeSourceIndex: Double
  var errors: js.Array[Error]
  var numResults: Double
  var results: js.Array[SearchViewModelSearchCompleteEventResults]
  var searchTerm: String
}

object SearchViewModelSearchCompleteEvent {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchViewModelSearchCompleteEventResults],
    searchTerm: String
  ): SearchViewModelSearchCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, errors = errors, numResults = numResults, results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SearchViewModelSearchCompleteEvent]
  }
}

