package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBarShortcut extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Shortcut: activexDashOutlookLib.OutlookNs.OutlookBarShortcut
}

object Anon_CommandBarShortcut {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: activexDashOutlookLib.OutlookNs.OutlookBarShortcut
  ): Anon_CommandBarShortcut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CommandBar")(CommandBar)
    __obj.updateDynamic("Shortcut")(Shortcut)
    __obj.asInstanceOf[Anon_CommandBarShortcut]
  }
}

