package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-fill`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.symbols.Symbol2D3D because Already inherited
- typings.arcgisDashJsDashApi.__esri.Symbol2D3D because Already inherited */ @js.native
trait PictureFillSymbol
  extends FillSymbol
     with typings.arcgisDashJsDashApi.__esri.symbols.FillSymbol
     with typings.arcgisDashJsDashApi.__esri.symbols.Symbol2D
     with Symbol2D
     with symbolsFillSymbol {
  /**
    * The height of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
    *
    * @default 12
    */
  var height: Double = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#type)
    */
  @JSName("type")
  val type_PictureFillSymbol: `picture-fill` = js.native
  /**
    * The URL to the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#url)
    */
  var url: String = js.native
  /**
    * The width of the image in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    *
    * @default 12
    */
  var width: Double = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: Double = js.native
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    *
    * @default 1
    */
  var xscale: Double = js.native
  /**
    * The offset on the y-axis in pixels or points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: Double = js.native
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    *
    * @default 1
    */
  var yscale: Double = js.native
}

@JSGlobal("__esri.PictureFillSymbol")
@js.native
object PictureFillSymbol extends TopLevel[PictureFillSymbolConstructor]

