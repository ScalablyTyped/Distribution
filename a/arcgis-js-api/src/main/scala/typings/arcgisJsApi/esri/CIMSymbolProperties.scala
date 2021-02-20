package typings.arcgisJsApi.esri

import typings.arcgisJsApi.esri.CIM.CIMSymbolReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMSymbolProperties extends SymbolProperties {
  
  /**
    * The JSON payload of the [CIMSymbolReference](https://github.com/Esri/cim-spec/blob/master/docs/v2/CIMRenderers.md#CIMSymbolReference).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html#data)
    */
  var data: js.UndefOr[CIMSymbolReference] = js.native
}
object CIMSymbolProperties {
  
  @scala.inline
  def apply(): CIMSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CIMSymbolProperties]
  }
  
  @scala.inline
  implicit class CIMSymbolPropertiesMutableBuilder[Self <: CIMSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: CIMSymbolReference): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
