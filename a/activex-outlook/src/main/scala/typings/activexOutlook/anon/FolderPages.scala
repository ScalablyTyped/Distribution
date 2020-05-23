package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FolderPages extends js.Object {
  val Folder: typings.activexOutlook.Outlook.Folder
  val Pages: PropertyPages
}

object FolderPages {
  @scala.inline
  def apply(Folder: typings.activexOutlook.Outlook.Folder, Pages: PropertyPages): FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPages]
  }
}

