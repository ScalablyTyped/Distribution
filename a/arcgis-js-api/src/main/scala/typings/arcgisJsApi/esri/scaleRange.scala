package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Function for determining suggested [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale) scale ranges for an input layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html)
  */
@js.native
trait scaleRange extends js.Object {
  /**
    * Generates a suggested scale range (i.e. [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#minScale) and [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#maxScale)) to apply to the input `layer`. These values suggest the best scale range for viewing the input layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-heuristics-scaleRange.html#scaleRange)
    *
    * @param params See the table below for details about parameters that may be passed to this function.
    * @param params.layer The layer for which to generate a suggested min/max scale range.
    * @param params.view The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    * @param params.sampleSize The number of features in the `layer` to sample for spatial statistics. A higher sample size will yield more precise results. However, higher sample sizes also require more time for the function to process the result.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def scaleRange(params: scaleRangeScaleRangeParams): js.Promise[ScaleRangeResult] = js.native
}

object scaleRange {
  @scala.inline
  def apply(scaleRange: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): scaleRange = {
    val __obj = js.Dynamic.literal(scaleRange = js.Any.fromFunction1(scaleRange))
    __obj.asInstanceOf[scaleRange]
  }
  @scala.inline
  implicit class scaleRangeOps[Self <: scaleRange] (val x: Self) extends AnyVal {
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
    def setScaleRange(value: scaleRangeScaleRangeParams => js.Promise[ScaleRangeResult]): Self = this.set("scaleRange", js.Any.fromFunction1(value))
  }
  
}

