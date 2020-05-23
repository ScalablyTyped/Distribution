package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkSenderPhoto extends js.Object {
  var Enabled: Boolean
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkSenderPhoto_typekey")
  var OutlookDotOlkSenderPhoto_typekey: OlkSenderPhoto
  val PreferredHeight: Double
  val PreferredWidth: Double
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
}

