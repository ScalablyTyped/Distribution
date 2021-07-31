package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolTableElement
  extends StObject
     with Object
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[SymbolTableElementType],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): SymbolTableElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolTableElement]
  }
  
  @scala.inline
  implicit class SymbolTableElementMutableBuilder[Self <: SymbolTableElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfos(value: js.Array[SymbolTableElementType]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfosVarargs(value: SymbolTableElementType*): Self = StObject.set(x, "infos", js.Array(value :_*))
    
    @scala.inline
    def setLegendType(value: String): Self = StObject.set(x, "legendType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendTypeUndefined: Self = StObject.set(x, "legendType", js.undefined)
    
    @scala.inline
    def setTitle(value: String | RendererTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
