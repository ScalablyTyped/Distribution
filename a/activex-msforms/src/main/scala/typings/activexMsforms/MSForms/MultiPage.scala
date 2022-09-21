package typings.activexMsforms.MSForms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiPage extends StObject {
  
  var BackColor: Double
  
  var Enabled: Boolean
  
  var Font: NewFont
  
  var FontBold: Boolean
  
  var FontItalic: Boolean
  
  var FontName: String
  
  var FontSize: Double
  
  var FontStrikethru: Boolean
  
  var FontUnderline: Boolean
  
  var FontWeight: Double
  
  var ForeColor: Double
  
  /* private */ @JSName("MSForms.MultiPage_typekey")
  var MSFormsDotMultiPage_typekey: MultiPage
  
  var MultiRow: Boolean
  
  def Pages(varg: Any): Any
  @JSName("Pages")
  val Pages_Original: Pages
  
  val SelectedItem: Page
  
  var Style: fmTabStyle
  
  var TabFixedHeight: Double
  
  var TabFixedWidth: Double
  
  var TabOrientation: fmTabOrientation
  
  var Value: Double
  
  val _Font_Reserved: NewFont
  
  def _GetTabFixedHeight(Height: Double): Unit
  
  def _GetTabFixedWidth(Width: Double): Unit
  
  def _SetTabFixedHeight(Height: Double): Unit
  
  def _SetTabFixedWidth(Width: Double): Unit
}
object MultiPage {
  
  inline def apply(
    BackColor: Double,
    Enabled: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    MSFormsDotMultiPage_typekey: MultiPage,
    MultiRow: Boolean,
    Pages: Pages,
    SelectedItem: Page,
    Style: fmTabStyle,
    TabFixedHeight: Double,
    TabFixedWidth: Double,
    TabOrientation: fmTabOrientation,
    Value: Double,
    _Font_Reserved: NewFont,
    _GetTabFixedHeight: Double => Unit,
    _GetTabFixedWidth: Double => Unit,
    _SetTabFixedHeight: Double => Unit,
    _SetTabFixedWidth: Double => Unit
  ): MultiPage = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MultiRow = MultiRow.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TabFixedHeight = TabFixedHeight.asInstanceOf[js.Any], TabFixedWidth = TabFixedWidth.asInstanceOf[js.Any], TabOrientation = TabOrientation.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any], _GetTabFixedHeight = js.Any.fromFunction1(_GetTabFixedHeight), _GetTabFixedWidth = js.Any.fromFunction1(_GetTabFixedWidth), _SetTabFixedHeight = js.Any.fromFunction1(_SetTabFixedHeight), _SetTabFixedWidth = js.Any.fromFunction1(_SetTabFixedWidth))
    __obj.updateDynamic("MSForms.MultiPage_typekey")(MSFormsDotMultiPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPage]
  }
  
  extension [Self <: MultiPage](x: Self) {
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setFont(value: NewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFontBold(value: Boolean): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    inline def setFontItalic(value: Boolean): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontStrikethru(value: Boolean): Self = StObject.set(x, "FontStrikethru", value.asInstanceOf[js.Any])
    
    inline def setFontUnderline(value: Boolean): Self = StObject.set(x, "FontUnderline", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "FontWeight", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotMultiPage_typekey(value: MultiPage): Self = StObject.set(x, "MSForms.MultiPage_typekey", value.asInstanceOf[js.Any])
    
    inline def setMultiRow(value: Boolean): Self = StObject.set(x, "MultiRow", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Pages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Page): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: fmTabStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTabFixedHeight(value: Double): Self = StObject.set(x, "TabFixedHeight", value.asInstanceOf[js.Any])
    
    inline def setTabFixedWidth(value: Double): Self = StObject.set(x, "TabFixedWidth", value.asInstanceOf[js.Any])
    
    inline def setTabOrientation(value: fmTabOrientation): Self = StObject.set(x, "TabOrientation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
    
    inline def set_GetTabFixedHeight(value: Double => Unit): Self = StObject.set(x, "_GetTabFixedHeight", js.Any.fromFunction1(value))
    
    inline def set_GetTabFixedWidth(value: Double => Unit): Self = StObject.set(x, "_GetTabFixedWidth", js.Any.fromFunction1(value))
    
    inline def set_SetTabFixedHeight(value: Double => Unit): Self = StObject.set(x, "_SetTabFixedHeight", js.Any.fromFunction1(value))
    
    inline def set_SetTabFixedWidth(value: Double => Unit): Self = StObject.set(x, "_SetTabFixedWidth", js.Any.fromFunction1(value))
  }
}
