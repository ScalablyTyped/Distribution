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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextSymbol extends MarkerSymbol {
  
  var backgroundColor: js.UndefOr[Color] = js.native
  
  // <size>;
  var borderLineColor: js.UndefOr[Color] = js.native
  
  var borderLineSize: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[Color] = js.native
  
  var font: js.UndefOr[Font] = js.native
  
  // <size>;
  var haloColor: js.UndefOr[Color] = js.native
  
  var haloSize: js.UndefOr[Double] = js.native
  
  var horizontalAlignment: js.UndefOr[left | right | center | justify] = js.native
  
  var kerning: js.UndefOr[Boolean] = js.native
  
  var rightToLeft: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  @JSName("type")
  var type_TextSymbol: esriTS = js.native
  
  var verticalAlignment: js.UndefOr[baseline | top | middle | bottom] = js.native
}
object TextSymbol {
  
  @scala.inline
  def apply(`type`: esriTS): TextSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSymbol]
  }
  
  @scala.inline
  implicit class TextSymbolMutableBuilder[Self <: TextSymbol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: Color): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderLineColor(value: Color): Self = StObject.set(x, "borderLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLineColorUndefined: Self = StObject.set(x, "borderLineColor", js.undefined)
    
    @scala.inline
    def setBorderLineSize(value: Double): Self = StObject.set(x, "borderLineSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLineSizeUndefined: Self = StObject.set(x, "borderLineSize", js.undefined)
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setHaloColor(value: Color): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    @scala.inline
    def setHaloSize(value: Double): Self = StObject.set(x, "haloSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHaloSizeUndefined: Self = StObject.set(x, "haloSize", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: left | right | center | justify): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    @scala.inline
    def setKerning(value: Boolean): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeftUndefined: Self = StObject.set(x, "rightToLeft", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setType(value: esriTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignment(value: baseline | top | middle | bottom): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
  }
}
