package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkContactPhoto extends js.Object {
  var Enabled: Boolean
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkContactPhoto_typekey")
  var OutlookDotOlkContactPhoto_typekey: OlkContactPhoto
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
}

