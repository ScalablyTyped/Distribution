package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.diamond
import typings.arcgisJsApi.arcgisJsApiStrings.path
import typings.arcgisJsApi.arcgisJsApiStrings.square
import typings.arcgisJsApi.arcgisJsApiStrings.triangle
import typings.arcgisJsApi.arcgisJsApiStrings.x
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typings.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleMarkerSymbol
  extends Symbol2D
     with MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.MarkerSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsMarkerSymbol {
  
  /**
    * The outline of the marker symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  
  /**
    * The SVG path of the icon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#path)
    */
  var path: String = js.native
  
  /**
    * The size of the marker in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#size)
    */
  var size: Double = js.native
  
  /**
    * The marker style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style)
    */
  var style: circle | square | cross | x | diamond | triangle | path = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleMarkerSymbol: `simple-marker` = js.native
}
