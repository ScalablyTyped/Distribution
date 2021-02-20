package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMPolygonSymbol
  extends CIMMultiLayerSymbol
     with CIMSymbolType {
  
  @JSName("type")
  var type_CIMPolygonSymbol: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol = js.native
}
object CIMPolygonSymbol {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol): CIMPolygonSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMPolygonSymbol]
  }
  
  @scala.inline
  implicit class CIMPolygonSymbolMutableBuilder[Self <: CIMPolygonSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
