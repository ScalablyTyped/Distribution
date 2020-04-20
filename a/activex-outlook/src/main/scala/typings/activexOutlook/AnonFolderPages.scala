package typings.activexOutlook

import typings.activexOutlook.Outlook.Folder
import typings.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFolderPages extends js.Object {
  val Folder: typings.activexOutlook.Outlook.Folder
  val Pages: PropertyPages
}

object AnonFolderPages {
  @scala.inline
  def apply(Folder: Folder, Pages: PropertyPages): AnonFolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFolderPages]
  }
}

