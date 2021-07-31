package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait symbolUtils extends StObject {
  
  /**
    * Returns a symbol representing the input [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#getDisplayedSymbol)
    */
  def getDisplayedSymbol(graphic: Graphic): js.Promise[Symbol] = js.native
  def getDisplayedSymbol(graphic: Graphic, options: symbolUtilsGetDisplayedSymbolOptions): js.Promise[Symbol] = js.native
  
  /**
    * Generates a preview image of a color ramp to display in a custom widget or other DOM element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderColorRampPreviewHTML)
    */
  def renderColorRampPreviewHTML(colors: js.Array[Color_]): HTMLElement = js.native
  def renderColorRampPreviewHTML(colors: js.Array[Color_], options: symbolUtilsRenderColorRampPreviewHTMLOptions): HTMLElement = js.native
  
  /**
    * Generates a preview image of a given symbol that can be displayed in a custom widget or other DOM element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  def renderPreviewHTML(symbol: Symbol): js.Promise[HTMLElement] = js.native
  def renderPreviewHTML(symbol: Symbol, options: symbolUtilsRenderPreviewHTMLOptions): js.Promise[HTMLElement] = js.native
}
