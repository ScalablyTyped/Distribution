package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveTo extends js.Object {
  var Cancel: Boolean
  val MoveTo: typings.activexOutlook.Outlook.Folder
}

object MoveTo {
  @scala.inline
  def apply(Cancel: Boolean, MoveTo: typings.activexOutlook.Outlook.Folder): MoveTo = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], MoveTo = MoveTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveTo]
  }
}

