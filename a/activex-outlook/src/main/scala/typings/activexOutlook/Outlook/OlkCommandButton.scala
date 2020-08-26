package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkCommandButton extends js.Object {
  var Accelerator: String = js.native
  var AutoSize: Boolean = js.native
  var Caption: String = js.native
  var DisplayDropArrow: Boolean = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkCommandButton_typekey")
  var OutlookDotOlkCommandButton_typekey: OlkCommandButton = js.native
  var Picture: StdPicture = js.native
  var PictureAlignment: OlPictureAlignment = js.native
  var TextAlign: OlTextAlign = js.native
  var WordWrap: Boolean = js.native
}

object OlkCommandButton {
  @scala.inline
  def apply(
    Accelerator: String,
    AutoSize: Boolean,
    Caption: String,
    DisplayDropArrow: Boolean,
    Enabled: Boolean,
    Font: StdFont,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkCommandButton_typekey: OlkCommandButton,
    Picture: StdPicture,
    PictureAlignment: OlPictureAlignment,
    TextAlign: OlTextAlign,
    WordWrap: Boolean
  ): OlkCommandButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], AutoSize = AutoSize.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], DisplayDropArrow = DisplayDropArrow.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Picture = Picture.asInstanceOf[js.Any], PictureAlignment = PictureAlignment.asInstanceOf[js.Any], TextAlign = TextAlign.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkCommandButton_typekey")(OutlookDotOlkCommandButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkCommandButton]
  }
  @scala.inline
  implicit class OlkCommandButtonOps[Self <: OlkCommandButton] (val x: Self) extends AnyVal {
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
    def setAccelerator(value: String): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoSize(value: Boolean): Self = this.set("AutoSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayDropArrow(value: Boolean): Self = this.set("DisplayDropArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: StdFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotOlkCommandButton_typekey(value: OlkCommandButton): Self = this.set("Outlook.OlkCommandButton_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPicture(value: StdPicture): Self = this.set("Picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setPictureAlignment(value: OlPictureAlignment): Self = this.set("PictureAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextAlign(value: OlTextAlign): Self = this.set("TextAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

