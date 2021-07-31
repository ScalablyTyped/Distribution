package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillSymbol
  extends StObject
     with Symbol {
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  @JSName("type")
  var type_FillSymbol: `simple-fill` | `picture-fill` = js.native
}
