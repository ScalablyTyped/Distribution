package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sizeCreateAgeRendererParams
  extends stdLib.Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[java.lang.String | Basemap] = js.undefined
  /**
    * Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    *
    * @default true
    */
  var defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The name of the field, or a date value representing the end time in the age calculation. If a date value is specified, then the `startTime` parameter must reference a Date field in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var endTime: stdLib.Date | java.lang.String | scala.Double
  /**
    * The layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer
  /**
    * Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var legendOptions: js.UndefOr[sizeCreateAgeRendererParamsLegendOptions] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
  /**
    * The name of the field, or a date value representing the start time in the age calculation. If a date value is specified, then the `endTime` parameter must reference a Date field in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var startTime: stdLib.Date | java.lang.String | scala.Double
  /**
    * A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var statistics: js.UndefOr[SummaryStatisticsResult] = js.undefined
  /**
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    *
    * @default 2d
    */
  var symbolType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time unit used to calculate the difference between `endTime` and `startTime`. If a unit is not specified, then a suggested unit is determined based on the spread and distribution of the data.  **Possible Values:** years | months | days | hours | minutes | seconds
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createAgeRenderer)
    */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}

object sizeCreateAgeRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    endTime: stdLib.Date | java.lang.String | scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    startTime: stdLib.Date | java.lang.String | scala.Double,
    view: View,
    basemap: java.lang.String | Basemap = null,
    defaultSymbolEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    legendOptions: sizeCreateAgeRendererParamsLegendOptions = null,
    sizeScheme: SizeScheme = null,
    statistics: SummaryStatisticsResult = null,
    symbolType: java.lang.String = null,
    unit: java.lang.String = null
  ): sizeCreateAgeRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, endTime = endTime.asInstanceOf[js.Any], hasOwnProperty = hasOwnProperty, layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = propertyIsEnumerable, startTime = startTime.asInstanceOf[js.Any], view = view)
    if (basemap != null) __obj.updateDynamic("basemap")(basemap.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultSymbolEnabled)) __obj.updateDynamic("defaultSymbolEnabled")(defaultSymbolEnabled)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    if (symbolType != null) __obj.updateDynamic("symbolType")(symbolType)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[sizeCreateAgeRendererParams]
  }
}

