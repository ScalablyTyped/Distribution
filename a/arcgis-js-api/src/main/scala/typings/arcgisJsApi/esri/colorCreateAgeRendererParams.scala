package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-and-below`
import typings.arcgisJsApi.arcgisJsApiStrings.`centered-on`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-to-low`
import typings.arcgisJsApi.arcgisJsApiStrings.days
import typings.arcgisJsApi.arcgisJsApiStrings.extremes
import typings.arcgisJsApi.arcgisJsApiStrings.hours
import typings.arcgisJsApi.arcgisJsApiStrings.minutes
import typings.arcgisJsApi.arcgisJsApiStrings.months
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.seconds
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.years
import typings.std.AbortSignal
import typings.std.Date
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait colorCreateAgeRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    *   Value | Description
    *   ------|------------
    *   tint | Applies the symbol `color` to the desaturated geometry/texture color.
    *   replace | Removes the geometry/texture color and applies the symbol `color`.
    *   multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default replace
    */
  var colorMixMode: js.UndefOr[String] = js.native
  /**
    * In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var colorScheme: js.UndefOr[ColorScheme] = js.native
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default none
    */
  var edgesType: js.UndefOr[solid | none] = js.native
  /**
    * The name of the field, or a date value representing the end time in the age calculation. If a date value is specified, then the `startTime` parameter must reference a Date field in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var endTime: Date | String | Double = js.native
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var legendOptions: js.UndefOr[colorCreateAgeRendererParamsLegendOptions] = js.native
  /**
    * Sets a maximum age for the visualization. Even if data exists above this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * Sets a minimum age for the visualization. Even if data exists below this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the field, or a date value representing the start time in the age calculation. If a date value is specified, then the `endTime` parameter must reference a Date field in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var startTime: Date | String | Double = js.native
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.native
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *   | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  /**
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    *   | Value | Description | Example |
    *   | ----- | ----------- | ------- |
    *   | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    *   | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    *   | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    *   | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var theme: js.UndefOr[`high-to-low` | `above-and-below` | `centered-on` | extremes] = js.native
  /**
    * The time unit used to calculate the difference between `endTime` and `startTime`. If a unit is not specified, then a suggested unit is determined based on the spread and distribution of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  var unit: js.UndefOr[years | months | days | hours | minutes | seconds] = js.native
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer.
    *
    * [Read more...](global.html)
    */
  var view: View = js.native
}

object colorCreateAgeRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    endTime: Date | String | Double,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    startTime: Date | String | Double,
    view: View
  ): colorCreateAgeRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), startTime = startTime.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorCreateAgeRendererParams]
  }
  @scala.inline
  implicit class colorCreateAgeRendererParamsOps[Self <: colorCreateAgeRendererParams] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Date | String | Double): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date | String | Double): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setColorMixMode(value: String): Self = this.set("colorMixMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorMixMode: Self = this.set("colorMixMode", js.undefined)
    @scala.inline
    def setColorScheme(value: ColorScheme): Self = this.set("colorScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorScheme: Self = this.set("colorScheme", js.undefined)
    @scala.inline
    def setDefaultSymbolEnabled(value: Boolean): Self = this.set("defaultSymbolEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSymbolEnabled: Self = this.set("defaultSymbolEnabled", js.undefined)
    @scala.inline
    def setEdgesType(value: solid | none): Self = this.set("edgesType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdgesType: Self = this.set("edgesType", js.undefined)
    @scala.inline
    def setLegendOptions(value: colorCreateAgeRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendOptions: Self = this.set("legendOptions", js.undefined)
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
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
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    @scala.inline
    def setTheme(value: `high-to-low` | `above-and-below` | `centered-on` | extremes): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setUnit(value: years | months | days | hours | minutes | seconds): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

