package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSymbolReference extends StObject {
  
  /**
    * _Since 4.20_ The maximum scale the symbol reference should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * _Since 4.20_ The minimum scale the symbol reference should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The primitive overrides.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference)
    */
  var primitiveOverrides: js.UndefOr[js.Array[PrimitiveOverride]] = js.undefined
  
  /**
    * The symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference)
    */
  var symbol: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference
}
object CIMSymbolReference {
  
  inline def apply(symbol: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol): CIMSymbolReference = {
    val __obj = js.Dynamic.literal(symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMSymbolReference")
    __obj.asInstanceOf[CIMSymbolReference]
  }
  
  extension [Self <: CIMSymbolReference](x: Self) {
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setPrimitiveOverrides(value: js.Array[PrimitiveOverride]): Self = StObject.set(x, "primitiveOverrides", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveOverridesUndefined: Self = StObject.set(x, "primitiveOverrides", js.undefined)
    
    inline def setPrimitiveOverridesVarargs(value: PrimitiveOverride*): Self = StObject.set(x, "primitiveOverrides", js.Array(value*))
    
    inline def setSymbol(value: CIMPointSymbol | CIMLineSymbol | CIMPolygonSymbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMSymbolReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
