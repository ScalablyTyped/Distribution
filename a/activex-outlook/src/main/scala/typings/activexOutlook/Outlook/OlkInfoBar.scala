package typings.activexOutlook.Outlook

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OlkInfoBar extends js.Object {
  var MouseIcon: StdPicture
  var MousePointer: OlMousePointer
  @JSName("Outlook.OlkInfoBar_typekey")
  var OutlookDotOlkInfoBar_typekey: OlkInfoBar
}

object OlkInfoBar {
  @scala.inline
  def apply(MouseIcon: StdPicture, MousePointer: OlMousePointer, OutlookDotOlkInfoBar_typekey: OlkInfoBar): OlkInfoBar = {
    val __obj = js.Dynamic.literal(MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OlkInfoBar_typekey")(OutlookDotOlkInfoBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OlkInfoBar]
  }
}

