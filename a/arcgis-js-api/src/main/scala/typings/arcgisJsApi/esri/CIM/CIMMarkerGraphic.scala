package typings.arcgisJsApi.esri.CIM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerGraphic extends js.Object {
  
  /**
    * The geometry of the marker.
    */
  var geometry: js.UndefOr[ExternalReferenceGeometry] = js.native
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.native
  
  /**
    * The symbol used to draw the marker graphic, can be a point, line, polygon, or text symbol.
    */
  var symbol: js.UndefOr[CIMSymbolType] = js.native
  
  /**
    * The text that is defined within the marker if drawn with a text symbol.
    */
  var textString: js.UndefOr[String] = js.native
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic = js.native
}
object CIMMarkerGraphic {
  
  @scala.inline
  def apply(`type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic): CIMMarkerGraphic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMMarkerGraphic]
  }
  
  @scala.inline
  implicit class CIMMarkerGraphicOps[Self <: CIMMarkerGraphic] (val x: Self) extends AnyVal {
    
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
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: ExternalReferenceGeometry): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometry: Self = this.set("geometry", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = this.set("primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimitiveName: Self = this.set("primitiveName", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMSymbolType): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    
    @scala.inline
    def setTextString(value: String): Self = this.set("textString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextString: Self = this.set("textString", js.undefined)
  }
}
