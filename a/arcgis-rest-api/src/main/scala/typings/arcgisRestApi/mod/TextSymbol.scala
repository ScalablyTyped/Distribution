package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.baseline
import typings.arcgisRestApi.arcgisRestApiStrings.bottom
import typings.arcgisRestApi.arcgisRestApiStrings.center
import typings.arcgisRestApi.arcgisRestApiStrings.esriTS
import typings.arcgisRestApi.arcgisRestApiStrings.justify
import typings.arcgisRestApi.arcgisRestApiStrings.left
import typings.arcgisRestApi.arcgisRestApiStrings.middle
import typings.arcgisRestApi.arcgisRestApiStrings.right
import typings.arcgisRestApi.arcgisRestApiStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbol
  extends StObject
     with MarkerSymbol {
  
  var backgroundColor: js.UndefOr[Color] = js.undefined
  
  // <size>;
  var borderLineColor: js.UndefOr[Color] = js.undefined
  
  var borderLineSize: js.UndefOr[Double] = js.undefined
  
  var color: js.UndefOr[Color] = js.undefined
  
  var font: js.UndefOr[Font] = js.undefined
  
  // <size>;
  var haloColor: js.UndefOr[Color] = js.undefined
  
  var haloSize: js.UndefOr[Double] = js.undefined
  
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.undefined
  
  var kerning: js.UndefOr[Boolean] = js.undefined
  
  var rightToLeft: js.UndefOr[Boolean] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_TextSymbol: esriTS
  
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.undefined
}
object TextSymbol {
  
  inline def apply(): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("esriTS")
    __obj.asInstanceOf[TextSymbol]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextSymbol] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderLineColor(value: Color): Self = StObject.set(x, "borderLineColor", value.asInstanceOf[js.Any])
    
    inline def setBorderLineColorUndefined: Self = StObject.set(x, "borderLineColor", js.undefined)
    
    inline def setBorderLineSize(value: Double): Self = StObject.set(x, "borderLineSize", value.asInstanceOf[js.Any])
    
    inline def setBorderLineSizeUndefined: Self = StObject.set(x, "borderLineSize", js.undefined)
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHaloColor(value: Color): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    inline def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    inline def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    inline def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    inline def setHorizontalAlignment(value: left | right | center | justify): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    inline def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    inline def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    inline def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setType(value: esriTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignment(value: baseline | top | middle | bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
