package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSLS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleLineSymbol
  extends StObject
     with Symbol {
  
  var color: js.UndefOr[Color] = js.undefined
  
  @JSName("style")
  var style_SimpleLineSymbol: js.UndefOr[SimpleLineSymbolStyle] = js.undefined
  
  @JSName("type")
  var type_SimpleLineSymbol: esriSLS
  
  var width: js.UndefOr[Double] = js.undefined
}
object SimpleLineSymbol {
  
  @scala.inline
  def apply(): SimpleLineSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriSLS")
    __obj.asInstanceOf[SimpleLineSymbol]
  }
  
  @scala.inline
  implicit class SimpleLineSymbolMutableBuilder[Self <: SimpleLineSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setStyle(value: SimpleLineSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: esriSLS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
