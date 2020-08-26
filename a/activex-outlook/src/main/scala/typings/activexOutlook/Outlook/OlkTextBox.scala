package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Outlook TextBox */
@js.native
trait OlkTextBox extends js.Object {
  var AutoSize: Boolean = js.native
  var AutoTab: Boolean = js.native
  var AutoWordSelect: Boolean = js.native
  var BackColor: OLE_COLOR = js.native
  var BorderStyle: OlBorderStyle = js.native
  var DragBehavior: OlDragBehavior = js.native
  var EnableRichText: Boolean = js.native
  var Enabled: Boolean = js.native
  var EnterFieldBehavior: OlEnterFieldBehavior = js.native
  var EnterKeyBehavior: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var HideSelection: Boolean = js.native
  var IntegralHeight: Boolean = js.native
  var Locked: Boolean = js.native
  var MaxLength: Double = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  var MultiLine: Boolean = js.native
  @JSName("Outlook.OlkTextBox_typekey")
  var OutlookDotOlkTextBox_typekey: OlkTextBox = js.native
  var PasswordChar: String = js.native
  var Scrollbars: OlScrollBars = js.native
  var SelLength: Double = js.native
  var SelStart: Double = js.native
  val SelText: String = js.native
  var SelectionMargin: Boolean = js.native
  var TabKeyBehavior: Boolean = js.native
  var Text: String = js.native
  var TextAlign: OlTextAlign = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
  def Clear(): Unit = js.native
  def Copy(): Unit = js.native
  def Cut(): Unit = js.native
  def Paste(): Unit = js.native
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
  @scala.inline
  implicit class OlkTextBoxOps[Self <: OlkTextBox] (val x: Self) extends AnyVal {
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
    def setBackColor(value: OLE_COLOR): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderStyle(value: OlBorderStyle): Self = this.set("BorderStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("Clear", js.Any.fromFunction0(value))
    @scala.inline
    def setCopy(value: () => Unit): Self = this.set("Copy", js.Any.fromFunction0(value))
    @scala.inline
    def setCut(value: () => Unit): Self = this.set("Cut", js.Any.fromFunction0(value))
    @scala.inline
    def setDragBehavior(value: OlDragBehavior): Self = this.set("DragBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnableRichText(value: Boolean): Self = this.set("EnableRichText", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterFieldBehavior(value: OlEnterFieldBehavior): Self = this.set("EnterFieldBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterKeyBehavior(value: Boolean): Self = this.set("EnterKeyBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: StdFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideSelection(value: Boolean): Self = this.set("HideSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegralHeight(value: Boolean): Self = this.set("IntegralHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("Locked", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("MaxLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiLine(value: Boolean): Self = this.set("MultiLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotOlkTextBox_typekey(value: OlkTextBox): Self = this.set("Outlook.OlkTextBox_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordChar(value: String): Self = this.set("PasswordChar", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaste(value: () => Unit): Self = this.set("Paste", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollbars(value: OlScrollBars): Self = this.set("Scrollbars", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelLength(value: Double): Self = this.set("SelLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelStart(value: Double): Self = this.set("SelStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelText(value: String): Self = this.set("SelText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionMargin(value: Boolean): Self = this.set("SelectionMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabKeyBehavior(value: Boolean): Self = this.set("TabKeyBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

