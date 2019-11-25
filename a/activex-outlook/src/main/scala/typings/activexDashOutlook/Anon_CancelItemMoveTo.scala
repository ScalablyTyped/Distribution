package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelItemMoveTo extends js.Object {
  var Cancel: Boolean
  val Item: js.Any
  val MoveTo: Folder
}

object Anon_CancelItemMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: Folder): Anon_CancelItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelItemMoveTo]
  }
}

