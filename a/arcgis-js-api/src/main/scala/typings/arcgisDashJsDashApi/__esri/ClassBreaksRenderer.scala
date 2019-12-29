package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`class-breaks`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`percent-of-total`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.field
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassBreaksRenderer
  extends Renderer
     with VisualVariablesMixin
     with RendererWithVisualVariables
     with typings.arcgisDashJsDashApi.__esri.renderers.RendererWithVisualVariables {
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
  var normalizationType: field | log | `percent-of-total` = js.native
  /**
    * The type of renderer.
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
  def getClassBreakInfo(graphic: Graphic): js.Promise[ClassBreakInfo] = js.native
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
object ClassBreaksRenderer extends TopLevel[ClassBreaksRendererConstructor]

