package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelShortcut extends js.Object {
  var Cancel: Boolean
  val Shortcut: OutlookBarShortcut
}

object Anon_CancelShortcut {
  @scala.inline
  def apply(Cancel: Boolean, Shortcut: OutlookBarShortcut): Anon_CancelShortcut = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelShortcut]
  }
}

