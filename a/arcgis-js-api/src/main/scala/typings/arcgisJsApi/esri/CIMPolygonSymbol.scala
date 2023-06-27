package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPolygonSymbol extends StObject {
  
  /**
  		 * The geometric effects applied to the symbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPolygonSymbol)
  		 */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
  		 * The symbol layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPolygonSymbol)
  		 */
  var symbolLayers: js.Array[CIMSymbolLayer]
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol
  
  /**
  		 * A value indicating whether the symbol size properties are rendered using real world units or page units.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPolygonSymbol)
  		 */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}
object CIMPolygonSymbol {
  
  inline def apply(symbolLayers: js.Array[CIMSymbolLayer]): CIMPolygonSymbol = {
    val __obj = js.Dynamic.literal(symbolLayers = symbolLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPolygonSymbol")
    __obj.asInstanceOf[CIMPolygonSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMPolygonSymbol] (val x: Self) extends AnyVal {
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setSymbolLayers(value: js.Array[CIMSymbolLayer]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersVarargs(value: CIMSymbolLayer*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseRealWorldSymbolSizes(value: Boolean): Self = StObject.set(x, "useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    inline def setUseRealWorldSymbolSizesUndefined: Self = StObject.set(x, "useRealWorldSymbolSizes", js.undefined)
  }
}
