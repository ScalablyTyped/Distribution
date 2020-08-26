package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.DictionaryRendererProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.DictionaryRenderer")
@js.native
/**
  * Dictionary Renderer is used to symbolize layers using a dictionary of [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) configured with multiple attributes. This renderer should be used when individual features need to be visualized based on multiple data attributes. This may lead to many symbol permutations that would be inappropriate for using a UniqueValueRenderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html)
  */
class DictionaryRendererCls ()
  extends typings.arcgisJsApi.esri.DictionaryRenderer {
  def this(properties: DictionaryRendererProperties) = this()
}

