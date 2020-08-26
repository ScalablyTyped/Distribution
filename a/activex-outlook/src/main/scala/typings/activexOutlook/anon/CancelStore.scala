package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelStore extends js.Object {
  var Cancel: Boolean = js.native
  val Store: typings.activexOutlook.Outlook.Store = js.native
}

object CancelStore {
  @scala.inline
  def apply(Cancel: Boolean, Store: typings.activexOutlook.Outlook.Store): CancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStore]
  }
  @scala.inline
  implicit class CancelStoreOps[Self <: CancelStore] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: typings.activexOutlook.Outlook.Store): Self = this.set("Store", value.asInstanceOf[js.Any])
  }
  
}

