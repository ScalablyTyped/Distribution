package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait symbolPreview extends StObject {
  
  /**
    * Generates a preview image of a given symbol that can be displayed in a custom widget or other DOM element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolPreview.html#renderPreviewHTML)
    */
  def renderPreviewHTML(symbol: Symbol): js.Promise[HTMLElement] = js.native
  def renderPreviewHTML(symbol: Symbol, options: symbolPreviewRenderPreviewHTMLOptions): js.Promise[HTMLElement] = js.native
}
