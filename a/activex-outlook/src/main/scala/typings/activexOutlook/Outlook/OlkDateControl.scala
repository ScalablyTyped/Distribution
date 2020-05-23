package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkDateControl extends js.Object {
  var AutoSize: Boolean
  var AutoWordSelect: Boolean
  var BackColor: OLE_COLOR
  var BackStyle: OlBackStyle
  var Date: VarDate
  var Enabled: Boolean
  var EnterFieldBehavior: OlEnterFieldBehavior
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var HideSelection: Boolean
  var Locked: Boolean
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkDateControl_typekey")
  var OutlookDotOlkDateControl_typekey: OlkDateControl
  var ShowNoneButton: Boolean
  var Text: String
  var TextAlign: OlTextAlign
  var Value: js.Any
  def DropDown(): Unit
}

object OlkDateControl {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Date: VarDate,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkDateControl_typekey: OlkDateControl,
    ShowNoneButton: Boolean,
    Text: String,
    TextAlign: OlTextAlign,
    Value: js.Any
  ): OlkDateControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ShowNoneButton = ShowNoneButton.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkDateControl_typekey")(OutlookDotOlkDateControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkDateControl]
  }
}

