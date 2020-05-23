package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelShortcut extends js.Object {
  var Cancel: Boolean
  val Shortcut: OutlookBarShortcut
}

object CancelShortcut {
  @scala.inline
  def apply(Cancel: Boolean, Shortcut: OutlookBarShortcut): CancelShortcut = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelShortcut]
  }
}

