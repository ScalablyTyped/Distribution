package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabStrip extends StObject {
  
  var BackColor: Double
  
  val ClientHeight: Double
  
  val ClientLeft: Double
  
  val ClientTop: Double
  
  val ClientWidth: Double
  
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
  
  /* private */ @JSName("MSForms.TabStrip_typekey")
  var MSFormsDotTabStrip_typekey: TabStrip
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var MultiRow: Boolean
  
  val SelectedItem: Tab
  
  var Style: fmTabStyle
  
  var TabFixedHeight: Double
  
  var TabFixedWidth: Double
  
  var TabOrientation: fmTabOrientation
  
  def Tabs(varg: Any): Any
  @JSName("Tabs")
  val Tabs_Original: Tabs
  
  var Value: Double
  
  val _Font_Reserved: NewFont
  
  def _GetClientHeight(ClientHeight: Double): Unit
  
  def _GetClientLeft(ClientLeft: Double): Unit
  
  def _GetClientTop(ClientTop: Double): Unit
  
  def _GetClientWidth(ClientWidth: Double): Unit
  
  def _GetTabFixedHeight(TabFixedHeight: Double): Unit
  
  def _GetTabFixedWidth(TabFixedWidth: Double): Unit
  
  def _SetTabFixedHeight(TabFixedHeight: Double): Unit
  
  def _SetTabFixedWidth(TabFixedWidth: Double): Unit
}
object TabStrip {
  
  inline def apply(
    BackColor: Double,
    ClientHeight: Double,
    ClientLeft: Double,
    ClientTop: Double,
    ClientWidth: Double,
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
    MSFormsDotTabStrip_typekey: TabStrip,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiRow: Boolean,
    SelectedItem: Tab,
    Style: fmTabStyle,
    TabFixedHeight: Double,
    TabFixedWidth: Double,
    TabOrientation: fmTabOrientation,
    Tabs: Tabs,
    Value: Double,
    _Font_Reserved: NewFont,
    _GetClientHeight: Double => Unit,
    _GetClientLeft: Double => Unit,
    _GetClientTop: Double => Unit,
    _GetClientWidth: Double => Unit,
    _GetTabFixedHeight: Double => Unit,
    _GetTabFixedWidth: Double => Unit,
    _SetTabFixedHeight: Double => Unit,
    _SetTabFixedWidth: Double => Unit
  ): TabStrip = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], ClientHeight = ClientHeight.asInstanceOf[js.Any], ClientLeft = ClientLeft.asInstanceOf[js.Any], ClientTop = ClientTop.asInstanceOf[js.Any], ClientWidth = ClientWidth.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiRow = MultiRow.asInstanceOf[js.Any], SelectedItem = SelectedItem.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], TabFixedHeight = TabFixedHeight.asInstanceOf[js.Any], TabFixedWidth = TabFixedWidth.asInstanceOf[js.Any], TabOrientation = TabOrientation.asInstanceOf[js.Any], Tabs = Tabs.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any], _GetClientHeight = js.Any.fromFunction1(_GetClientHeight), _GetClientLeft = js.Any.fromFunction1(_GetClientLeft), _GetClientTop = js.Any.fromFunction1(_GetClientTop), _GetClientWidth = js.Any.fromFunction1(_GetClientWidth), _GetTabFixedHeight = js.Any.fromFunction1(_GetTabFixedHeight), _GetTabFixedWidth = js.Any.fromFunction1(_GetTabFixedWidth), _SetTabFixedHeight = js.Any.fromFunction1(_SetTabFixedHeight), _SetTabFixedWidth = js.Any.fromFunction1(_SetTabFixedWidth))
    __obj.updateDynamic("MSForms.TabStrip_typekey")(MSFormsDotTabStrip_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabStrip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabStrip] (val x: Self) extends AnyVal {
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "ClientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientLeft(value: Double): Self = StObject.set(x, "ClientLeft", value.asInstanceOf[js.Any])
    
    inline def setClientTop(value: Double): Self = StObject.set(x, "ClientTop", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "ClientWidth", value.asInstanceOf[js.Any])
    
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
    
    inline def setMSFormsDotTabStrip_typekey(value: TabStrip): Self = StObject.set(x, "MSForms.TabStrip_typekey", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setMultiRow(value: Boolean): Self = StObject.set(x, "MultiRow", value.asInstanceOf[js.Any])
    
    inline def setSelectedItem(value: Tab): Self = StObject.set(x, "SelectedItem", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: fmTabStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
    
    inline def setTabFixedHeight(value: Double): Self = StObject.set(x, "TabFixedHeight", value.asInstanceOf[js.Any])
    
    inline def setTabFixedWidth(value: Double): Self = StObject.set(x, "TabFixedWidth", value.asInstanceOf[js.Any])
    
    inline def setTabOrientation(value: fmTabOrientation): Self = StObject.set(x, "TabOrientation", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: Tabs): Self = StObject.set(x, "Tabs", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
    
    inline def set_GetClientHeight(value: Double => Unit): Self = StObject.set(x, "_GetClientHeight", js.Any.fromFunction1(value))
    
    inline def set_GetClientLeft(value: Double => Unit): Self = StObject.set(x, "_GetClientLeft", js.Any.fromFunction1(value))
    
    inline def set_GetClientTop(value: Double => Unit): Self = StObject.set(x, "_GetClientTop", js.Any.fromFunction1(value))
    
    inline def set_GetClientWidth(value: Double => Unit): Self = StObject.set(x, "_GetClientWidth", js.Any.fromFunction1(value))
    
    inline def set_GetTabFixedHeight(value: Double => Unit): Self = StObject.set(x, "_GetTabFixedHeight", js.Any.fromFunction1(value))
    
    inline def set_GetTabFixedWidth(value: Double => Unit): Self = StObject.set(x, "_GetTabFixedWidth", js.Any.fromFunction1(value))
    
    inline def set_SetTabFixedHeight(value: Double => Unit): Self = StObject.set(x, "_SetTabFixedHeight", js.Any.fromFunction1(value))
    
    inline def set_SetTabFixedWidth(value: Double => Unit): Self = StObject.set(x, "_SetTabFixedWidth", js.Any.fromFunction1(value))
  }
}
