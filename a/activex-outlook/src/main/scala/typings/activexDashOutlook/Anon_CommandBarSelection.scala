package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommandBarSelection extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Selection: typings.activexDashOutlook.Outlook.Selection
}

object Anon_CommandBarSelection {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Selection: Selection
  ): Anon_CommandBarSelection = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CommandBarSelection]
  }
}

