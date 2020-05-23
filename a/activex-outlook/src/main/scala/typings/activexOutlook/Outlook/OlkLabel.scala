package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkLabel extends js.Object {
  var Accelerator: String
  var AutoSize: Boolean
  var BackColor: OLE_COLOR
  var BackStyle: OlBackStyle
  var BorderStyle: OlBorderStyle
  var Caption: String
  var Enabled: Boolean
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkLabel_typekey")
  var OutlookDotOlkLabel_typekey: OlkLabel
  var TextAlign: OlTextAlign
  var UseHeaderColor: Boolean
  var Value: js.Any
  var WordWrap: Boolean
}

object OlkLabel {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    BorderStyle: OlBorderStyle,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkLabel_typekey: OlkLabel,
    TextAlign: OlTextAlign,
    UseHeaderColor: Boolean,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkLabel = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], BorderStyle = BorderStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], UseHeaderColor = UseHeaderColor.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkLabel_typekey")(OutlookDotOlkLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkLabel]
  }
}

