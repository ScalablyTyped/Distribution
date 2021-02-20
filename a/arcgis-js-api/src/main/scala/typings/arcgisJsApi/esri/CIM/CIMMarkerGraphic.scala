package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CIMMarkerGraphic extends StObject {
  
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
  implicit class CIMMarkerGraphicMutableBuilder[Self <: CIMMarkerGraphic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometry(value: ExternalReferenceGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    @scala.inline
    def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    @scala.inline
    def setSymbol(value: CIMSymbolType): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setTextString(value: String): Self = StObject.set(x, "textString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStringUndefined: Self = StObject.set(x, "textString", js.undefined)
    
    @scala.inline
    def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
