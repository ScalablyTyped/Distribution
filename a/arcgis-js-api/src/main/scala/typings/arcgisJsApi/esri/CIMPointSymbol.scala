package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.Display
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMPointSymbol extends StObject {
  
  /**
    * The amount of variation applied to the symbol, measured in degrees, propagated cumulatively to all marker symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var angle: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether point symbols align to the map or to the display when a rotation is applied to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var angleAlignment: js.UndefOr[Display | typings.arcgisJsApi.arcgisJsApiStrings.Map] = js.undefined
  
  /**
    * The geometric effects applied to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var effects: js.UndefOr[js.Array[CIMGeometricEffect]] = js.undefined
  
  /**
    * The primitive name of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The X scale which changes the width of the symbol without changing the height, as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var scaleX: js.UndefOr[Double] = js.undefined
  
  /**
    * The symbol layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var symbolLayers: js.Array[CIMSymbolLayer]
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol
  
  /**
    * A value indicating whether the symbol size properties are rendered using real world units or page units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMPointSymbol)
    */
  var useRealWorldSymbolSizes: js.UndefOr[Boolean] = js.undefined
}
object CIMPointSymbol {
  
  inline def apply(symbolLayers: js.Array[CIMSymbolLayer]): CIMPointSymbol = {
    val __obj = js.Dynamic.literal(symbolLayers = symbolLayers.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("CIMPointSymbol")
    __obj.asInstanceOf[CIMPointSymbol]
  }
  
  extension [Self <: CIMPointSymbol](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleAlignment(value: Display | typings.arcgisJsApi.arcgisJsApiStrings.Map): Self = StObject.set(x, "angleAlignment", value.asInstanceOf[js.Any])
    
    inline def setAngleAlignmentUndefined: Self = StObject.set(x, "angleAlignment", js.undefined)
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setEffects(value: js.Array[CIMGeometricEffect]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
    
    inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
    
    inline def setEffectsVarargs(value: CIMGeometricEffect*): Self = StObject.set(x, "effects", js.Array(value*))
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
    
    inline def setScaleXUndefined: Self = StObject.set(x, "scaleX", js.undefined)
    
    inline def setSymbolLayers(value: js.Array[CIMSymbolLayer]): Self = StObject.set(x, "symbolLayers", value.asInstanceOf[js.Any])
    
    inline def setSymbolLayersVarargs(value: CIMSymbolLayer*): Self = StObject.set(x, "symbolLayers", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPointSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseRealWorldSymbolSizes(value: Boolean): Self = StObject.set(x, "useRealWorldSymbolSizes", value.asInstanceOf[js.Any])
    
    inline def setUseRealWorldSymbolSizesUndefined: Self = StObject.set(x, "useRealWorldSymbolSizes", js.undefined)
  }
}
