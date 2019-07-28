package typings.activexDashOutlook

import typings.activexDashOutlook.OutlookNs.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelStore extends js.Object {
  var Cancel: Boolean
  val Store: typings.activexDashOutlook.OutlookNs.Store
}

object Anon_CancelStore {
  @scala.inline
  def apply(Cancel: Boolean, Store: Store): Anon_CancelStore = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, Store = Store)
  
    __obj.asInstanceOf[Anon_CancelStore]
  }
}

