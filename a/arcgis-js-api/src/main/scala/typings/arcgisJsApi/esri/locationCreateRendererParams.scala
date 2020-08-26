package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait locationCreateRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the symbol `color` to the unsaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the symbol `color`.
    * multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.native
  /**
    * Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default none
    */
  var edgesType: js.UndefOr[solid | none] = js.native
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * In authoring apps, the user may select a pre-defined location scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    */
  var locationScheme: js.UndefOr[LocationScheme] = js.native
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-location.html#createRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}

object locationCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): locationCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[locationCreateRendererParams]
  }
  @scala.inline
  implicit class locationCreateRendererParamsOps[Self <: locationCreateRendererParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setColorMixMode(value: String): Self = this.set("colorMixMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMixMode: Self = this.set("colorMixMode", js.undefined)
    @scala.inline
    def setEdgesType(value: solid | none): Self = this.set("edgesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesType: Self = this.set("edgesType", js.undefined)
    @scala.inline
    def setLocationScheme(value: LocationScheme): Self = this.set("locationScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationScheme: Self = this.set("locationScheme", js.undefined)
    @scala.inline
    def setOutlineOptimizationEnabled(value: Boolean): Self = this.set("outlineOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutlineOptimizationEnabled: Self = this.set("outlineOptimizationEnabled", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSizeOptimizationEnabled(value: Boolean): Self = this.set("sizeOptimizationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeOptimizationEnabled: Self = this.set("sizeOptimizationEnabled", js.undefined)
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

