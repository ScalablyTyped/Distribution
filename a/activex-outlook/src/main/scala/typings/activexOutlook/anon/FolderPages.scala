package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderPages extends StObject {
  
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
  implicit class FolderPagesMutableBuilder[Self <: FolderPages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPages(value: PropertyPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
  }
}
