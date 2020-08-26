package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.OLE_COLOR
import typings.activexStdole.stdole.StdFont
import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkOptionButton extends js.Object {
  var Accelerator: String = js.native
  var Alignment: OlAlignment = js.native
  var BackColor: OLE_COLOR = js.native
  var BackStyle: OlBackStyle = js.native
  var Caption: String = js.native
  var Enabled: Boolean = js.native
  val Font: StdFont = js.native
  var ForeColor: OLE_COLOR = js.native
  var GroupName: String = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkOptionButton_typekey")
  var OutlookDotOlkOptionButton_typekey: OlkOptionButton = js.native
  var Value: js.Any = js.native
  var WordWrap: Boolean = js.native
}

object OlkOptionButton {
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
    GroupName: String,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkOptionButton_typekey: OlkOptionButton,
    Value: js.Any,
    WordWrap: Boolean
  ): OlkOptionButton = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Alignment = Alignment.asInstanceOf[js.Any], BackColor = BackColor.asInstanceOf[js.Any], BackStyle = BackStyle.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], WordWrap = WordWrap.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkOptionButton_typekey")(OutlookDotOlkOptionButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkOptionButton]
  }
  @scala.inline
  implicit class OlkOptionButtonOps[Self <: OlkOptionButton] (val x: Self) extends AnyVal {
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
    def setAlignment(value: OlAlignment): Self = this.set("Alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackColor(value: OLE_COLOR): Self = this.set("BackColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackStyle(value: OlBackStyle): Self = this.set("BackStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: StdFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setForeColor(value: OLE_COLOR): Self = this.set("ForeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotOlkOptionButton_typekey(value: OlkOptionButton): Self = this.set("Outlook.OlkOptionButton_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordWrap(value: Boolean): Self = this.set("WordWrap", value.asInstanceOf[js.Any])
  }
  
}

