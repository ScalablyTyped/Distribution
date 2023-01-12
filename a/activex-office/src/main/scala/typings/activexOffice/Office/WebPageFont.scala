package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebPageFont extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  var FixedWidthFont: String
  
  var FixedWidthFontSize: Double
  
  /* private */ @JSName("Office.WebPageFont_typekey")
  var OfficeDotWebPageFont_typekey: WebPageFont
  
  var ProportionalFont: String
  
  var ProportionalFontSize: Double
}
object WebPageFont {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    FixedWidthFont: String,
    FixedWidthFontSize: Double,
    OfficeDotWebPageFont_typekey: WebPageFont,
    ProportionalFont: String,
    ProportionalFontSize: Double
  ): WebPageFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FixedWidthFont = FixedWidthFont.asInstanceOf[js.Any], FixedWidthFontSize = FixedWidthFontSize.asInstanceOf[js.Any], ProportionalFont = ProportionalFont.asInstanceOf[js.Any], ProportionalFontSize = ProportionalFontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WebPageFont_typekey")(OfficeDotWebPageFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageFont]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebPageFont] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setFixedWidthFont(value: String): Self = StObject.set(x, "FixedWidthFont", value.asInstanceOf[js.Any])
    
    inline def setFixedWidthFontSize(value: Double): Self = StObject.set(x, "FixedWidthFontSize", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotWebPageFont_typekey(value: WebPageFont): Self = StObject.set(x, "Office.WebPageFont_typekey", value.asInstanceOf[js.Any])
    
    inline def setProportionalFont(value: String): Self = StObject.set(x, "ProportionalFont", value.asInstanceOf[js.Any])
    
    inline def setProportionalFontSize(value: Double): Self = StObject.set(x, "ProportionalFontSize", value.asInstanceOf[js.Any])
  }
}
