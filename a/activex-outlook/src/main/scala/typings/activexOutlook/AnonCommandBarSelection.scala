package typings.activexOutlook

import typings.activexOutlook.Outlook.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommandBarSelection extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Selection: typings.activexOutlook.Outlook.Selection
}

object AnonCommandBarSelection {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Selection: Selection
  ): AnonCommandBarSelection = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCommandBarSelection]
  }
}

