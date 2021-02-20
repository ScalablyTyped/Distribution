package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMLineSymbol
  extends CIMMultiLayerSymbol
     with CIMSymbolType {
  
  @JSName("type")
  var type_CIMLineSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMLineSymbol = js.native
}
object CIMLineSymbol {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMLineSymbol): CIMLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMLineSymbol]
  }
  
  @scala.inline
  implicit class CIMLineSymbolMutableBuilder[Self <: CIMLineSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMLineSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
