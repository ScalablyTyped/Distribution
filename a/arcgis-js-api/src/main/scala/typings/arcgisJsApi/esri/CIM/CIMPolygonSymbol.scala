package typings.arcgisJsApi.esri.CIM

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
  implicit class CIMPolygonSymbolOps[Self <: CIMPolygonSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMPolygonSymbol): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
