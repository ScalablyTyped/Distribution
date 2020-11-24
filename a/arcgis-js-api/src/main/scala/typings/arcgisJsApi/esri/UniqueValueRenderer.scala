package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`unique-value`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValueRenderer
  extends Renderer
     with VisualVariablesMixin
     with RendererWithVisualVariables
     with typings.arcgisJsApi.esri.renderers.RendererWithVisualVariables {
  
  /**
    * Adds a unique value and symbol to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#addUniqueValueInfo)
    */
  def addUniqueValueInfo(valueOrInfo: String): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: String, symbol: Symbol): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: String, symbol: SymbolProperties): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: Symbol): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: js.Any, symbol: SymbolProperties): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double, symbol: Symbol): Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double, symbol: SymbolProperties): Unit = js.native
  
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: FillSymbol | PolygonSymbol3D = js.native
  
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: String = js.native
  
  /**
    * The default symbol used to draw a feature whose value is not matched or specified by the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: Symbol = js.native
  
  /**
    * The name of the attribute field the renderer uses to match unique values or types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * If needed, specifies the name of an additional attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: String = js.native
  
  /**
    * If needed, specify the name of a third attribute field the renderer will use to match values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: String = js.native
  
  /**
    * String inserted between the values if multiple attribute fields are specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#fieldDelimiter)
    */
  var fieldDelimiter: String = js.native
  
  /**
    * Returns rendering and legend information (as defined by the renderer) associated with the given graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#getUniqueValueInfo)
    */
  def getUniqueValueInfo(graphic: Graphic): js.Promise[UniqueValueInfo] = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: UniqueValueRendererLegendOptions = js.native
  
  /**
    * Removes a unique value from the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#removeUniqueValueInfo)
    */
  def removeUniqueValueInfo(value: String): Unit = js.native
  def removeUniqueValueInfo(value: Double): Unit = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_UniqueValueRenderer: `unique-value` = js.native
  
  /**
    * Each element in the array is an object that provides information about a unique value associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.Array[UniqueValueInfo] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to either a string or a number.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: String = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: String = js.native
}
