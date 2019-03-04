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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SearchResult],
    source: js.Array[_],
    sourceIndex: scala.Double
  ): SearchViewModelSearchCompleteEventResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, results = results, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SearchViewModelSearchCompleteEventResults]
  }
}

