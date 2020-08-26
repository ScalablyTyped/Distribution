package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OutlookBarShortcut
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcut extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  val Shortcut: OutlookBarShortcut = js.native
}

object Shortcut {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Shortcut: OutlookBarShortcut
  ): Shortcut = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Shortcut = Shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcut]
  }
  @scala.inline
  implicit class ShortcutOps[Self <: Shortcut] (val x: Self) extends AnyVal {
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
    def setShortcut(value: OutlookBarShortcut): Self = this.set("Shortcut", value.asInstanceOf[js.Any])
  }
  
}

