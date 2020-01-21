package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typings.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait PictureMarkerSymbol
  extends MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with Symbol2D
     with symbolsMarkerSymbol {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed height of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a height of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#height)
    *
    * @default 12
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
    * The URL to an image or SVG document. To avoid CORS issues with this symbol, do one of the following:
    *   * Make certain that the [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) is hosted on a [CORS enabled server](https://developers.arcgis.com/javascript/latest/guide/cors/index.html).
    *   * Use an [image](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url) hosted on the same domain as the application.
    *   * Install a [proxy](https://developers.arcgis.com/javascript/latest/guide/proxies/index.html).
    *
    *
    * > **Known Limitations**
    *   * Using this property to render SVG documents as images is not supported in IE11.
    *   * SVG documents must include a definition for width and height to load properly in Firefox.
    *   * Animated gif/png images are not supported. See the [Custom WebGL layer view](https://developers.arcgis.com/javascript/latest/sample-code/custom-gl-visuals/index.html) sample to learn how to accomplish this using WebGL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#url)
    */
  var url: String = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).  The maximum allowed width of a picture marker symbol is 200px. If you set any value higher than 200px, then the image will be scaled down to a width of 200px while preserving the aspect ratio of the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureMarkerSymbol.html#width)
    *
    * @default 12
    */
  var width: Double = js.native
}

@JSGlobal("__esri.PictureMarkerSymbol")
@js.native
object PictureMarkerSymbol extends TopLevel[PictureMarkerSymbolConstructor]

