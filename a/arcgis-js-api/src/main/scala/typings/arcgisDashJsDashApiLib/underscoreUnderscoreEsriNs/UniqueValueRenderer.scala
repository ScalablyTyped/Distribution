package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueValueRenderer
  extends Renderer
     with VisualVariablesRenderer
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.renderersNs.Renderer
     with renderersRenderer {
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer. This is usually done when adding a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to the [visualVariables](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#visualVariables)) in a bivariate visualization (color indicates a type-based value and size indicates the value of a separate numeric field). Use this property to set a background [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) (or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) if visualizing data in 3D) to visualize the boundaries of each polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: FillSymbol | PolygonSymbol3D = js.native
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: java.lang.String = js.native
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: Symbol = js.native
  /**
    * The name of the attribute field the renderer uses to match unique values or types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: java.lang.String = js.native
  /**
    * If needed, specifies the name of an additional attribute field the renderer will use to match values. For example, if you specify two fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1",  // features in the "North" region and a rank of 1
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2",  // features in the "North" region and a rank of 2
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) and `field2` are unique values and
    * may have their own symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: java.lang.String = js.native
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values. For example, if you specify three fields:
    * ```js
    * var renderer = {
    *   type: "unique-value",  // autocasts as new UniqueValueRenderer()
    *   field: "REGION",
    *   field2: "RANK",
    *   field3: "CLASS",
    *   fieldDelimiter: ", ",  // comma + space used to separate values from all fields
    *   uniqueValueInfos: [
    *     {
    *       value: "North, 1, medium",  // features in the "North" region, a rank of 1, and "medium" class
    *       symbol: sym1  // will be assigned sym1
    *     }, {
    *       value: "North, 2, medium",  // features in the "North" region, a rank of 2, and a "medium class
    *       symbol: sym2  // will be assigned sym2
    *     },
    *     ...
    *   ]
    * };
    * ```
    *
    * All combinations of values of [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field), [field2](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2), and `field3` are unique values and
    * may have their own symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: java.lang.String = js.native
  /**
    * String inserted between the values if multiple attribute fields are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#fieldDelimiter)
    */
  var fieldDelimiter: java.lang.String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: UniqueValueRendererLegendOptions = js.native
  /**
    * The type of Renderer. For UniqueValueRenderer this value is always `unique-value`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_UniqueValueRenderer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`unique-value` = js.native
  /**
    * Each element in the array is an object that provides information about a unique value associated with the renderer. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.Array[UniqueValueRendererUniqueValueInfos] = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: java.lang.String = js.native
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: java.lang.String = js.native
  /**
    * Adds a unique value and symbol to the renderer. You can provide the value and its associated symbol as individual arguments or as an info object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#addUniqueValueInfo)
    *
    * @param valueOrInfo The value to match. The value can be provided as an individual argument or as an [info object described in uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos).
    * @param symbol The symbol used to represent features matching the specified `value`.
    *
    */
  def addUniqueValueInfo(valueOrInfo: java.lang.String): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: java.lang.String, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: java.lang.String, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: scala.Double, symbol: SymbolProperties): scala.Unit = js.native
  /**
    * Returns rendering and legend information (as defined by the renderer) associated with the given graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#getUniqueValueInfo)
    *
    * @param graphic The graphic whose rendering and legend information will be returned.
    *
    */
  def getUniqueValueInfo(graphic: Graphic): js.Any = js.native
  /**
    * Removes a unique value from the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#removeUniqueValueInfo)
    *
    * @param value Value to remove from [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos).
    *
    */
  def removeUniqueValueInfo(value: java.lang.String): scala.Unit = js.native
}

@JSGlobal("__esri.UniqueValueRenderer")
@js.native
/**
  * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes. This is typically done by using unique colors, fill styles, or images to represent features with equal values in a string field.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
  */
class UniqueValueRendererCls () extends UniqueValueRenderer {
  def this(properties: UniqueValueRendererProperties) = this()
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects. Each object must indicate the type of visual variable to apply (e.g. [ColorVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html), [SizeVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html), [OpacityVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html), [RotationVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html)), the numeric field or expression from which to drive the visualization, and the visual values to map to the data. The following list identifies each visual variable type and provides a link to the specification table of each.
    *
    * Type | Object Specification | Legend Example
    * -----|----------------------|---------------
    * color | [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-color-vv.png)
    * size | [SizeVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-size-vv.png)
    * opacity | [OpacityVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-OpacityVariable.html) | ![legend-color-vv](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/legend-opacity-vv.png)
    * rotation | [RotationVisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-RotationVariable.html) | -
    *
    * Visual variables are primarily be used in two ways.  **1**. Thematic mapping  In most cases, visual variables are used to create visualizations based on a thematic attribute (e.g. population, education, rank, money, magnitude, etc.) in either 2D or 3D.
    * ```js
    * renderer.visualVariables = [{
    *   type: "size",
    *   field: "POP_POVERTY",
    *   normalizationField: "TOTPOP_CY",
    *   legendOptions: {
    *     title: "% population in poverty by county"
    *   },
    *   stops: [
    *     { value: 0.15, size: 4, label: "<15%" },
    *     { value: 0.25, size: 12, label: "25%" },
    *     { value: 0.35, size: 24, label: ">35%" }
    *   ]
    * }];
    * ```
    *
    * [![size-image-here](https://developers.arcgis.com/javascript/assets/img/samples/8-vv-size.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-vv-size/index.html)
    *
    * You can take the visualization a step further and use multiple visual variables in the same renderer.
    * The sample below uses
    * three visual variables (size, color, and opacity).
    *
    * [![visualization-multivariate-2d](https://developers.arcgis.com/javascript/assets/img/apiref/renderers/renderer-unique-vv.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-multivariate-2d/index.html)
    *
    * **2**. Mapping real-world sizes
    *
    * The [size](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) visual variable can be used to
    * visualize the true sizes of features (e.g. tree canopy, road width, building height, etc.)
    * based on their size in the real world. This can be particularly powerful when working in a 3D
    * [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). The image below shows a layer of trees
    * that uses visual variables to size each feature to the true dimensions of each tree
    * based on data stored in multiple attribute fields.
    *
    * [![renderer-vv-rw](https://developers.arcgis.com/javascript/assets/img/samples/3-trees-3d.png)](https://developers.arcgis.com/javascript/latest/sample-code/visualization-trees-realistic/index.html)
    *
    * See the [Thematic visualization with realistic 3D symbols](https://developers.arcgis.com/javascript/latest/sample-code/visualization-trees-realistic/index.html)
    * for an example of using multiple visual variables to visualize your data.
    *
    * > **Known Limitations**  Color and opacity visual variables must not have more than 8 stops and size visual variables must not have more than 6 stops. This does not apply to variables driven by view scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesRenderer.html#visualVariables)
    */
  /* CompleteClass */
  override var visualVariables: js.Array[VisualVariable] = js.native
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

