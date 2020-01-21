package typings.activexOutlook

import typings.activexOutlook.Outlook.Store
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStore extends js.Object {
  val Store: typings.activexOutlook.Outlook.Store
}

object AnonStore {
  @scala.inline
  def apply(Store: Store): AnonStore = {
    val __obj = js.Dynamic.literal(Store = Store.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonStore]
  }
}

