package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Folder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var Cancel: Boolean
  val FolderToShare: Folder
}

object Anon_Cancel {
  @scala.inline
  def apply(Cancel: Boolean, FolderToShare: Folder): Anon_Cancel = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, FolderToShare = FolderToShare)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

