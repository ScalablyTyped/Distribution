package typings.activexOutlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelItem extends js.Object {
  var Cancel: Boolean
  val Item: js.Any
}

object AnonCancelItem {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any): AnonCancelItem = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelItem]
  }
}

