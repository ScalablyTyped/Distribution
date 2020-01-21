package typings.activexOutlook

import typings.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommandBarShortcut extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Shortcut: OutlookBarShortcut
}

object AnonCommandBarShortcut {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: OutlookBarShortcut
  ): AnonCommandBarShortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommandBarShortcut]
  }
}

