package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`web-style`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebStyleSymbol
  extends Symbol
     with typings.arcgisJsApi.esri.symbols.Symbol
     with symbolsSymbol {
  /**
    * The name of the symbol within the web style. Each symbol in a web style is identified by a unique name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: String = js.native
  /**
    * The portal that contains the web style this symbol refers to. Only required when [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) is set.  Defaults to the value in [config.portalUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-config.html#portalUrl) (e.g. https://www.arcgis.com).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: Portal = js.native
  /**
    * A registered web style name. Only [Esri Web Style Symbols (2D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-2d/index.html) and [Esri Web Style Symbols (3D)](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html) can be referenced here. Note that the 2D web style symbols are only supported in 2D and 3D web style symbols are only supported in 3D with an exception of [`EsriIconsStyle`](https://developers.arcgis.com/javascript/latest/guide/esri-web-style-symbols-3d/index.html#icons) which can be used in both 2D and 3D.  Requires [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal) property to be set. Can not be used in conjunction with [styleUrl](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: String = js.native
  /**
    * URL that points to the web style definition. Cannot be used in conjunction with [styleName](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName) and [portal](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal).  See class description for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: String = js.native
  @JSName("type")
  val type_WebStyleSymbol: `web-style` = js.native
  /**
    * Downloads and returns the [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) instance the WebStyleSymbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#fetchSymbol)
    *
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def fetchSymbol(): js.Promise[PointSymbol3D] = js.native
  def fetchSymbol(options: WebStyleSymbolFetchSymbolOptions): js.Promise[PointSymbol3D] = js.native
}

@JSGlobal("__esri.WebStyleSymbol")
@js.native
object WebStyleSymbol extends TopLevel[WebStyleSymbolConstructor]

