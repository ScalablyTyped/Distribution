package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dotDensityCreateRendererParams extends Object {
  /**
    * A set of complementary numeric fields/expressions used as the basis of the dot density visualization. For example, if creating an election map, you would indicate the names of each field representing the candidate or political party where total votes are stored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var attributes: js.Array[dotDensityCreateRendererParamsAttributes] = js.native
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * Indicates whether to enable color blending of different colored dots rendered at the same pixel. This is only visible in highly dense and highly diverse features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    *
    * @default true
    */
  var dotBlendingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * In authoring apps, the user may select a pre-defined dot density scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var dotDensityScheme: js.UndefOr[DotDensityScheme] = js.native
  /**
    * Indicates whether to vary the value of each dot by the view's scale. This will set the [referenceScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html#referenceScale) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    *
    * @default true
    */
  var dotValueOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The **polygon** layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var layer: FeatureLayer | GeoJSONLayer = js.native
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var legendOptions: js.UndefOr[dotDensityCreateRendererParamsLegendOptions] = js.native
  /**
    * Indicates whether the polygon outline width should vary based on view scale. When false, no outline will be used in the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * The MapView instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView = js.native
}

object dotDensityCreateRendererParams {
  @scala.inline
  def apply(
    attributes: js.Array[dotDensityCreateRendererParamsAttributes],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): dotDensityCreateRendererParams = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[dotDensityCreateRendererParams]
  }
  @scala.inline
  implicit class dotDensityCreateRendererParamsOps[Self <: dotDensityCreateRendererParams] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: dotDensityCreateRendererParamsAttributes*): Self = this.set("attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: js.Array[dotDensityCreateRendererParamsAttributes]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: FeatureLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: MapView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setDotBlendingEnabled(value: Boolean): Self = this.set("dotBlendingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotBlendingEnabled: Self = this.set("dotBlendingEnabled", js.undefined)
    @scala.inline
    def setDotDensityScheme(value: DotDensityScheme): Self = this.set("dotDensityScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotDensityScheme: Self = this.set("dotDensityScheme", js.undefined)
    @scala.inline
    def setDotValueOptimizationEnabled(value: Boolean): Self = this.set("dotValueOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotValueOptimizationEnabled: Self = this.set("dotValueOptimizationEnabled", js.undefined)
    @scala.inline
    def setLegendOptions(value: dotDensityCreateRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = this.set("outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineOptimizationEnabled: Self = this.set("outlineOptimizationEnabled", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

