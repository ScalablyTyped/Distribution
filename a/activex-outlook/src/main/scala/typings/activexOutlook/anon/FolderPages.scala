package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderPages extends js.Object {
  
  val Folder: typings.activexOutlook.Outlook.Folder = js.native
  
  val Pages: PropertyPages = js.native
}
object FolderPages {
  
  @scala.inline
  def apply(Folder: typings.activexOutlook.Outlook.Folder, Pages: PropertyPages): FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPages]
  }
  
  @scala.inline
  implicit class FolderPagesOps[Self <: FolderPages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFolder(value: typings.activexOutlook.Outlook.Folder): Self = this.set("Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: PropertyPages): Self = this.set("Pages", value.asInstanceOf[js.Any])
  }
}
