package typings.activexOutlook

import typings.activexOutlook.Outlook.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonView extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val View: typings.activexOutlook.Outlook.View
}

object AnonView {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    View: View
  ): AnonView = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonView]
  }
}

