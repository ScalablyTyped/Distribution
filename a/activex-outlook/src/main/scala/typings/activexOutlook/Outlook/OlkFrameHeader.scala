package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkFrameHeader extends js.Object {
  var Alignment: OlAlignment = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkFrameHeader_typekey")
  var OutlookDotOlkFrameHeader_typekey: OlkFrameHeader = js.native
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
  @scala.inline
  implicit class OlkFrameHeaderOps[Self <: OlkFrameHeader] (val x: Self) extends AnyVal {
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
    def setAlignment(value: OlAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: StdFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotOlkFrameHeader_typekey(value: OlkFrameHeader): Self = this.set("Outlook.OlkFrameHeader_typekey", value.asInstanceOf[js.Any])
  }
  
}

