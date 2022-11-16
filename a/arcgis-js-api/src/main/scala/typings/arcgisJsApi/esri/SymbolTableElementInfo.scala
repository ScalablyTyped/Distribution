package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolTableElementInfo
  extends StObject
     with SymbolTableElementType {
  
  /**
    * The title of the renderer as displayed in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var label: String | RampTitle
  
  /**
    * A preview of the symbol element as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var preview: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The size of the symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * The symbol for the corresponding `value` in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var symbol: Symbol
  
  /**
    * The value corresponding with the given `symbol` in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElementInfo)
    */
  var value: js.UndefOr[Any] = js.undefined
}
object SymbolTableElementInfo {
  
  inline def apply(label: String | RampTitle, symbol: Symbol): SymbolTableElementInfo = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElementInfo]
  }
  
  extension [Self <: SymbolTableElementInfo](x: Self) {
    
    inline def setLabel(value: String | RampTitle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setPreview(value: HTMLElement): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
