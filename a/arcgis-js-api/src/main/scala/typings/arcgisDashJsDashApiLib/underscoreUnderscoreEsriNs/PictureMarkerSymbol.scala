package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D3D because Already inherited- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Symbol2D3D because Already inherited */ @js.native
trait PictureMarkerSymbol
  extends MarkerSymbol
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.MarkerSymbol
     with Symbol2D
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.symbolsNs.Symbol2D
     with symbolsMarkerSymbol {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
    */
  var height: scala.Double = js.native
  /**
    * For PictureMarkerSymbol the type is always `picture-marker`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_PictureMarkerSymbol: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`picture-marker` = js.native
  /**
    * The URL to the image. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://enable-cors.org/server.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a proxy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: scala.Double = js.native
}

