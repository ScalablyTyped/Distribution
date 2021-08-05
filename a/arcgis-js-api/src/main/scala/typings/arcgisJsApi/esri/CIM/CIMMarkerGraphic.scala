package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMMarkerGraphic extends StObject {
  
  /**
    * The geometry of the marker.
    */
  var geometry: js.UndefOr[ExternalReferenceGeometry] = js.undefined
  
  /**
    * The primitive name.
    */
  var primitiveName: js.UndefOr[String] = js.undefined
  
  /**
    * The symbol used to draw the marker graphic, can be a point, line, polygon, or text symbol.
    */
  var symbol: js.UndefOr[CIMSymbolType] = js.undefined
  
  /**
    * The text that is defined within the marker if drawn with a text symbol.
    */
  var textString: js.UndefOr[String] = js.undefined
  
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic
}
object CIMMarkerGraphic {
  
  inline def apply(): CIMMarkerGraphic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("CIMMarkerGraphic")
    __obj.asInstanceOf[CIMMarkerGraphic]
  }
  
  extension [Self <: CIMMarkerGraphic](x: Self) {
    
    inline def setGeometry(value: ExternalReferenceGeometry): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setPrimitiveName(value: String): Self = StObject.set(x, "primitiveName", value.asInstanceOf[js.Any])
    
    inline def setPrimitiveNameUndefined: Self = StObject.set(x, "primitiveName", js.undefined)
    
    inline def setSymbol(value: CIMSymbolType): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTextString(value: String): Self = StObject.set(x, "textString", value.asInstanceOf[js.Any])
    
    inline def setTextStringUndefined: Self = StObject.set(x, "textString", js.undefined)
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.CIMMarkerGraphic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
