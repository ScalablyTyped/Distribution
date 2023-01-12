package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextBox extends StObject {
  
  var AutoSize: Boolean
  
  var AutoTab: Boolean
  
  var AutoWordSelect: Boolean
  
  var BackColor: Double
  
  var BackStyle: fmBackStyle
  
  var BorderColor: Double
  
  var BorderStyle: fmBorderStyle
  
  var BordersSuppress: Boolean
  
  val CanPaste: Boolean
  
  def Copy(): Unit
  
  var CurLine: Double
  
  val CurTargetX: Double
  
  val CurTargetY: Double
  
  var CurX: Double
  
  var CurY: Double
  
  def Cut(): Unit
  
  val DisplayStyle: fmDisplayStyle
  
  var DragBehavior: fmDragBehavior
  
  var DropButtonStyle: fmDropButtonStyle
  
  var Enabled: Boolean
  
  var EnterFieldBehavior: fmEnterFieldBehavior
  
  var EnterKeyBehavior: Boolean
  
  var Font: NewFont
  
  var FontBold: Boolean
  
  var FontItalic: Boolean
  
  var FontName: String
  
  var FontSize: Double
  
  var FontStrikethru: Boolean
  
  var FontUnderline: Boolean
  
  var FontWeight: Double
  
  var ForeColor: Double
  
  var HideSelection: Boolean
  
  var IMEMode: fmIMEMode
  
  var IntegralHeight: Boolean
  
  val LineCount: Double
  
  var Locked: Boolean
  
  /* private */ @JSName("MSForms.TextBox_typekey")
  var MSFormsDotTextBox_typekey: TextBox
  
  var MaxLength: Double
  
  var MouseIcon: StdPicture
  
  var MousePointer: fmMousePointer
  
  var MultiLine: Boolean
  
  var PasswordChar: String
  
  def Paste(): Unit
  
  var ScrollBars: fmScrollBars
  
  var SelLength: Double
  
  var SelStart: Double
  
  var SelText: String
  
  var SelectionMargin: Boolean
  
  var ShowDropButtonWhen: fmShowDropButtonWhen
  
  var SpecialEffect: fmSpecialEffect
  
  var TabKeyBehavior: Boolean
  
  var Text: String
  
  var TextAlign: fmTextAlign
  
  val TextLength: Double
  
  val Valid: Boolean
  
  var Value: Any
  
  var WordWrap: Boolean
  
  val _Font_Reserved: NewFont
}
object TextBox {
  
