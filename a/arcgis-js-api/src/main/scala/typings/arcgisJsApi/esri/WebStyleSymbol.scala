package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`web-style`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebStyleSymbol
  extends Symbol
     with typings.arcgisJsApi.esri.symbols.Symbol
     with symbolsSymbol {
  
  /**
    * Returns the [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) instance the WebStyleSymbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#fetchCIMSymbol)
    */
  def fetchCIMSymbol(): js.Promise[CIMSymbol] = js.native
  def fetchCIMSymbol(options: WebStyleSymbolFetchCIMSymbolOptions): js.Promise[CIMSymbol] = js.native
  
  /**
    * Downloads and returns the [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) instance the WebStyleSymbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#fetchSymbol)
    */
  def fetchSymbol(): js.Promise[PointSymbol3D] = js.native
  def fetchSymbol(options: WebStyleSymbolFetchSymbolOptions): js.Promise[PointSymbol3D] = js.native
  
  /**
    * The name of the symbol within the web style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
    */
  var name: String = js.native
  
  /**
    * The portal that contains the web style this symbol refers to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
    */
  var portal: Portal = js.native
  
  /**
    * A registered web style name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
    */
  var styleName: String = js.native
  
  /**
    * URL that points to the web style definition.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
    */
  var styleUrl: String = js.native
  
  @JSName("type")
  val type_WebStyleSymbol: `web-style` = js.native
}
