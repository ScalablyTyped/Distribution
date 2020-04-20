package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.HashMap
import typings.arcgisJsApi.arcgisJsApiStrings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryRenderer
  extends Renderer
     with VisualVariablesMixin {
  /**
    * This property allows you to set display options that can be configured on the dictionary symbol style. For example, if the dictionary symbol style provides a display option to turn on/off a symbol/text, you could set it here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#config)
    */
  var config: js.Any = js.native
  /**
    * Defines a field mapping that maps input fields from the feature to the dictionary symbol style's expected fields for symbols and text. Each key identifies an expected field (defined in the dictionary's symbol and text properties). The value identifies the corresponding mapped field from the dataset. Field names are case sensitive.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#fieldMap)
    */
  var fieldMap: HashMap[String] = js.native
  /**
    * A scaling expression can be set to increase or decrease the size of the dictionary symbols. The scaling expression can be a constant value for all symbols or an Arcade expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#scaleExpression)
    */
  var scaleExpression: String = js.native
  /**
    * The type of renderer. For this renderer the type is always `dictionary`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#type)
    */
  @JSName("type")
  var type_DictionaryRenderer: dictionary = js.native
  /**
    * The URL to the dictionary style, e.g. https://jsapi.maps.arcgis.com/sharing/rest/content/items/30cfbf36efd64ccf92136201d9e852af.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#url)
    */
  var url: String = js.native
  /**
    * This method will return the symbol for a given graphic using the dictionary renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html#getSymbolAsync)
    *
    * @param graphic The graphic used to get the resulting symbol.
    *
    */
  def getSymbolAsync(graphic: Graphic): js.Promise[CIMSymbol] = js.native
}

@JSGlobal("__esri.DictionaryRenderer")
@js.native
object DictionaryRenderer extends TopLevel[DictionaryRendererConstructor]

