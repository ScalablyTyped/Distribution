package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends Accessor {
  /**
    * The cardinality which specifies the number of objects in the origin [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) related to the number of objects in the destination [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Please see the [Desktop help](http://desktop.arcgis.com/en/arcmap/10.3/manage-data/relationships/relationship-class-properties.htm#GUID-989CB1D1-AC51-4A4C-8D9D-0AB9E647FFFD) for additional information on cardinality.  **Possible values:** one-to-one | one-to-many | many-to-many
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#cardinality)
    */
  var cardinality: String = js.native
  /**
    * The unique ID for the relationship. These ids for the relationships the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) participates in are listed in the ArcGIS Services directory.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#id)
    */
  var id: Double = js.native
  /**
    * The field used to establish the relate within the [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#keyField)
    */
  var keyField: String = js.native
  /**
    * The name of the relationship.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#name)
    */
  var name: String = js.native
  /**
    * The unique ID of the related [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Relationship.html#relatedTableId)
    */
  var relatedTableId: Double = js.native
}

/**
  * This object contains a helper method for creating a renderer for exploring the relationship between two numeric attributes. This is commonly known as a [bivariate choropleth](http://www.joshuastevens.net/cartography/make-a-bivariate-choropleth-map/) visualization. This renderer classifies each variable in either 2, 3, or 4 classes along separate color ramps. One of those ramps is rotated 90 degrees and overlaid on the other to create a 2x2, 3x3, or 4x4 square grid. The x-axis indicates the range of values for one variable, and the y-axis indicates the range for the second variable. The squares running diagonal from the lower left corner to the upper right corner indicate features where the two variables may be related or in agreement with one another.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html)
  */
