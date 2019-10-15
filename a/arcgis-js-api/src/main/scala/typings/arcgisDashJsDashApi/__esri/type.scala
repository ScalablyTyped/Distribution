package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This object contains helper methods for generating data-driven visualizations with unique types (or categories) based on a field value from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). The [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer) method generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) object that may be applied directly to the layer used to generate it. This renderer contains unique values with colors best suited to the given basemap.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html)
  */
trait `type` extends js.Object {
  /**
    * Generates a [PointCloudUniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html) based on a given field of a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html). This renderer visualizes points of the same type, usually from the `CLASS_CODE` field or an equivalent field that stores information related to the classification of the data (e.g. low vegetation, high vegetation, ground, etc.). The generated renderer visualizes each point with a standard predefined color matching the class code of the point.  All that's required is a layer instance and field name. You can optionally set the size and density of the points to suit the needs of the desired visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createPCClassRenderer)
    *
    * @param params Input parameters for generating a renderer based on the given field of the input layer. See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.field The name of the field containing classification data for the given layer. A common field name used for this renderer type is `CLASS_CODE`, though other fields can be used.
    * @param params.size The size of each point expressed as a percentage. This value will determine point sizes scaled based on the given `density` of points. When the value is `100%`, the size of each point is set so that it minimizes the number of gaps between neighboring points. Any value above `100%` will allow for points to overlap neighboring points scaled to the given value. Values below `100%` scale point sizes smaller so there appear to be more gaps between points.
    * @param params.density The number of points per inch in the view.
    * @param params.typeScheme In authoring apps, the user may select a pre-defined type scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.statistics A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    */
  def createPCClassRenderer(params: typeCreatePCClassRendererParams): IPromise[PCClassRendererResult]
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) that supports renderers. The renderer contains unique symbols representing a string or a numeric value returned from the indicated field.  In most cases you will provide a `layer`, `basemap`, and `field` to generate this renderer. This is a scenario in which the values of the field aren't well known and the user doesn't know which colors to use in the visualization. You can also use a `valueExpression` instead of a `field` to visualize features based on a value returned from a script executed at runtime.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#createRenderer)
    *
    * @param params Input parameters for generating symbols to represent unique types based on data returned from a given field. See the table below for details of each parameter.
    * @param params.layer The layer for which the renderer is generated.
    * @param params.view The view where the input layer is rendered. This method inspects the view's background (i.e. basemap, web map background, or view container) to determine optimal colors for the output renderer. This parameter should always be set in practice, but if not provided this method will assume the generated renderer will display on a light background. This parameter is required when creating renderers using a `valueExpression` or for renderers intended for display in a SceneView.
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    * @param params.field The name of the field from which to extract unique values that will be used for the basis of the data-driven visualization. This property is ignored if a `valueExpression` is used.
    * @param params.numTypes The number of types (or categories) displayed by the renderer. Use `-1` to display all returned types.
    * @param params.sortBy
    * Indicates how values should be sorted in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). See the table below for information about values that may be passed to this parameter.
    *
    * Possible Value | Description
    * ---------------|------------
    * count | Unique values/types will be sorted from highest to lowest based on the count of features that fall in each category.
    * value | Unique values/types will be sorted in alphabetical order.
    *
    * **Possible Values:** count | value
    * @param params.typeScheme In authoring apps, the user may select a pre-defined type scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.valueExpression An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a number or a string. This expression can reference field values using the `$feature` global variable. This property overrides the `field` property and therefore is used instead of an input `field` value.
    * @param params.valueExpressionTitle Text describing the value returned from the `valueExpression`. This is used by the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
    * @param params.outlineOptimizationEnabled For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for setting a title to a field that will override the field alias defined in the service. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter can be ignored for layers with a `mesh` geometry type. Possible values are described below.
    *
    * | Value | Description |
    * | ----- | ----------- |
    * | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    * | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    * | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and only the symbol's height should be variable, for example with cylinders. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * | 3d-volumetric-uniform | Generates a visualization using uniformly-sized 3D symbols with volumetric symbol layers. Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) and the symbol should be sized uniformly, for example with spheres. A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.statistics A statistics object generated from the [uniqueValues](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-uniqueValues.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    * Value | Description
    * ------|------------
    * tint | Applies the symbol `color` to the desaturated geometry/texture color.
    * replace | Removes the geometry/texture color and applies the symbol `color`.
    * multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    */
  def createRenderer(params: typeCreateRendererParams): IPromise[typeRendererResult]
}

@JSGlobal("__esri.type")
@js.native
object `type` extends TopLevel[`type`]

