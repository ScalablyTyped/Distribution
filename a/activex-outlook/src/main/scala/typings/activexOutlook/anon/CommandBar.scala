package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandBar extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  val Folder: typings.activexOutlook.Outlook.Folder = js.native
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
  @scala.inline
  implicit class CommandBarOps[Self <: CommandBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommandBar(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any
    ): Self = this.set("CommandBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: typings.activexOutlook.Outlook.Folder): Self = this.set("Folder", value.asInstanceOf[js.Any])
  }
  
}

