package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScaleRangeResult
  extends stdLib.Object {
  /**
    * The suggested [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
    */
  var maxScale: scala.Double
  /**
    * The suggested [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) to apply to the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#ScaleRangeResult)
    */
  var minScale: scala.Double
}

object ScaleRangeResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    maxScale: scala.Double,
    minScale: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): ScaleRangeResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxScale = maxScale, minScale = minScale, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ScaleRangeResult]
  }
}

