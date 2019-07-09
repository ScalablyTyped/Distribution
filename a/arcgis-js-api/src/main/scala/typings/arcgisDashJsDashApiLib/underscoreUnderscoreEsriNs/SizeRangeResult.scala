package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeRangeResult
  extends stdLib.Object {
  /**
    * The suggested sizes of the largest icons at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var maxSize: ScaleDependentStops
  /**
    * The suggested sizes of the smallest icons at various scales in a layer with a [size visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-sizeRange.html#SizeRangeResult)
    */
  var minSize: ScaleDependentStops
}

object SizeRangeResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    maxSize: ScaleDependentStops,
    minSize: ScaleDependentStops,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): SizeRangeResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxSize = maxSize, minSize = minSize, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[SizeRangeResult]
  }
}

