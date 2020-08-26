package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`lower-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`upper-left`
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryQuantizationParameters extends Object {
  /**
    * An extent defining the quantization grid bounds. Its [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) matches the input geometry spatial reference if one is specified for the query. Otherwise, the extent will be in the layer's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var extent: js.UndefOr[Extent] = js.native
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    */
  var mode: js.UndefOr[view | edit] = js.native
  /**
    * The integer's coordinates will be returned relative to the origin position defined by this property value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    *
    * @default upper-left
    */
  var originPosition: js.UndefOr[`upper-left` | `lower-left`] = js.native
  /**
    * The size of one pixel in the units of the [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference). This number is used to convert coordinates to integers by building a grid with a resolution matching the tolerance. Each coordinate is then snapped to one pixel on the grid. Consecutive coordinates snapped to the same pixel are removed for reducing the overall response size. The units of tolerance will match the units of [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference). If `outSpatialReference` is not specified, then tolerance is assumed to be in the units of the spatial reference of the layer. If tolerance is not specified, the [maxAllowableOffset](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#maxAllowableOffset) is used. If tolerance and `maxAllowableOffset` are not specified, a grid of 10,000 * 10,000 grid is used by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#quantizationParameters)
    *
    * @default 1
    */
  var tolerance: js.UndefOr[Double] = js.native
}

object QueryQuantizationParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): QueryQuantizationParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[QueryQuantizationParameters]
  }
  @scala.inline
  implicit class QueryQuantizationParametersOps[Self <: QueryQuantizationParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setExtent(value: Extent): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setMode(value: view | edit): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOriginPosition(value: `upper-left` | `lower-left`): Self = this.set("originPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginPosition: Self = this.set("originPosition", js.undefined)
    @scala.inline
    def setTolerance(value: Double): Self = this.set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTolerance: Self = this.set("tolerance", js.undefined)
  }
  
}

