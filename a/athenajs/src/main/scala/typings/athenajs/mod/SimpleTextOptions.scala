package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleTextOptions extends DrawableOptions {
  
  var align: js.UndefOr[String] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var fontFace: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[String] = js.native
  
  var fontStyle: js.UndefOr[String] = js.native
  
  var fontWeight: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object SimpleTextOptions {
  
  @scala.inline
  def apply(): SimpleTextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleTextOptions]
  }
  
  @scala.inline
  implicit class SimpleTextOptionsMutableBuilder[Self <: SimpleTextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFace(value: String): Self = StObject.set(x, "fontFace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFaceUndefined: Self = StObject.set(x, "fontFace", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
