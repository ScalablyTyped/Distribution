package typings
package activexDashOutlookLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBar extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Folder: activexDashOutlookLib.OutlookNs.Folder
}

object Anon_CommandBar {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Folder: activexDashOutlookLib.OutlookNs.Folder
  ): Anon_CommandBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CommandBar")(CommandBar)
    __obj.updateDynamic("Folder")(Folder)
    __obj.asInstanceOf[Anon_CommandBar]
  }
}

