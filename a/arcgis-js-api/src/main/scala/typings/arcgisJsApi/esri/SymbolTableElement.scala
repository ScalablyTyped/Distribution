package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolTableElement
  extends StObject
     with LegendElement {
  
  /**
  		 * An array of each symbol/category/break rendered for the symbol table.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
  		 */
  var infos: js.Array[SymbolTableElementType]
  
  /**
  		 * Only used for renderers set to ImageryLayers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
  		 */
  var legendType: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title of the renderer as displayed in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
  		 */
  var title: js.UndefOr[String | RendererTitle] = js.undefined
  
  /**
  		 * The type of this element is always `symbol-table`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SymbolTableElement)
  		 */
  var `type`: String
}
object SymbolTableElement {
  
  inline def apply(infos: js.Array[SymbolTableElementType], `type`: String): SymbolTableElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolTableElement] (val x: Self) extends AnyVal {
    
    inline def setInfos(value: js.Array[SymbolTableElementType]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosVarargs(value: SymbolTableElementType*): Self = StObject.set(x, "infos", js.Array(value*))
    
    inline def setLegendType(value: String): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    inline def setLegendTypeUndefined: Self = StObject.set(x, "legendType", js.undefined)
    
    inline def setTitle(value: String | RendererTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
