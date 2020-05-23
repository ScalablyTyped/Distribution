package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkCheckBox extends js.Object {
  var Accelerator: String
  var Alignment: OlAlignment
  var BackColor: OLE_COLOR
  var BackStyle: OlBackStyle
  var Caption: String
  var Enabled: Boolean
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkCheckBox_typekey")
  var OutlookDotOlkCheckBox_typekey: OlkCheckBox
  var TripleState: Boolean
  var Value: js.Any
  var WordWrap: Boolean
}

object OlkCheckBox {
  @scala.inline
  def apply(
    Accelerator: String,
    Alignment: OlAlignment,
    BackColor: OLE_COLOR,
    BackStyle: OlBackStyle,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCheckBox_typekey: OlkCheckBox,
    TripleState: Boolean,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkCheckBox = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], TripleState = TripleState.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCheckBox_typekey")(OutlookDotOlkCheckBox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCheckBox]
  }
}

