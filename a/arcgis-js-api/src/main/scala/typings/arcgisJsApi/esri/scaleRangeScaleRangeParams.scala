package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait scaleRangeScaleRangeParams extends Object {
  /**
    * The layer for which to generate a suggested min/max scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer = js.native
  /**
    * The number of features in the `layer` to sample for spatial statistics. A higher sample size will yield more precise results. However, higher sample sizes also require more time for the function to process the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    *
    * @default 500
    */
  var sampleSize: js.UndefOr[Double] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View = js.native
}

object scaleRangeScaleRangeParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: View
  ): scaleRangeScaleRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[scaleRangeScaleRangeParams]
  }
  @scala.inline
  implicit class scaleRangeScaleRangeParamsOps[Self <: scaleRangeScaleRangeParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setSampleSize(value: Double): Self = this.set("sampleSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleSize: Self = this.set("sampleSize", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

