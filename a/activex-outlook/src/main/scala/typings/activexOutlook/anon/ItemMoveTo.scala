package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemMoveTo extends js.Object {
  var Cancel: Boolean
  val Item: js.Any
  val MoveTo: typings.activexOutlook.Outlook.Folder
}

object ItemMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: typings.activexOutlook.Outlook.Folder): ItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMoveTo]
  }
}

