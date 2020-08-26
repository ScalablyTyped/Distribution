package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkSenderPhoto extends js.Object {
  var Enabled: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkSenderPhoto_typekey")
  var OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto = js.native
  val PreferredHeight: Double = js.native
  val PreferredWidth: Double = js.native
}

object OlkSenderPhoto {
  @scala.inline
  def apply(
    Enabled: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto,
    PreferredHeight: Double,
    PreferredWidth: Double
  ): OlkSenderPhoto = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], PreferredHeight = PreferredHeight.asInstanceOf[js.Any], PreferredWidth = PreferredWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkSenderPhoto_typekey")(OutlookDotOlkSenderPhoto_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkSenderPhoto]
  }
  @scala.inline
  implicit class OlkSenderPhotoOps[Self <: OlkSenderPhoto] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setMouseIcon(value: StdPicture): Self = this.set("MouseIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setMousePointer(value: OlMousePointer): Self = this.set("MousePointer", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotOlkSenderPhoto_typekey(value: OlkSenderPhoto): Self = this.set("Outlook.OlkSenderPhoto_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredHeight(value: Double): Self = this.set("PreferredHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreferredWidth(value: Double): Self = this.set("PreferredWidth", value.asInstanceOf[js.Any])
  }
  
}

