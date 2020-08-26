package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorCreatePCTrueColorRendererParams extends Object {
  /**
    * The number of points per inch in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    *
    * @default 25
    */
  var density: js.UndefOr[Double] = js.native
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    */
  var layer: PointCloudLayer = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    *
    * @default 100%
    */
  var size: js.UndefOr[String] = js.native
}

object colorCreatePCTrueColorRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: PointCloudLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): colorCreatePCTrueColorRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[colorCreatePCTrueColorRendererParams]
  }
  @scala.inline
  implicit class colorCreatePCTrueColorRendererParamsOps[Self <: colorCreatePCTrueColorRendererParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: PointCloudLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDensity(value: Double): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDensity: Self = this.set("density", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

