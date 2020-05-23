package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterStretchRendererStatistics extends Object {
  /**
    * The average pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var avg: js.UndefOr[Double] = js.undefined
  /**
    * The maximum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var max: Double
  /**
    * The minimum pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var min: Double
  /**
    * The standard deviation of the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var stdev: js.UndefOr[Double] = js.undefined
}

object RasterStretchRendererStatistics {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    avg: js.UndefOr[Double] = js.undefined,
    stdev: js.UndefOr[Double] = js.undefined
  ): RasterStretchRendererStatistics = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (!js.isUndefined(avg)) __obj.updateDynamic("avg")(avg.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stdev)) __obj.updateDynamic("stdev")(stdev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterStretchRendererStatistics]
  }
}

