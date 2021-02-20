package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DictionaryRenderer
import typings.arcgisJsApi.esri.DictionaryRendererConstructor
import typings.arcgisJsApi.esri.DictionaryRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dictionaryRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/DictionaryRenderer", JSImport.Namespace)
  @js.native
  val ^ : DictionaryRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/DictionaryRenderer", JSImport.Namespace)
  @js.native
  /**
    * Dictionary Renderer is used to symbolize layers using a dictionary of [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) configured with multiple attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DictionaryRenderer.html)
    */
  class Class () extends DictionaryRenderer {
    def this(properties: DictionaryRendererProperties) = this()
  }
  
  type _To = DictionaryRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dictionaryRendererMod.foo` */
  override def _to: DictionaryRendererConstructor = ^
}
