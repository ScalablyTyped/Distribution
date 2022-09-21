package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PictureMarkerSymbol
  extends StObject
     with MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D
     with symbolsMarkerSymbol {
  
  /**
    * The height of the image in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    */
  var height: Double = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_PictureMarkerSymbol: `picture-marker` = js.native
  
  /**
    * The URL to an image or SVG document.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: String = js.native
  
  /**
    * The width of the image in points.
    *
    * @default 12
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    */
  var width: Double = js.native
}
