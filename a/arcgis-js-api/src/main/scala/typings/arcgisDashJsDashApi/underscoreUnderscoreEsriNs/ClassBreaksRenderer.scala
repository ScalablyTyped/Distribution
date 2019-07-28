package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IPromise
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`class-breaks`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreaksRenderer
  extends Renderer
     with VisualVariablesRenderer
     with RasterRenderer
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.renderersNs.RasterRenderer
     with RendererWithVisualVariables
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.renderersNs.RendererWithVisualVariables {
  /**
    * When symbolizing polygon features with graduated symbols, set a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) on this property to visualize the boundaries of each feature. Use a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) of varying sizes in the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) to indicate the quantity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: FillSymbol | PolygonSymbol3D = js.native
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var classBreakInfos: js.Array[ClassBreakInfo] = js.native
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultLabel)
    */
  var defaultLabel: String = js.native
  /**
    * The default symbol assigned to features with a value not matched to a given break. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol)
    */
  var defaultSymbol: Symbol = js.native
  /**
    * The name of a numeric attribute field whose data determines the symbol of each feature based on the class breaks defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field)
    */
  var field: String = js.native
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: ClassBreaksRendererLegendOptions = js.native
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `field`, this property contains the attribute field name used for normalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField)
    */
  var normalizationField: String = js.native
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal)
    */
  var normalizationTotal: Double = js.native
  /**
    * Indicates how the data is normalized. If this property is defined, then the class breaks contain a normalized min/max value instead of the value in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field). The data value obtained from the field is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the data value using the attribute value of the field specified in the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) property. This value is set by default if the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) to define the total value by which to normalize. This value is set by default if the [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) is provided.
    *
    * With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations.  For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType)
    */
  var normalizationType: String = js.native
  /**
    * The type of renderer. For ClassBreaksRenderer this value is always `class-breaks`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#type)
    */
  @JSName("type")
  val type_ClassBreaksRenderer: `class-breaks` = js.native
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression)
    */
  var valueExpression: String = js.native
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: String = js.native
  def addClassBreakInfo(min: js.Any): Unit = js.native
  def addClassBreakInfo(min: js.Any, max: Double): Unit = js.native
  def addClassBreakInfo(min: js.Any, max: Double, symbol: Symbol): Unit = js.native
  /**
    * Adds a class break to the renderer. You can provide the minimum, maximum and symbol values as individual arguments or by using the info object. The range of the break is greater than or equal to the minimum value and less than the maximum value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#addClassBreakInfo)
    *
    * @param min The minimum value to use in the break. This can be a number or an info object as defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
    * @param max The maximum value to use in the break.
    * @param symbol Symbol to use for the break.
    *
    */
  def addClassBreakInfo(min: Double): Unit = js.native
  def addClassBreakInfo(min: Double, max: Double): Unit = js.native
  def addClassBreakInfo(min: Double, max: Double, symbol: Symbol): Unit = js.native
  /**
    * Returns the [classBreakInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) information (as defined by the renderer) associated with the given graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#getClassBreakInfo)
    *
    * @param graphic The graphic whose rendering information will be returned.
    *
    */
  def getClassBreakInfo(graphic: Graphic): IPromise[ClassBreakInfo] = js.native
  /**
    * Removes a break from the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#removeClassBreakInfo)
    *
    * @param min Minimum value in the break to remove
    * @param max Maximum value in the break to remove.
    *
    */
  def removeClassBreakInfo(min: Double, max: Double): Unit = js.native
}

@JSGlobal("__esri.ClassBreaksRenderer")
@js.native
/**
  * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute. Symbols are assigned based on classes or ranges of data. Each feature is assigned a symbol based on the class break in which the value of the attribute falls.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
  */
class ClassBreaksRendererCls () extends ClassBreaksRenderer {
  def this(properties: ClassBreaksRendererProperties) = this()
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

