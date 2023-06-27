package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMSymbolProperties
  extends StObject
     with SymbolProperties {
  
  /**
  		 * The JSON payload of the [CIMSymbolReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#CIMSymbolReference).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
  		 */
  var data: js.UndefOr[CIMSymbolReference] = js.undefined
}
object CIMSymbolProperties {
  
  inline def apply(): CIMSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIMSymbolProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMSymbolProperties] (val x: Self) extends AnyVal {
    
    inline def setData(value: CIMSymbolReference): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
