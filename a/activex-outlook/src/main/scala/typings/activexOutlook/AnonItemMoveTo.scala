package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemMoveTo extends js.Object {
  var Cancel: Boolean
  val Item: js.Any
  val MoveTo: Folder
}

object AnonItemMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, Item: js.Any, MoveTo: Folder): AnonItemMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemMoveTo]
  }
}

