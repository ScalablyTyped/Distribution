package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelStore extends js.Object {
  var Cancel: Boolean
  val Store: typings.activexOutlook.Outlook.Store
}

object CancelStore {
  @scala.inline
  def apply(Cancel: Boolean, Store: typings.activexOutlook.Outlook.Store): CancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Store = Store.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelStore]
  }
}

