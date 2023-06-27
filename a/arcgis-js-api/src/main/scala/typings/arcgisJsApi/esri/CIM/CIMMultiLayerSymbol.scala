package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMultiLayerSymbol
  extends StObject
     with CIMSymbolBase {
  
  /**
  			 * The geometric effects that are applied to the symbol.
  			 */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.undefined
  
  /**
  			 * The symbol layers. Symbol layers are the components that make up a symbol. A symbol layer is represented by a stroke, fill, marker, or procedural symbol layer.
  			 */
  var symbolLayers: js.UndefOr[js.Array[CIMSymbolLayerType]] = js.undefined
  
  /**
  			 * The representative image of the symbol.
  			 */
  var thumbnailURI: js.UndefOr[String] = js.undefined
  
  /**
  			 * A value indicating whether the symbol size properties are rendered using real world units or page units. When set to true the symbol will draw using real world units (e.g. meters).
  			 */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}
object CIMMultiLayerSymbol {
  
  inline def apply(`type`: String): CIMMultiLayerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMultiLayerSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMMultiLayerSymbol] (val x: Self) extends AnyVal {
    
    inline def setEffects(value: js.Array[CIMGeometricEffectType]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffectType*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setSymbolLayers(value: js.Array[CIMSymbolLayerType]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    inline def setSymbolLayersVarargs(value: CIMSymbolLayerType*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setThumbnailURI(value: String): Self = StObject.set(x, "thumbnailURI", value.asInstanceOf[js.Any])
    
    inline def setThumbnailURIUndefined: Self = StObject.set(x, "thumbnailURI", js.undefined)
    
    inline def setUseRealWorldSymbolSizes(value: Boolean): Self = StObject.set(x, "useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    inline def setUseRealWorldSymbolSizesUndefined: Self = StObject.set(x, "useRealWorldSymbolSizes", js.undefined)
  }
}
