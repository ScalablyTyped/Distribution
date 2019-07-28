package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBarSelection extends js.Object {
  val CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Selection: typings.activexDashOutlook.OutlookNs.Selection
}

object Anon_CommandBarSelection {
  @scala.inline
  def apply(
    CommandBar: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Selection: Selection
  ): Anon_CommandBarSelection = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar, Selection = Selection)
  
    __obj.asInstanceOf[Anon_CommandBarSelection]
  }
}

