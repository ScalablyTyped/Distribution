package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typings.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait PictureFillSymbol
  extends Symbol2D
     with FillSymbol
     with typings.arcgisJsApi.esri.symbols.FillSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsFillSymbol {
  
  /**
    * The height of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#height)
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
    * The width of the image in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#width)
    */
  var width: Double = js.native
  
  /**
    * The offset on the x-axis in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xoffset)
    */
  var xoffset: Double = js.native
  
  /**
    * The scale factor on the x axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#xscale)
    */
  var xscale: Double = js.native
  
  /**
    * The offset on the y-axis in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yoffset)
    */
  var yoffset: Double = js.native
  
  /**
    * The scale factor on the y axis of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html#yscale)
    */
  var yscale: Double = js.native
}
