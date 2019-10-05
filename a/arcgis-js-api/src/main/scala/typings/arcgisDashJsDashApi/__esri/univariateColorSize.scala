package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains helper methods for generating data-driven univariate visualizations using both continuous color and continuous size based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The [createContinuousRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer) method generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) object that may be applied directly to a supported layer. This renderer contains a continuous color and size ramp with optimal colors based on the indicated basemap and mapped to specific break values based on the statistics of the indicated field or expression.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html)
  */
trait univariateColorSize extends js.Object {
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The renderer contains continuous color and size visual variables that map symbols with optimal colors and sizes based on the indicated basemap to specific stop values based on queried statistics from the indicated field or expression.  In most cases you will provide a `layer`, `basemap`, `field`, and `theme` to generate this renderer. This is a scenario in which the statistics of the data aren't well known and the user doesn't know what colors and sizes to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    *
    * @param params See the table below for details of each parameter that may be passed to this method.
    * @param params.layer The layer for which the visual variable is generated.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.sizeOptimizationEnabled Only for polygon layers in 2D MapViews. Indicates whether icon sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned visual variables.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned visual variables.
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    * @param params.colorOptions Options for configuring the color portion of the visualization.
    * @param params.sizeOptions Options for configuring the size portion of the visualization.
    * @param params.view The view instance in which the visualization will be rendered. A [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is required if `symbolType = "3d-volumetric"` or `3d-volumetric-uniform`. The relevant SceneView or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is required when a `valueExpression` is specified.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    *
    */
  def createContinuousRenderer(params: univariateColorSizeCreateContinuousRendererParams): IPromise[univariateColorSizeContinuousRendererResult]
  /**
    * This method generates color and size visual variables, both based on the same given field or expression. These visual variables are generated with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and colors based on the input basemap.  There are two different ways this method may be called. The most common case is by providing a `layer`, `basemap`, and `field`. This is the scenario where the statistics of the data aren't well known and the user doesn't know what colors to use. You can optionally use a `valueExpression` instead of a field to visualize features based on a numeric value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the object in the `statistics` parameter to avoid making an extra call to the server. You can also provide a `colorScheme` and/or a `sizeScheme` if you don't want one picked for you. In this case the `basemap` and `theme` options would be ignored.  The resulting array of visual variables will contain one color visual variable, and one or two size visual variables depending on the value of the `sizeOptions.axis` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    *
    * @param params Input parameters for generating color and size visual variables based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visual variable is generated.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned visual variables.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned visual variables.
    * @param params.colorOptions Options for configuring the color portion of the visualization.
    * @param params.sizeOptions Options for configuring the size portion of the visualization.
    * @param params.view When generating 3D symbols, a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance is required. The relevant SceneView or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) is required when a `valueExpression` is specified.
    * @param params.worldScale Indicates if the size units of the symbols will be in meters. This should be `true` when generating visualizations with 3D volumetric symbology. A `view` must be provided if this property is set to `true`.
    *
    */
  def createVisualVariables(params: univariateColorSizeCreateVisualVariablesParams): IPromise[VisualVariablesResult]
}

@JSGlobal("__esri.univariateColorSize")
@js.native
object univariateColorSize extends TopLevel[univariateColorSize]

