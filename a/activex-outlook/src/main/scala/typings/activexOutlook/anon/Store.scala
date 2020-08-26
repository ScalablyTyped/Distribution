package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  val CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any = js.native
  val Store: typings.activexOutlook.Outlook.Store = js.native
}

object Store {
  @scala.inline
  def apply(
    CommandBar: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Office.CommandBar */ js.Any,
    Store: typings.activexOutlook.Outlook.Store
  ): Store = {
    val __obj = js.Dynamic.literal(CommandBar = CommandBar.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setStore(value: typings.activexOutlook.Outlook.Store): Self = this.set("Store", value.asInstanceOf[js.Any])
  }
  
}

