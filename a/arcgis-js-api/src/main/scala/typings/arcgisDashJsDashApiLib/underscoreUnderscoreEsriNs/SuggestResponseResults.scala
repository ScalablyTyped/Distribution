package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuggestResponseResults
  extends stdLib.Object {
  /**
    * An array of suggest results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var results: js.Array[SuggestResult]
  /**
    * The [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#sources) of the selected result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var source: js.Any
  /**
    * The index of the currently selected source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search.html#SuggestResponse)
    */
  var sourceIndex: scala.Double
}

object SuggestResponseResults {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    results: js.Array[SuggestResult],
    source: js.Any,
    sourceIndex: scala.Double
  ): SuggestResponseResults = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, results = results, source = source, sourceIndex = sourceIndex)
  
    __obj.asInstanceOf[SuggestResponseResults]
  }
}

