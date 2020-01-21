package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictionaryRendererConstructor
  extends /**
  * Dictionary Renderer is used to symbolize layers using a dictionary of [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) configured with multiple attributes. This renderer should be used when individual features need to be visualized based on multiple data attributes. This may lead to many symbol permutations that would be inappropriate for using a UniqueValueRenderer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html)
  */
Instantiable0[DictionaryRenderer]
     with Instantiable1[/* properties */ DictionaryRendererProperties, DictionaryRenderer] {
  def fromJSON(json: js.Any): DictionaryRenderer = js.native
}

