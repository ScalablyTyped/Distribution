package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleMarkerSymbol
  extends StObject
     with MarkerSymbol {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  @JSName("style")
  var style_SimpleMarkerSymbol: js.UndefOr[SimpleMarkerSymbolStyle] = js.undefined
  
  @JSName("type")
  var type_SimpleMarkerSymbol: esriSMS
}
object SimpleMarkerSymbol {
  
  inline def apply(): SimpleMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriSMS")
    __obj.asInstanceOf[SimpleMarkerSymbol]
  }
  
  extension [Self <: SimpleMarkerSymbol](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStyle(value: SimpleMarkerSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: esriSMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
