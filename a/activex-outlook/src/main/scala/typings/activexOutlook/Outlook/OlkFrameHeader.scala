package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkFrameHeader extends js.Object {
  var Alignment: OlAlignment
  var Caption: String
  var Enabled: Boolean
  val Font: StdFont
  var ForeColor: OLE_COLOR
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: OlkFrameHeader
}

object OlkFrameHeader {
  @scala.inline
  def apply(
    Alignment: OlAlignment,
    Caption: String,
    Enabled: Boolean,
    Font: StdFont,
    ForeColor: OLE_COLOR,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkFrameHeader_typekey: OlkFrameHeader
  ): OlkFrameHeader = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkFrameHeader_typekey")(OutlookDotOlkFrameHeader_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkFrameHeader]
  }
}

