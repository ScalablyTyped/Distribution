package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextBox extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: Double = js.native
  var BackStyle: fmBackStyle = js.native
  var BorderColor: Double = js.native
  var BorderStyle: fmBorderStyle = js.native
  var BordersSuppress: Boolean = js.native
  val CanPaste: Boolean = js.native
  var CurLine: Double = js.native
  val CurTargetX: Double = js.native
  val CurTargetY: Double = js.native
  var CurX: Double = js.native
  var CurY: Double = js.native
  val DisplayStyle: fmDisplayStyle = js.native
  var DragBehavior: fmDragBehavior = js.native
  var DropButtonStyle: fmDropButtonStyle = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: fmEnterFieldBehavior = js.native
  var EnterKeyBehavior: Boolean = js.native
  var Font: NewFont = js.native
  var FontBold: Boolean = js.native
  var FontItalic: Boolean = js.native
  var FontName: String = js.native
  var FontSize: Double = js.native
  var FontStrikethru: Boolean = js.native
  var FontUnderline: Boolean = js.native
  var FontWeight: Double = js.native
  var ForeColor: Double = js.native
  var HideSelection: Boolean = js.native
  var IMEMode: fmIMEMode = js.native
  var IntegralHeight: Boolean = js.native
  val LineCount: Double = js.native
  var Locked: Boolean = js.native
  @JSName("MSForms.TextBox_typekey")
  var MSFormsDotTextBox_typekey: TextBox = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: fmMousePointer = js.native
  var MultiLine: Boolean = js.native
  var PasswordChar: String = js.native
  var ScrollBars: fmScrollBars = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  var SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var ShowDropButtonWhen: fmShowDropButtonWhen = js.native
  var SpecialEffect: fmSpecialEffect = js.native
  var TabKeyBehavior: Boolean = js.native
  var Text: String = js.native
  var TextAlign: fmTextAlign = js.native
  val TextLength: Double = js.native
  val Valid: Boolean = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  val _Font_Reserved: NewFont = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
}

object TextBox {
  @scala.inline
  def apply(
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
    Value: js.Any,
    WordWrap: Boolean,
    _Font_Reserved: NewFont
  ): TextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderColor = BorderColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], BordersSuppress = BordersSuppress.asInstanceOf[js.Any], CanPaste = CanPaste.asInstanceOf[js.Any], Copy = js.Any.fromFunction0(Copy), CurLine = CurLine.asInstanceOf[js.Any], CurTargetX = CurTargetX.asInstanceOf[js.Any], CurTargetY = CurTargetY.asInstanceOf[js.Any], CurX = CurX.asInstanceOf[js.Any], CurY = CurY.asInstanceOf[js.Any], Cut = js.Any.fromFunction0(Cut), DisplayStyle = DisplayStyle.asInstanceOf[js.Any], DragBehavior = DragBehavior.asInstanceOf[js.Any], DropButtonStyle = DropButtonStyle.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], FontBold = FontBold.asInstanceOf[js.Any], FontItalic = FontItalic.asInstanceOf[js.Any], FontName = FontName.asInstanceOf[js.Any], FontSize = FontSize.asInstanceOf[js.Any], FontStrikethru = FontStrikethru.asInstanceOf[js.Any], FontUnderline = FontUnderline.asInstanceOf[js.Any], FontWeight = FontWeight.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], LineCount = LineCount.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), ScrollBars = ScrollBars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], ShowDropButtonWhen = ShowDropButtonWhen.asInstanceOf[js.Any], SpecialEffect = SpecialEffect.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], TextLength = TextLength.asInstanceOf[js.Any], Valid = Valid.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any], _Font_Reserved = _Font_Reserved.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.TextBox_typekey")(MSFormsDotTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextBox]
  }
  @scala.inline
  implicit class TextBoxOps[Self <: TextBox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoTab(value: Boolean): Self = this.set("AutoTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoWordSelect(value: Boolean): Self = this.set("AutoWordSelect", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackColor(value: Double): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackStyle(value: fmBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: Double): Self = this.set("BorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: fmBorderStyle): Self = this.set("BorderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBordersSuppress(value: Boolean): Self = this.set("BordersSuppress", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanPaste(value: Boolean): Self = this.set("CanPaste", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCurLine(value: Double): Self = this.set("CurLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurTargetX(value: Double): Self = this.set("CurTargetX", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurTargetY(value: Double): Self = this.set("CurTargetY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurX(value: Double): Self = this.set("CurX", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurY(value: Double): Self = this.set("CurY", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDisplayStyle(value: fmDisplayStyle): Self = this.set("DisplayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragBehavior(value: fmDragBehavior): Self = this.set("DragBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setDropButtonStyle(value: fmDropButtonStyle): Self = this.set("DropButtonStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterFieldBehavior(value: fmEnterFieldBehavior): Self = this.set("EnterFieldBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterKeyBehavior(value: Boolean): Self = this.set("EnterKeyBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: NewFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontBold(value: Boolean): Self = this.set("FontBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontItalic(value: Boolean): Self = this.set("FontItalic", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontName(value: String): Self = this.set("FontName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: Double): Self = this.set("FontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontStrikethru(value: Boolean): Self = this.set("FontStrikethru", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontUnderline(value: Boolean): Self = this.set("FontUnderline", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("FontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeColor(value: Double): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideSelection(value: Boolean): Self = this.set("HideSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMEMode(value: fmIMEMode): Self = this.set("IMEMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegralHeight(value: Boolean): Self = this.set("IntegralHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineCount(value: Double): Self = this.set("LineCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotTextBox_typekey(value: TextBox): Self = this.set("MSForms.TextBox_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: fmMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLine(value: Boolean): Self = this.set("MultiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordChar(value: String): Self = this.set("PasswordChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaste(value: () => Unit): Self = this.set("Paste", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollBars(value: fmScrollBars): Self = this.set("ScrollBars", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelLength(value: Double): Self = this.set("SelLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelStart(value: Double): Self = this.set("SelStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelText(value: String): Self = this.set("SelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMargin(value: Boolean): Self = this.set("SelectionMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowDropButtonWhen(value: fmShowDropButtonWhen): Self = this.set("ShowDropButtonWhen", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecialEffect(value: fmSpecialEffect): Self = this.set("SpecialEffect", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabKeyBehavior(value: Boolean): Self = this.set("TabKeyBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: fmTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextLength(value: Double): Self = this.set("TextLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setValid(value: Boolean): Self = this.set("Valid", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def set_Font_Reserved(value: NewFont): Self = this.set("_Font_Reserved", value.asInstanceOf[js.Any])
  }
  
}

