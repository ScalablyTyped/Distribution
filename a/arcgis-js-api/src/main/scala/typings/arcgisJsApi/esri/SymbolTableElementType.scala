package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisJsApi.esri.ImageSymbolTableElementInfo
  - typings.arcgisJsApi.esri.SymbolTableElementInfo
*/
trait SymbolTableElementType extends StObject
object SymbolTableElementType {
  
  inline def ImageSymbolTableElementInfo(opacity: Double, src: String): typings.arcgisJsApi.esri.ImageSymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.ImageSymbolTableElementInfo]
  }
  
  inline def SymbolTableElementInfo(label: String | RampTitle, symbol: Symbol): typings.arcgisJsApi.esri.SymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisJsApi.esri.SymbolTableElementInfo]
  }
}
