package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains helper methods for generating data-driven visualizations with continuous color or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The methods in this module generate renderer or visual variable objects that may be applied directly to a supported layer. The renderers specify how features should be visualized based on data values and colors optimized based on the indicated basemap.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html)
  */
@js.native
trait color extends js.Object {
  /**
    * Generates a continuous color [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields. The age of a feature is calculated based on a given `startTime` and `endTime`, one of which must be a date field in the input `layer`. This method generates an Arcade expression and calculates statistics on the output of the expression to accomplish this. The resulting renderer contains a continuous color visual variable that maps optimal colors based on the indicated basemap to data values based on the resulting statistics of the expression.  You are required to provide a `layer`, `view`, `startTime`, and `endTime` to generate this renderer. Optionally, you can set a `unit` and a `theme` for the visualization. Other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    *
    * @param params Input parameters for generating a continuous color visualization of age for time data returned from start and/or end date field(s). See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.startTime The name of the field, or a date value representing the start time in the age calculation. If a date value is specified, then the `endTime` parameter must reference a Date field in the layer.
    * @param params.endTime The name of the field, or a date value representing the end time in the age calculation. If a date value is specified, then the `startTime` parameter must reference a Date field in the layer.
    * @param params.unit The time unit used to calculate the difference between `endTime` and `startTime`. If a unit is not specified, then a suggested unit is determined based on the spread and distribution of the data.
    * @param params.maxValue Sets a maximum age for the visualization. Even if data exists above this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    * @param params.minValue Sets a minimum age for the visualization. Even if data exists below this value, only statistics will be calculated for values between the `minValue` and `maxValue`. Added at version 4.15.
    * @param params.theme
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    *   | Value | Description | Example |
    *   | ----- | ----------- | ------- |
    *   | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    *   | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    *   | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    *   | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.outlineOptimizationEnabled For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.sizeOptimizationEnabled For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. The `createAgeRenderer()` method generates an Arcade expression and executes a statistics query against the layer for the result of the expression. If statistics for the expression have already been generated, then pass the object here to avoid making a second statistics query.
    * @param params.colorScheme In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    *   | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    *   Value | Description
    *   ------|------------
    *   tint | Applies the symbol `color` to the desaturated geometry/texture color.
    *   replace | Removes the geometry/texture color and applies the symbol `color`.
    *   multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    * @param params.edgesType Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    */
  def createAgeRenderer(params: colorCreateAgeRendererParams): js.Promise[AgeRendererResult] = js.native
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method. The resulting renderer defines the symbol color of each feature based on the value of the given `field` value. A default color scheme is determined based on the given `basemap`. Depending on the `classificationMethod`, class breaks (or data ranges) are generated based on the statistics of the data. Each feature is assigned a color based on the class break in which the value of the `field` falls.  In most cases you will provide a `layer`, `basemap`, `field`, and `classificationMethod` to generate this renderer. This is a scenario in which the statistics of the data aren't well known and the user doesn't know what colors to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    *
    * @param params Input parameters for generating a classed color visualization based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and classified. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.normalizationType With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations. For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    * Indicates how the data is normalized. The data value obtained from the `field` is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the `field` value by the value of `normalizationField`. This value is set by default if the `normalizationField` is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use `normalizationTotal` to define the total value by which to normalize. This value is set by default if the `normalizationTotal` is provided.
    *
    * @param params.normalizationTotal When `normalizationType` is `percent-of-total`, this property contains the total of all data values.
    * @param params.classificationMethod
    * The classification method used for generating breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * equal-interval | Divides the range of attribute values into equal-sized subranges. For example, if you specify three classes for a field whose values range from 0 to 300, this method will create three classes with ranges of 0–100, 101–200, and 201–300. Equal interval is best applied to familiar data ranges, such as percentages and temperature. This method emphasizes the amount of an attribute value relative to other values. For example, it could show if a store is part of the group of stores that make up the top one-third of all sales.
    * natural-breaks | Groups similar values that maximize the differences between classes. Features are divided into classes whose boundaries are set where there are relatively big differences in the data values. Natural breaks are data-specific classifications and not useful for comparing multiple maps built from different underlying information.
    * quantile | Assigns the same number of data values to each class. This is well suited to linearly distributed data. Because features are grouped in equal numbers in each class, the resulting map can often be misleading. Similar features can potentially be placed in adjacent classes, or features with widely different values can be put in the same class. You can minimize this distortion by increasing the number of classes.
    * standard-deviation | Creates class breaks with equal value ranges that are a proportion of the standard deviation. This is usually done at intervals of one, one-half, one-third, or one-fourth standard deviations from the mean.
    * @param params.standardDeviationInterval If a `standard-deviation` classification method is used, then this indicates the interval by which to generate class breaks.  **Possible Values:** 1 | 0.5 | 0.33 | 0.25
    * @param params.numClasses The number of class breaks to generate. This is ignored if a `standard-deviation` classification method is specified.
    * @param params.colorScheme In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.outlineOptimizationEnabled For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to describe a field instead of using the field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.minValue A minimum value set by the user. Use this in conjunction with `maxValue` to generate class breaks between lower and upper bounds. This will be the lower bound of the lowest class break.
    * @param params.maxValue A maximum value set by the user. Use this in conjunction with `minValue` to generate class breaks between lower and upper bounds. This will be the upper bound of the highest class break.
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the symbol `color` to the unsaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the symbol `color`.
    * multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    * @param params.edgesType Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    */
  def createClassBreaksRenderer(params: colorCreateClassBreaksRendererParams): js.Promise[ClassBreaksRendererResult] = js.native
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method. The renderer contains a continuous color visual variable that maps optimal colors based on the indicated basemap to specific stop values based on queried statistics from the indicated field or expression.  In most cases you will provide a `layer`, `basemap`, `field`, and `theme` to generate this renderer. This is a scenario in which the statistics of the data aren't well known and the user doesn't know what colors to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the statistics object to the `statistics` parameter to avoid making an extra call to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer)
    *
    * @param params Input parameters for generating a continuous color visualization based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.theme
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.colorScheme In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.outlineOptimizationEnabled For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.sizeOptimizationEnabled For point and polyline layers only. Indicates whether symbol sizes should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned color visual variable.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned color visual variable.
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value and features that do not fall within the configured data range.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sizes uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the symbol `color` to the unsaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the symbol `color`.
    * multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    * @param params.edgesType Indicates whether to add edges to the output renderer. This setting only applies to mesh SceneLayers.
    *
    */
  def createContinuousRenderer(params: colorCreateContinuousRendererParams): js.Promise[ContinuousRendererResult] = js.native
  /**
    * Generates a [PointCloudStretchRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html) with a color scheme best-suited for the given basemap based on statistics returned from a given field of a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html). All that's required is a layer instance, field name, and basemap ID. You can optionally set the size and density of the points to suit the needs of the desired visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
    *
    * @param params Input parameters for generating a renderer based on the given field of the input layer. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. The only field names used for this renderer type are `elevation` and `intensity`.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.size The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    * @param params.density The number of points per inch in the view.
    * @param params.colorScheme In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the stats object here to avoid making a second statistics
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController). query to the server.
    *
    */
  def createPCContinuousRenderer(params: colorCreatePCContinuousRendererParams): js.Promise[PCContinuousRendererResult] = js.native
  /**
    * Generates a [PointCloudRGBRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html) based on the `RGB` field of a given [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html). This method simplifies the experience of creating a [PointCloudRGBRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html) manually. All that's required is a layer instance. You can optionally set the size and density of the points to suit the needs of the desired visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    *
    * @param params Input parameters for generating a true color visualization based on the `RGB` field of the input layer. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.size The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    * @param params.density The number of points per inch in the view.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createPCTrueColorRenderer(params: colorCreatePCTrueColorRendererParams): js.Promise[PCTrueColorRendererResult] = js.native
  /**
    * This method generates a color visual variable with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and colors based on the input basemap.  There are two different ways this method may be called. The most common case is by providing a `layer`, `basemap`, `field`, and `theme`. This is the scenario where the statistics of the data aren't well known and the user doesn't know what colors to use. You can optionally use a `valueExpression` instead of a field to visualize features based on a numeric value returned from a script executed at runtime.  The other options are provided for convenience for more involved custom visualization authoring applications. For example, if you already generated statistics in another operation, you can pass the object in the `statistics` parameter to avoid making an extra call to the server. You can also provide a `colorScheme` if you don't want one picked for you. In this case the `basemap` and `theme` options would be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createVisualVariable)
    *
    * @param params Input parameters for generating a color visual variable based on data returned from a given field or expression. See the table below for details of each parameter.
    * @param params.layer The layer for which the visual variable is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.normalizationField The name of the field to normalize the values of the given `field`. Providing a normalization field helps minimize some visualization errors and standardizes the data so all features are visualized with minimal bias due to area differences or count variation. This option is commonly used when visualizing densities.
    * @param params.theme
    * Determines which values will be emphasized in the continuous ramp and the map. Possible values are listed below.
    *
    * | Value | Description | Example |
    * | ----- | ----------- | ------- |
    * | high-to-low | High values are emphasized with strong colors. | ![high-to-low](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-high-to-low.png) |
    * | above-and-below | Values centered around a given point (e.g. the average) are visualized with weak colors while other values are emphasized with strong colors. | ![above-and-below](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-above-and-below.png) |
    * | centered-on | Values centered around a given point (e.g. the average) are emphasized with strong colors while other values are visualized with weak colors. | ![centered-on](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-centered-on.png) |
    * | extremes | High and low values are emphasized with strong colors. All others are visualized with weak colors. | ![extremes](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/sm-extremes.png) |
    * @param params.colorScheme In authoring apps, the user may select a pre-defined color scheme. Pass the scheme object to this property to avoid getting one based on a `theme` and the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.sqlExpression A SQL expression evaluating to a number.
    * @param params.sqlWhere A SQL where clause used to filter features for the statistics query. For example, this is useful in situations where you want to avoid dividing by zero as is the case with creating a predominance visualization.
    * @param params.legendOptions Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.statistics A statistics object generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-summaryStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.minValue A custom minimum value set by the user. Use this in conjunction with `maxValue` to generate statistics between lower and upper bounds. This will be the lowest stop in the returned color visual variable.
    * @param params.maxValue A custom maximum value set by the user. Use this in conjunction with `minValue` to generate statistics between lower and upper bounds. This will be the uppermost stop in the returned color visual variable.
    * @param params.worldScale Indicates if the size units of the symbols will be in meters. This should be `true` when generating visualizations with 3D volumetric symbology, except for layers with a `mesh` geometry type. A `view` must be provided if this property is set to `true`.
    * @param params.signal Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def createVisualVariable(params: colorCreateVisualVariableParams): js.Promise[VisualVariableResult] = js.native
}

object color {
  @scala.inline
  def apply(
    createAgeRenderer: colorCreateAgeRendererParams => js.Promise[AgeRendererResult],
    createClassBreaksRenderer: colorCreateClassBreaksRendererParams => js.Promise[ClassBreaksRendererResult],
    createContinuousRenderer: colorCreateContinuousRendererParams => js.Promise[ContinuousRendererResult],
    createPCContinuousRenderer: colorCreatePCContinuousRendererParams => js.Promise[PCContinuousRendererResult],
    createPCTrueColorRenderer: colorCreatePCTrueColorRendererParams => js.Promise[PCTrueColorRendererResult],
    createVisualVariable: colorCreateVisualVariableParams => js.Promise[VisualVariableResult]
  ): color = {
    val __obj = js.Dynamic.literal(createAgeRenderer = js.Any.fromFunction1(createAgeRenderer), createClassBreaksRenderer = js.Any.fromFunction1(createClassBreaksRenderer), createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createPCContinuousRenderer = js.Any.fromFunction1(createPCContinuousRenderer), createPCTrueColorRenderer = js.Any.fromFunction1(createPCTrueColorRenderer), createVisualVariable = js.Any.fromFunction1(createVisualVariable))
    __obj.asInstanceOf[color]
  }
  @scala.inline
  implicit class colorOps[Self <: color] (val x: Self) extends AnyVal {
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
    def setCreateAgeRenderer(value: colorCreateAgeRendererParams => js.Promise[AgeRendererResult]): Self = this.set("createAgeRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateClassBreaksRenderer(value: colorCreateClassBreaksRendererParams => js.Promise[ClassBreaksRendererResult]): Self = this.set("createClassBreaksRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateContinuousRenderer(value: colorCreateContinuousRendererParams => js.Promise[ContinuousRendererResult]): Self = this.set("createContinuousRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatePCContinuousRenderer(value: colorCreatePCContinuousRendererParams => js.Promise[PCContinuousRendererResult]): Self = this.set("createPCContinuousRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCreatePCTrueColorRenderer(value: colorCreatePCTrueColorRendererParams => js.Promise[PCTrueColorRendererResult]): Self = this.set("createPCTrueColorRenderer", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateVisualVariable(value: colorCreateVisualVariableParams => js.Promise[VisualVariableResult]): Self = this.set("createVisualVariable", js.Any.fromFunction1(value))
  }
  
}

