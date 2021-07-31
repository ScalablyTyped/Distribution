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
  
  @scala.inline
  def apply(): SimpleFillSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriSFS")
    __obj.asInstanceOf[SimpleFillSymbol]
  }
  
  @scala.inline
  implicit class SimpleFillSymbolMutableBuilder[Self <: SimpleFillSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setStyle(value: SimpleFillSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: esriSFS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
