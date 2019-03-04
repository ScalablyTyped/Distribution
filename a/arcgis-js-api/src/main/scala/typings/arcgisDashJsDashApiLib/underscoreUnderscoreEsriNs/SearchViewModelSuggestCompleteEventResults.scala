package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSuggestCompleteEventResults
  extends stdLib.Object {
  var results: js.Array[SearchViewModelSuggestResult]
  var source: js.Any
  var sourceIndex: scala.Double
}

object SearchViewModelSuggestCompleteEventResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SearchViewModelSuggestResult],
    source: js.Any,
    sourceIndex: scala.Double
  ): SearchViewModelSuggestCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, results = results, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SearchViewModelSuggestCompleteEventResults]
  }
}

