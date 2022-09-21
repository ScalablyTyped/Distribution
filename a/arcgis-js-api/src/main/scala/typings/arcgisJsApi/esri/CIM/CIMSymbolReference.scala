package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSymbolReference extends StObject {
  
  /**
    * The maximum distance at which symbols are visible. Objects beyond this point don't get rendered.
    */
  var maxDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum scale range the symbol reference should be displayed at.
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum distance at which symbols are visible. Objects closer than this don't get rendered.
    */
  var minDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum scale range the symbol reference should be displayed at.
    */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive overrides. Typically set by renderers at draw time.
    */
  var primitiveOverrides: js.UndefOr[js.Array[CIMPrimitiveOverride]] = js.undefined
  
  /**
    * An array of scale dependent sizes.
    */
  var scaleDependentSizeVariation: js.UndefOr[js.Array[CIMScaleDependentSizeVariation]] = js.undefined
  
  /**
    * The style path. Reserved for future use.
    */
  var stylePath: js.UndefOr[String] = js.undefined
  
  /**
    * The symbol.
    */
  var symbol: js.UndefOr[CIMSymbolType] = js.undefined
  
  /**
    * The symbol name.
    */
  var symbolName: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference
}
object CIMSymbolReference {
  
  inline def apply(): CIMSymbolReference = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMSymbolReference")
    __obj.asInstanceOf[CIMSymbolReference]
  }
  
  extension [Self <: CIMSymbolReference](x: Self) {
    
    inline def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
    
    inline def setMaxDistanceUndefined: Self = StObject.set(x, "maxDistance", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setPrimitiveOverrides(value: js.Array[CIMPrimitiveOverride]): Self = StObject.set(x, "primitiveOverrides", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveOverridesUndefined: Self = StObject.set(x, "primitiveOverrides", js.undefined)
    
    inline def setPrimitiveOverridesVarargs(value: CIMPrimitiveOverride*): Self = StObject.set(x, "primitiveOverrides", js.Array(value*))
    
    inline def setScaleDependentSizeVariation(value: js.Array[CIMScaleDependentSizeVariation]): Self = StObject.set(x, "scaleDependentSizeVariation", value.asInstanceOf[js.Any])
    
    inline def setScaleDependentSizeVariationUndefined: Self = StObject.set(x, "scaleDependentSizeVariation", js.undefined)
    
    inline def setScaleDependentSizeVariationVarargs(value: CIMScaleDependentSizeVariation*): Self = StObject.set(x, "scaleDependentSizeVariation", js.Array(value*))
    
    inline def setStylePath(value: String): Self = StObject.set(x, "stylePath", value.asInstanceOf[js.Any])
    
    inline def setStylePathUndefined: Self = StObject.set(x, "stylePath", js.undefined)
    
    inline def setSymbol(value: CIMSymbolType): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolName(value: String): Self = StObject.set(x, "symbolName", value.asInstanceOf[js.Any])
    
    inline def setSymbolNameUndefined: Self = StObject.set(x, "symbolName", js.undefined)
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
