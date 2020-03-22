package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMoveTo extends js.Object {
  var Cancel: Boolean
  val MoveTo: Folder
}

object AnonMoveTo {
  @scala.inline
  def apply(Cancel: Boolean, MoveTo: Folder): AnonMoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMoveTo]
  }
}

