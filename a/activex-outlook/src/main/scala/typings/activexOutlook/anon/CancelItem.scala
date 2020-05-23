package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelItem extends js.Object {
  var Cancel: Boolean
  val Item: js.Any
}

object CancelItem {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any): CancelItem = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelItem]
  }
}

