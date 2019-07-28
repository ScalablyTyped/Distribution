package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBarShortcut extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Shortcut: OutlookBarShortcut
}

object Anon_CommandBarShortcut {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: OutlookBarShortcut
  ): Anon_CommandBarShortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar, Shortcut = Shortcut)
  
    __obj.asInstanceOf[Anon_CommandBarShortcut]
  }
}

