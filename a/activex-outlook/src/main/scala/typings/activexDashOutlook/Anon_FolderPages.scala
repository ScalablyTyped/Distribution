package typings.activexDashOutlook

import typings.activexDashOutlook.Outlook.Folder
import typings.activexDashOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FolderPages extends js.Object {
  val Folder: typings.activexDashOutlook.Outlook.Folder
  val Pages: PropertyPages
}

object Anon_FolderPages {
  @scala.inline
  def apply(Folder: Folder, Pages: PropertyPages): Anon_FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder, Pages = Pages)
  
    __obj.asInstanceOf[Anon_FolderPages]
  }
}

