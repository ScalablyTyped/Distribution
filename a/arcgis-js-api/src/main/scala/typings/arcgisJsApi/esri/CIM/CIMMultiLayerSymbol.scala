package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMultiLayerSymbol extends CIMSymbolBase {
  
  /**
    * The geometric effects that are applied to the symbol.
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffectType]] = js.native
  
  /**
    * The symbol layers. Symbol layers are the components that make up a symbol. A symbol layer is represented by a stroke, fill, marker, or procedural symbol layer.
    */
  var symbolLayers: js.UndefOr[js.Array[CIMSymbolLayerType]] = js.native
  
  /**
    * The representative image of the symbol.
    */
  var thumbnailURI: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the symbol size properties are rendered using real world units or page units. When set to true the symbol will draw using real world units (e.g. meters).
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.native
}
object CIMMultiLayerSymbol {
  
  @scala.inline
  def apply(`type`: String): CIMMultiLayerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMultiLayerSymbol]
  }
  
  @scala.inline
  implicit class CIMMultiLayerSymbolMutableBuilder[Self <: CIMMultiLayerSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEffects(value: js.Array[CIMGeometricEffectType]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    @scala.inline
    def setEffectsVarargs(value: CIMGeometricEffectType*): Self = StObject.set(x, "effects", js.Array(value :_*))
    
    @scala.inline
    def setSymbolLayers(value: js.Array[CIMSymbolLayerType]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolLayersUndefined: Self = StObject.set(x, "symbolLayers", js.undefined)
    
    @scala.inline
    def setSymbolLayersVarargs(value: CIMSymbolLayerType*): Self = StObject.set(x, "symbolLayers", js.Array(value :_*))
    
    @scala.inline
    def setThumbnailURI(value: String): Self = StObject.set(x, "thumbnailURI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbnailURIUndefined: Self = StObject.set(x, "thumbnailURI", js.undefined)
    
    @scala.inline
    def setUseRealWorldSymbolSizes(value: Boolean): Self = StObject.set(x, "useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseRealWorldSymbolSizesUndefined: Self = StObject.set(x, "useRealWorldSymbolSizes", js.undefined)
  }
}
