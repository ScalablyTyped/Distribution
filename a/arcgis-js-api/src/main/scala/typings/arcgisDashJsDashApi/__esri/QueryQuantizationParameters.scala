package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`lower-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`upper-left`
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryQuantizationParameters extends Object {
  /**
    * An extent defining the quantization grid bounds. Its [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) matches the input geometry spatial reference if one is specified for the query. Otherwise, the extent will be in the layer's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var extent: js.UndefOr[Extent] = js.undefined
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.  **Possible Values:** view | edit
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var mode: js.UndefOr[String] = js.undefined
  /**
    * The integer's coordinates will be returned relative to the origin position defined by this property value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    *
    * @default upper-left
    */
  var originPosition: js.UndefOr[`upper-left` | `lower-left`] = js.undefined
  /**
    * The size of one pixel in the units of the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference). This number is used to convert coordinates to integers by building a grid with a resolution matching the tolerance. Each coordinate is then snapped to one pixel on the grid. Consecutive coordinates snapped to the same pixel are removed for reducing the overall response size. The units of tolerance will match the units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference). If `outSpatialReference` is not specified, then tolerance is assumed to be in the units of the spatial reference of the layer. If tolerance is not specified, the [maxAllowableOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxAllowableOffset) is used. If tolerance and `maxAllowableOffset` are not specified, a grid of 10,000 * 10,000 grid is used by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    *
    * @default 1
    */
  var tolerance: js.UndefOr[Double] = js.undefined
}

object QueryQuantizationParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    extent: Extent = null,
    mode: String = null,
    originPosition: `upper-left` | `lower-left` = null,
    tolerance: Int | Double = null
  ): QueryQuantizationParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (originPosition != null) __obj.updateDynamic("originPosition")(originPosition.asInstanceOf[js.Any])
    if (tolerance != null) __obj.updateDynamic("tolerance")(tolerance.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryQuantizationParameters]
  }
}

