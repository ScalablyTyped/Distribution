package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Outlook TextBox */
trait OlkTextBox extends js.Object {
  var AutoSize: Boolean
  var AutoTab: Boolean
  var AutoWordSelect: Boolean
  var BackColor: OLE_COLOR
  var BorderStyle: OlBorderStyle
  var DragBehavior: OlDragBehavior
  var EnableRichText: Boolean
  var Enabled: Boolean
  var EnterFieldBehavior: OlEnterFieldBehavior
  var EnterKeyBehavior: Boolean
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var HideSelection: Boolean
  var IntegralHeight: Boolean
  var Locked: Boolean
  var MaxLength: Double
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  var MultiLine: Boolean
  @JSName("Outlook.OlkTextBox_typekey")
  var OutlookDotOlkTextBox_typekey: OlkTextBox
  var PasswordChar: String
  var Scrollbars: OlScrollBars
  var SelLength: Double
  var SelStart: Double
  val SelText: String
  var SelectionMargin: Boolean
  var TabKeyBehavior: Boolean
  var Text: String
  var TextAlign: OlTextAlign
  var Value: js.Any
  var WordWrap: Boolean
  def Clear(): Unit
  def Copy(): Unit
  def Cut(): Unit
  def Paste(): Unit
}

object OlkTextBox {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoTab: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BorderStyle: OlBorderStyle,
    Clear: () => Unit,
    Copy: () => Unit,
    Cut: () => Unit,
    DragBehavior: OlDragBehavior,
    EnableRichText: Boolean,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    EnterKeyBehavior: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntegralHeight: Boolean,
    Locked: Boolean,
    MaxLength: Double,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    MultiLine: Boolean,
    OutlookDotOlkTextBox_typekey: OlkTextBox,
    PasswordChar: String,
    Paste: () => Unit,
    Scrollbars: OlScrollBars,
    SelLength: Double,
    SelStart: Double,
    SelText: String,
    SelectionMargin: Boolean,
    TabKeyBehavior: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkTextBox = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoTab = AutoTab.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Copy = js.Any.fromFunction0(Copy), Cut = js.Any.fromFunction0(Cut), DragBehavior = DragBehavior.asInstanceOf[js.Any], EnableRichText = EnableRichText.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], EnterKeyBehavior = EnterKeyBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntegralHeight = IntegralHeight.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], MultiLine = MultiLine.asInstanceOf[js.Any], PasswordChar = PasswordChar.asInstanceOf[js.Any], Paste = js.Any.fromFunction0(Paste), Scrollbars = Scrollbars.asInstanceOf[js.Any], SelLength = SelLength.asInstanceOf[js.Any], SelStart = SelStart.asInstanceOf[js.Any], SelText = SelText.asInstanceOf[js.Any], SelectionMargin = SelectionMargin.asInstanceOf[js.Any], TabKeyBehavior = TabKeyBehavior.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTextBox_typekey")(OutlookDotOlkTextBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTextBox]
  }
}

