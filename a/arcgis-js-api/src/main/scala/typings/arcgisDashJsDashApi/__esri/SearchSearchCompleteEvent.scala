package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSearchCompleteEvent extends js.Object {
  var activeSourceIndex: Double
  var errors: js.Array[Error]
  var numResults: Double
  var results: js.Array[SearchSearchCompleteEventResults]
  var searchTerm: String
}

object SearchSearchCompleteEvent {
  @scala.inline
  def apply(
    activeSourceIndex: Double,
    errors: js.Array[Error],
    numResults: Double,
    results: js.Array[SearchSearchCompleteEventResults],
    searchTerm: String
  ): SearchSearchCompleteEvent = {
    val __obj = js.Dynamic.literal(activeSourceIndex = activeSourceIndex, errors = errors, numResults = numResults, results = results, searchTerm = searchTerm)
  
    __obj.asInstanceOf[SearchSearchCompleteEvent]
  }
}

