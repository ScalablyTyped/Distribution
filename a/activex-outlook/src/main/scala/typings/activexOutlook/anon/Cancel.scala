package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var Cancel: Boolean
  val FolderToShare: typings.activexOutlook.Outlook.Folder
}

object Cancel {
  @scala.inline
  def apply(Cancel: Boolean, FolderToShare: typings.activexOutlook.Outlook.Folder): Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FolderToShare = FolderToShare.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

