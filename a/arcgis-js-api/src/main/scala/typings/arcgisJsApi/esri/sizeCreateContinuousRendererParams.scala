package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-flat`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric-uniform`
import typings.arcgisJsApi.arcgisJsApiStrings.`3d-volumetric`
import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait sizeCreateContinuousRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * The layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[sizeCreateContinuousRendererParamsLegendOptions] = js.native
  /**
    * A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var maxValue: js.UndefOr[Double] = js.native
  /**
    * A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned size visual variable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var minValue: js.UndefOr[Double] = js.native
  /**
    * The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var normalizationField: js.UndefOr[String] = js.native
  /**
    * Only for polygon layers. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @default false
    */
  var outlineOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @default false
    */
  var sizeOptimizationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.native
  /**
    * A SQL expression evaluating to a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var sqlExpression: js.UndefOr[String] = js.native
  /**
    * A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var sqlWhere: js.UndefOr[String] = js.native
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.native
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sized uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[`2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var valueExpression: js.UndefOr[String] = js.native
  /**
    * Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.native
  /**
    * The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[View] = js.native
}

object sizeCreateContinuousRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): sizeCreateContinuousRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[sizeCreateContinuousRendererParams]
  }
  @scala.inline
  implicit class sizeCreateContinuousRendererParamsOps[Self <: sizeCreateContinuousRendererParams] (val x: Self) extends AnyVal {
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
    def setDefaultSymbolEnabled(value: Boolean): Self = this.set("defaultSymbolEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultSymbolEnabled: Self = this.set("defaultSymbolEnabled", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setLegendOptions(value: sizeCreateContinuousRendererParamsLegendOptions): Self = this.set("legendOptions", value.asInstanceOf[js.Any])
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
    def setNormalizationField(value: String): Self = this.set("normalizationField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalizationField: Self = this.set("normalizationField", js.undefined)
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
    def setSizeScheme(value: SizeScheme): Self = this.set("sizeScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeScheme: Self = this.set("sizeScheme", js.undefined)
    @scala.inline
    def setSqlExpression(value: String): Self = this.set("sqlExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlExpression: Self = this.set("sqlExpression", js.undefined)
    @scala.inline
    def setSqlWhere(value: String): Self = this.set("sqlWhere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqlWhere: Self = this.set("sqlWhere", js.undefined)
    @scala.inline
    def setStatistics(value: SummaryStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setSymbolType(value: `2d` | `3d-flat` | `3d-volumetric` | `3d-volumetric-uniform`): Self = this.set("symbolType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbolType: Self = this.set("symbolType", js.undefined)
    @scala.inline
    def setValueExpression(value: String): Self = this.set("valueExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpression: Self = this.set("valueExpression", js.undefined)
    @scala.inline
    def setValueExpressionTitle(value: String): Self = this.set("valueExpressionTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueExpressionTitle: Self = this.set("valueExpressionTitle", js.undefined)
    @scala.inline
    def setView(value: View): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

