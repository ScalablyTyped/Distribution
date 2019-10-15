package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSuggestCompleteEventResults extends Object {
  var results: js.Array[SuggestResult]
  var source: js.Any
  var sourceIndex: Double
}

object SearchSuggestCompleteEventResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SuggestResult],
    source: js.Any,
    sourceIndex: Double
  ): SearchSuggestCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SearchSuggestCompleteEventResults]
  }
}

