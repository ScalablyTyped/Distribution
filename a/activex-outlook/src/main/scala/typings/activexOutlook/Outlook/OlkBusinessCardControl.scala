package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkBusinessCardControl extends js.Object {
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkBusinessCardControl_typekey")
  var OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl
}

object OlkBusinessCardControl {
  @scala.inline
  def apply(
    MouseIcon: StdPicture,
    MousePointer: OlMousePointer,
    OutlookDotOlkBusinessCardControl_typekey: OlkBusinessCardControl
  ): OlkBusinessCardControl = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkBusinessCardControl_typekey")(OutlookDotOlkBusinessCardControl_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkBusinessCardControl]
  }
}

