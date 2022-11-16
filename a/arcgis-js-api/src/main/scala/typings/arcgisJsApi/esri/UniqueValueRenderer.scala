package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`unique-value`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniqueValueRenderer
  extends StObject
     with Renderer
     with VisualVariablesMixin
     with RendererWithVisualVariables
     with typings.arcgisJsApi.esri.renderers.RendererWithVisualVariables {
  
  /**
    * Adds a unique value and symbol to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#addUniqueValueInfo)
    */
  def addUniqueValueInfo(valueOrInfo: String): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: String, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: String, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Any): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Any, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Any, symbol: SymbolProperties): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double, symbol: Symbol): scala.Unit = js.native
  def addUniqueValueInfo(valueOrInfo: Double, symbol: SymbolProperties): scala.Unit = js.native
  
  /**
    * This property is only relevant When symbolizing polygon features with marker symbols (or [IconSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-IconSymbol3DLayer.html)) in the [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) of this renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: FillSymbol | PolygonSymbol3D = js.native
  
  /**
    * The label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultLabel)
    */
  var defaultLabel: String = js.native
  
  /**
    * The symbol used to draw all features with values not referenced by [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) or [uniqueValueGroups](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#defaultSymbol)
    */
  var defaultSymbol: Symbol = js.native
  
  /**
    * The name of the attribute field containing types or categorical values referenced in [uniqueValueInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos) or [uniqueValueGroups](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * Specifies the name of an additional attribute field used to categorize features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field2)
    */
  var field2: String = js.native
  
  /**
    * Specifies the name of a third attribute field used to categorize features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field3)
    */
  var field3: String = js.native
  
  /**
    * A string used as a separator between the values in the legend if multiple attribute fields are used to categorize values.
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
  def removeUniqueValueInfo(value: String): scala.Unit = js.native
  def removeUniqueValueInfo(value: Double): scala.Unit = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_UniqueValueRenderer: `unique-value` = js.native
  
  /**
    * An array of objects defining groups of unique values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueGroups)
    */
  var uniqueValueGroups: js.Array[UniqueValueGroup] = js.native
  
  /**
    * Defines categories and their corresponding symbols based on a set of values expected from the provided [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#field) or [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#uniqueValueInfos)
    */
  var uniqueValueInfos: js.Array[UniqueValueInfo] = js.native
  
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression following the specification defined by the [Arcade Visualization Profile](https://developers.arcgis.com/javascript/latest/arcade/#visualization).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression)
    */
  var valueExpression: String = js.native
  
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/arcade/) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpression) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: String = js.native
}
