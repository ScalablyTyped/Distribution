package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchViewModelSearchCompleteEventResults
  extends stdLib.Object {
  var results: js.Array[SearchResult]
  var source: js.Array[_]
  var sourceIndex: scala.Double
}

object SearchViewModelSearchCompleteEventResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    results: js.Array[SearchResult],
    source: js.Array[_],
    sourceIndex: scala.Double
  ): SearchViewModelSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SearchViewModelSearchCompleteEventResults]
  }
}

