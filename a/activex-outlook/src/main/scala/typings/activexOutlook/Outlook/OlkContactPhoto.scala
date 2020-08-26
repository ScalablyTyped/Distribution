package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OlkContactPhoto extends js.Object {
  var Enabled: Boolean = js.native
  var MouseIcon: StdPicture = js.native
  var MousePointer: OlMousePointer = js.native
  @JSName("Outlook.OlkContactPhoto_typekey")
  var OutlookDotOlkContactPhoto_typekey: OlkContactPhoto = js.native
}

object OlkContactPhoto {
  @scala.inline
  def apply(
    Enabled: Boolean,
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkContactPhoto_typekey: OlkContactPhoto
  ): OlkContactPhoto = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkContactPhoto_typekey")(OutlookDotOlkContactPhoto_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkContactPhoto]
  }
  @scala.inline
  implicit class OlkContactPhotoOps[Self <: OlkContactPhoto] (val x: Self) extends AnyVal {
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
    def setOutlookDotOlkContactPhoto_typekey(value: OlkContactPhoto): Self = this.set("Outlook.OlkContactPhoto_typekey", value.asInstanceOf[js.Any])
  }
  
}

