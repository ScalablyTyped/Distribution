package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typings.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleFillSymbol
  extends Symbol2D
     with FillSymbol
     with typings.arcgisJsApi.esri.symbols.FillSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D
     with symbolsFillSymbol {
  
  /**
    * The fill style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#style)
    */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none | solid | vertical = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleFillSymbol: `simple-fill` = js.native
}
