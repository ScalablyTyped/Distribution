package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSFS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleFillSymbol
  extends StObject
     with Symbol {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var outline: js.UndefOr[SimpleLineSymbol] = js.undefined
  
  @JSName("style")
  var style_SimpleFillSymbol: js.UndefOr[SimpleFillSymbolStyle] = js.undefined
  
  @JSName("type")
  var type_SimpleFillSymbol: esriSFS
}
object SimpleFillSymbol {
  
  inline def apply(): SimpleFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriSFS")
    __obj.asInstanceOf[SimpleFillSymbol]
  }
  
  extension [Self <: SimpleFillSymbol](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setStyle(value: SimpleFillSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setType(value: esriSFS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
