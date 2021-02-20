package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriSMS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleMarkerSymbol extends MarkerSymbol {
  
  var color: js.UndefOr[Color] = js.native
  
  var outline: js.UndefOr[SimpleLineSymbol] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  @JSName("style")
  var style_SimpleMarkerSymbol: js.UndefOr[SimpleMarkerSymbolStyle] = js.native
  
  @JSName("type")
  var type_SimpleMarkerSymbol: esriSMS = js.native
}
object SimpleMarkerSymbol {
  
  @scala.inline
  def apply(`type`: esriSMS): SimpleMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleMarkerSymbol]
  }
  
  @scala.inline
  implicit class SimpleMarkerSymbolMutableBuilder[Self <: SimpleMarkerSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setOutline(value: SimpleLineSymbol): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: SimpleMarkerSymbolStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: esriSMS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
