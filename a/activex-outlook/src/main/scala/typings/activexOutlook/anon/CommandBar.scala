package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBar extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
  val Folder: typings.activexOutlook.Outlook.Folder
}

object CommandBar {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Folder: typings.activexOutlook.Outlook.Folder
  ): CommandBar = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Folder = Folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandBar]
  }
}

