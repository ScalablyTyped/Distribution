package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelMoveTo extends js.Object {
  var Cancel: Boolean
  val MoveTo: Folder
}

object AnonCancelMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, MoveTo: Folder): AnonCancelMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCancelMoveTo]
  }
}

