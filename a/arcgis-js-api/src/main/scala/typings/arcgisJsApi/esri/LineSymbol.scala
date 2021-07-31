package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbol
  extends StObject
     with Symbol {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  @JSName("type")
  var type_LineSymbol: `simple-line` = js.native
  
  /**
    * The width of the symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    */
  var width: Double = js.native
}