  inline def apply(
    AutoSize: Boolean,
    AutoTab: Boolean,
    AutoWordSelect: Boolean,
    BackColor: Double,
    BackStyle: fmBackStyle,
    BorderColor: Double,
    BorderStyle: fmBorderStyle,
    BordersSuppress: Boolean,
    CanPaste: Boolean,
    Copy: () => Unit,
    CurLine: Double,
    CurTargetX: Double,
    CurTargetY: Double,
    CurX: Double,
    CurY: Double,
    Cut: () => Unit,
    DisplayStyle: fmDisplayStyle,
    DragBehavior: fmDragBehavior,
    DropButtonStyle: fmDropButtonStyle,
    Enabled: Boolean,
    EnterFieldBehavior: fmEnterFieldBehavior,
    EnterKeyBehavior: Boolean,
    Font: NewFont,
    FontBold: Boolean,
    FontItalic: Boolean,
    FontName: String,
    FontSize: Double,
    FontStrikethru: Boolean,
    FontUnderline: Boolean,
    FontWeight: Double,
    ForeColor: Double,
    HideSelection: Boolean,
    IMEMode: fmIMEMode,
    IntegralHeight: Boolean,
    LineCount: Double,
    Locked: Boolean,
    MSFormsDotTextBox_typekey: TextBox,
    MaxLength: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    MultiLine: Boolean,
    PasswordChar: String,
    Paste: () => Unit,
    ScrollBars: fmScrollBars,
    SelLength: Double,
    SelStart: Double,
    SelText: String,
    SelectionMargin: Boolean,
    ShowDropButtonWhen: fmShowDropButtonWhen,
    SpecialEffect: fmSpecialEffect,
    TabKeyBehavior: Boolean,
    Text: String,
    TextAlign: fmTextAlign,
    TextLength: Double,
    Valid: Boolean,
    Value: Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): TextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], CanPaste = CanPaste.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), CurLine = CurLine.asInstanceOf[js.Any], CurTargetX = CurTargetX.asInstanceOf[js.Any], CurTargetY = CurTargetY.asInstanceOf[js.Any], CurX = CurX.asInstanceOf[js.Any], CurY = CurY.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), DisplayStyle = DisplayStyle.asInstanceOf[js.Any], DragBehavior = DragBehavior.asInstanceOf[js.Any], DropButtonStyle = DropButtonStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), ScrollBars = ScrollBars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], ShowDropButtonWhen = ShowDropButtonWhen.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TextLength = TextLength.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.TextBox_typekey")(MSFormsDotTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextBox] (val x: Self) extends AnyVal {
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "AutoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoTab(value: Boolean): Self = StObject.set(x, "AutoTab", value.asInstanceOf[js.Any])
    
    inline def setAutoWordSelect(value: Boolean): Self = StObject.set(x, "AutoWordSelect", value.asInstanceOf[js.Any])
    
    inline def setBackColor(value: Double): Self = StObject.set(x, "BackColor", value.asInstanceOf[js.Any])
    
    inline def setBackStyle(value: fmBackStyle): Self = StObject.set(x, "BackStyle", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: Double): Self = StObject.set(x, "BorderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderStyle(value: fmBorderStyle): Self = StObject.set(x, "BorderStyle", value.asInstanceOf[js.Any])
    
    inline def setBordersSuppress(value: Boolean): Self = StObject.set(x, "BordersSuppress", value.asInstanceOf[js.Any])
    
    inline def setCanPaste(value: Boolean): Self = StObject.set(x, "CanPaste", value.asInstanceOf[js.Any])
    
    inline def setCopy(value: () => Unit): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    inline def setCurLine(value: Double): Self = StObject.set(x, "CurLine", value.asInstanceOf[js.Any])
    
    inline def setCurTargetX(value: Double): Self = StObject.set(x, "CurTargetX", value.asInstanceOf[js.Any])
    
    inline def setCurTargetY(value: Double): Self = StObject.set(x, "CurTargetY", value.asInstanceOf[js.Any])
    
    inline def setCurX(value: Double): Self = StObject.set(x, "CurX", value.asInstanceOf[js.Any])
    
    inline def setCurY(value: Double): Self = StObject.set(x, "CurY", value.asInstanceOf[js.Any])
    
    inline def setCut(value: () => Unit): Self = StObject.set(x, "Cut", js.Any.fromFunction0(value))
    
    inline def setDisplayStyle(value: fmDisplayStyle): Self = StObject.set(x, "DisplayStyle", value.asInstanceOf[js.Any])
    
    inline def setDragBehavior(value: fmDragBehavior): Self = StObject.set(x, "DragBehavior", value.asInstanceOf[js.Any])
    
    inline def setDropButtonStyle(value: fmDropButtonStyle): Self = StObject.set(x, "DropButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnterFieldBehavior(value: fmEnterFieldBehavior): Self = StObject.set(x, "EnterFieldBehavior", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyBehavior(value: Boolean): Self = StObject.set(x, "EnterKeyBehavior", value.asInstanceOf[js.Any])
    
    inline def setFont(value: NewFont): Self = StObject.set(x, "Font", value.asInstanceOf[js.Any])
    
    inline def setFontBold(value: Boolean): Self = StObject.set(x, "FontBold", value.asInstanceOf[js.Any])
    
    inline def setFontItalic(value: Boolean): Self = StObject.set(x, "FontItalic", value.asInstanceOf[js.Any])
    
    inline def setFontName(value: String): Self = StObject.set(x, "FontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "FontSize", value.asInstanceOf[js.Any])
    
    inline def setFontStrikethru(value: Boolean): Self = StObject.set(x, "FontStrikethru", value.asInstanceOf[js.Any])
    
    inline def setFontUnderline(value: Boolean): Self = StObject.set(x, "FontUnderline", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: Double): Self = StObject.set(x, "FontWeight", value.asInstanceOf[js.Any])
    
    inline def setForeColor(value: Double): Self = StObject.set(x, "ForeColor", value.asInstanceOf[js.Any])
    
    inline def setHideSelection(value: Boolean): Self = StObject.set(x, "HideSelection", value.asInstanceOf[js.Any])
    
    inline def setIMEMode(value: fmIMEMode): Self = StObject.set(x, "IMEMode", value.asInstanceOf[js.Any])
    
    inline def setIntegralHeight(value: Boolean): Self = StObject.set(x, "IntegralHeight", value.asInstanceOf[js.Any])
    
    inline def setLineCount(value: Double): Self = StObject.set(x, "LineCount", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "Locked", value.asInstanceOf[js.Any])
    
    inline def setMSFormsDotTextBox_typekey(value: TextBox): Self = StObject.set(x, "MSForms.TextBox_typekey", value.asInstanceOf[js.Any])
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "MaxLength", value.asInstanceOf[js.Any])
    
    inline def setMouseIcon(value: StdPicture): Self = StObject.set(x, "MouseIcon", value.asInstanceOf[js.Any])
    
    inline def setMousePointer(value: fmMousePointer): Self = StObject.set(x, "MousePointer", value.asInstanceOf[js.Any])
    
    inline def setMultiLine(value: Boolean): Self = StObject.set(x, "MultiLine", value.asInstanceOf[js.Any])
    
    inline def setPasswordChar(value: String): Self = StObject.set(x, "PasswordChar", value.asInstanceOf[js.Any])
    
    inline def setPaste(value: () => Unit): Self = StObject.set(x, "Paste", js.Any.fromFunction0(value))
    
    inline def setScrollBars(value: fmScrollBars): Self = StObject.set(x, "ScrollBars", value.asInstanceOf[js.Any])
    
    inline def setSelLength(value: Double): Self = StObject.set(x, "SelLength", value.asInstanceOf[js.Any])
    
    inline def setSelStart(value: Double): Self = StObject.set(x, "SelStart", value.asInstanceOf[js.Any])
    
    inline def setSelText(value: String): Self = StObject.set(x, "SelText", value.asInstanceOf[js.Any])
    
    inline def setSelectionMargin(value: Boolean): Self = StObject.set(x, "SelectionMargin", value.asInstanceOf[js.Any])
    
    inline def setShowDropButtonWhen(value: fmShowDropButtonWhen): Self = StObject.set(x, "ShowDropButtonWhen", value.asInstanceOf[js.Any])
    
    inline def setSpecialEffect(value: fmSpecialEffect): Self = StObject.set(x, "SpecialEffect", value.asInstanceOf[js.Any])
    
    inline def setTabKeyBehavior(value: Boolean): Self = StObject.set(x, "TabKeyBehavior", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: fmTextAlign): Self = StObject.set(x, "TextAlign", value.asInstanceOf[js.Any])
    
    inline def setTextLength(value: Double): Self = StObject.set(x, "TextLength", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Boolean): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWordWrap(value: Boolean): Self = StObject.set(x, "WordWrap", value.asInstanceOf[js.Any])
    
    inline def set_Font_Reserved(value: NewFont): Self = StObject.set(x, "_Font_Reserved", value.asInstanceOf[js.Any])
  }
}
