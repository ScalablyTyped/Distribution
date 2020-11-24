package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonSymbol3D
  extends Symbol3D
     with typings.arcgisJsApi.esri.symbols.Symbol2D3D
     with Symbol2D3D
     with typings.arcgisJsApi.esri.symbols.Symbol3D
     with symbolsSymbol3D {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html#type)
    */
  @JSName("type")
  val type_PolygonSymbol3D: `polygon-3d` = js.native
}