trait relationship extends js.Object {
  /**
    * Generates a relationship renderer (bivariate choropleth) based on a set of competing numeric fields.  Each feature's category is determined based on the result of an Arcade expression generated internally by this method. You are required provide a `layer`, `view`, `field1` name, and `field2` name to generate this renderer. Optionally, you can set the `focus` to change the rotation of the legend and the `numClasses` parameter to change the grid size of the legend.  Other options are provided for convenience for more involved custom visualization authoring applications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)
    *
    * @param params Input parameters for generating a relationship visualization based on a pair of numeric field(s). See the table below for details of each parameter.
    * @param params.layer The layer for which the visualization is generated.
    * @param params.view The view instance in which the visualization will be rendered.
    * @param params.field1 A numeric field that will be used to explore its relationship with `field2`. In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.field2 A numeric field that will be used to explore its relationship with `field1`. In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.classificationMethod The method for classifying each field's data values. See [classBreaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks) for more information about each classification type.  **Possible Values:** quantile | equal-interval | natural-breaks
    * @param params.focus
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This value does not change the renderer or symbology of any features in the layer. This affects the legend only. See the table below for a description of the possible values. See the class description at the top of this page for a more thorough explanation of how to read the legend.
    *
    *   Value | Example | Description
    *   ------|-------------|--------
    *   null | ![relationship-legend-null](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-null.png) | The legend renders as a square. The top right corner of the legend indicates that values from both `field1` and `field2` are considered high. |
    *   HH | ![relationship-legend-hh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hh.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered high. |
    *   HL | ![relationship-legend-hl](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hl.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are high and values from `field2` are low. |
    *   LH | ![relationship-legend-lh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-lh.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are low and values from `field2` are high. |
    *   LL | ![relationship-legend-ll](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-ll.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered low. |
    * @param params.numClasses
    * Indicates the number of classes by which to break up the values of each field. More classes give you more detail, but more colors, making the visualization more difficult to understand. There are only three possible values.
    *
    * 2 classes | 3 classes | 4 classes
    * --|--|---
    * ![relationship-breaks-2](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-2.png) | ![relationship-breaks-3](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-3.png) | ![relationship-breaks-4](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-4.png)
    *
    * **Possible Values:** 2 | 3 | 4
    * @param params.basemap The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization.
    * @param params.outlineOptimizationEnabled For polygon layers only. Indicates whether the polygon outline width should vary based on view scale. When set, a valid [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) instance must be provided in the `view` parameter. This option is not supported for 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    * @param params.legendOptions Provides options for modifying [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) properties describing the visualization.
    * @param params.relationshipScheme In authoring apps, the user may select a pre-defined relationship scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    * @param params.symbolType
    * The type of symbol to generate. This depends on the view in which you are working and the desired visualization. This parameter does not need to be specified for layers with a `mesh` geometry type. Possible values are described below.
    *
    *   | Value | Description |
    *   | ----- | ----------- |
    *   | 2d | Generates a visualization using 2D symbols such as [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), or [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html). Use this option if generating a visualization for data in a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). |
    *   | 3d-flat | Generates a visualization using 3D symbols with flat symbol layers such as [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html), [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html), or [FillSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html). Use this option if generating a 2D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). |
    *   | 3d-volumetric | Generates a visualization using 3D symbols with volumetric symbol layers such as [ObjectSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html), [PathSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html), or [ExtrudeSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html). Use this option if generating a 3D visualization for data in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). A SceneView instance must be provided to the `view` parameter if this option is used. |
    * @param params.defaultSymbolEnabled Enables the `defaultSymbol` on the renderer and assigns it to features with no value or that fall outside of the prescribed class breaks.
    * @param params.colorMixMode
    * **This option only applies to generating renderers for mesh SceneLayers**. Specifies how the symbol's color is applied to the geometry color/texture. See the documentation in [FillSymbol3DLayer.material](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material) for more context. See the table below for possible values.
    *
    *   Value | Description
    *   ------|------------
    *   tint | Applies the symbol `color` to the desaturated geometry/texture color.
    *   replace | Removes the geometry/texture color and applies the symbol `color`.
    *   multiply | Multiplies geometry/texture color value with the symbol `color` value. The result is a darker color. Multiplying with white keeps the geometry color the same.
    *
    */
  def createRenderer(params: relationshipCreateRendererParams): IPromise[relationshipRendererResult]
  /**
    * Updates a relationship renderer (bivariate choropleth) generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer) based on the given input parameters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#updateRenderer)
    *
    * @param params Input parameters for updating a relationship visualization created in [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer).
    * @param params.field1 A numeric field used to explore its relationship with `field2`. In the default visualization, the values of this field are rendered along the vertical axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.field2 A numeric field used to explore its relationship with `field1`. In the default visualization, the values of this field are rendered along the horizontal axis of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    * @param params.focus
    * Determines the orientation of the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html). This value does not change the renderer or symbology of any features in the layer. This affects the legend only. See the table below for a description of the possible values. See the class description at the top of this page for a more thorough explanation of how to read the legend.
    *
    *   Value | Example | Description
    *   ------|-------------|--------
    *   null | ![relationship-legend-null](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-null.png) | The legend renders as a square. The top right corner of the legend indicates that values from both `field1` and `field2` are considered high. |
    *   HH | ![relationship-legend-hh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hh.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered high. |
    *   HL | ![relationship-legend-hl](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-hl.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are high and values from `field2` are low. |
    *   LH | ![relationship-legend-lh](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-lh.png) | The legend renders as a diamond with the focus on the top corner where values from `field1` are low and values from `field2` are high. |
    *   LL | ![relationship-legend-ll](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-legend-ll.png) | The legend renders as a diamond with the focus on the top corner where values from both `field1` and `field2` are considered low. |
    * @param params.numClasses
    * Indicates the number of classes by which to break up the values of each field. More classes give you more detail, but more colors, making the visualization more difficult to understand. There are only three possible values.
    *
    * 2 classes | 3 classes | 4 classes
    * --|--|---
    * ![relationship-breaks-2](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-2.png) | ![relationship-breaks-3](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-3.png) | ![relationship-breaks-4](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/smartmapping/relationship-breaks-4.png)
    *
    * **Possible Values:** 2 | 3 | 4
    * @param params.colors The array of colors to be used by the symbols in the uniqueValueInfos of the renderer.
    * @param params.renderer The relationship renderer (generated from [createRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-relationship.html#createRenderer)) to update with the other parameters provided in this method.
    *
    */
  def updateRenderer(params: relationshipUpdateRendererParams): IPromise[UniqueValueRenderer]
}

@JSGlobal("__esri.Relationship")
@js.native
object Relationship extends TopLevel[RelationshipConstructor]

@JSGlobal("__esri.relationship")
@js.native
object relationship extends TopLevel[relationship]

