package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBox extends js.Object {
  var AutoSize: Boolean
  var AutoTab: Boolean
  var AutoWordSelect: Boolean
  var BackColor: Double
  var BackStyle: fmBackStyle
  var BorderColor: Double
  var BorderStyle: fmBorderStyle
  var BordersSuppress: Boolean
  val CanPaste: Boolean
  var CurLine: Double
  val CurTargetX: Double
  val CurTargetY: Double
  var CurX: Double
  var CurY: Double
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
  @JSName("MSForms.TextBox_typekey")
  var MSFormsDotTextBox_typekey: TextBox
  var MaxLength: Double
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var MultiLine: Boolean
  var PasswordChar: String
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
  var Value: js.Any
  var WordWrap: Boolean
  val _Font_Reserved: NewFont
  def Copy(): Unit
  def Cut(): Unit
  def Paste(): Unit
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
}

