package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkTimeControl extends js.Object {
  var AutoSize: Boolean
  var AutoWordSelect: Boolean
  var BackColor: OLE_COLOR
  var BackStyle: OlBackStyle
  var Enabled: Boolean
  var EnterFieldBehavior: OlEnterFieldBehavior
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var HideSelection: Boolean
  var IntervalTime: VarDate
  var Locked: Boolean
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkTimeControl_typekey")
  var OutlookDotOlkTimeControl_typekey: OlkTimeControl
  var ReferenceTime: VarDate
  var Style: OlTimeStyle
  var Text: String
  var TextAlign: OlTextAlign
  var Time: VarDate
  var Value: js.Any
  def DropDown(): Unit
}

object OlkTimeControl {
  @scala.inline
  def apply(
    AutoSize: Boolean,
    AutoWordSelect: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    DropDown: () => Unit,
    Enabled: Boolean,
    EnterFieldBehavior: OlEnterFieldBehavior,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    HideSelection: Boolean,
    IntervalTime: VarDate,
    Locked: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkTimeControl_typekey: OlkTimeControl,
    ReferenceTime: VarDate,
    Style: OlTimeStyle,
    Text: String,
    TextAlign: OlTextAlign,
    Time: VarDate,
    Value: js.Any
  ): OlkTimeControl = {
    val __obj = js.Dynamic.literal(AutoSize = AutoSize.asInstanceOf[js.Any], AutoWordSelect = AutoWordSelect.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], DropDown = js.Any.fromFunction0(DropDown), Enabled = Enabled.asInstanceOf[js.Any], EnterFieldBehavior = EnterFieldBehavior.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], HideSelection = HideSelection.asInstanceOf[js.Any], IntervalTime = IntervalTime.asInstanceOf[js.Any], Locked = Locked.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], ReferenceTime = ReferenceTime.asInstanceOf[js.Any], Style = Style.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], Time = Time.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkTimeControl_typekey")(OutlookDotOlkTimeControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkTimeControl]
  }
}

