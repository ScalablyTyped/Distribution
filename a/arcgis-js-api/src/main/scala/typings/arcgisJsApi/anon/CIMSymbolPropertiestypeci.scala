package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.cim
import typings.arcgisJsApi.esri.CIMSymbolReference
import typings.arcgisJsApi.esri.Color_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.CIMSymbolProperties & {  type :'cim'} */
trait CIMSymbolPropertiestypeci extends StObject {
  
  /**
  		 * The color of the symbol.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * The JSON payload of the [CIMSymbolReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
  		 */
  var data: js.UndefOr[CIMSymbolReference] = js.undefined
  
  var `type`: cim
}
object CIMSymbolPropertiestypeci {
  
  inline def apply(): CIMSymbolPropertiestypeci = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("cim")
    __obj.asInstanceOf[CIMSymbolPropertiestypeci]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMSymbolPropertiestypeci] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setData(value: CIMSymbolReference): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setType(value: cim): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
