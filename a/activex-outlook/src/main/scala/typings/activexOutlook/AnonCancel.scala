package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var Cancel: Boolean
  val FolderToShare: Folder
}

object AnonCancel {
  @scala.inline
  def apply(Cancel: Boolean, FolderToShare: Folder): AnonCancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FolderToShare = FolderToShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

