package typings.activexOutlook

import typings.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelShortcut extends js.Object {
  var Cancel: Boolean
  val Shortcut: OutlookBarShortcut
}

object AnonCancelShortcut {
  @scala.inline
  def apply(Cancel: Boolean, Shortcut: OutlookBarShortcut): AnonCancelShortcut = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelShortcut]
  }
}

