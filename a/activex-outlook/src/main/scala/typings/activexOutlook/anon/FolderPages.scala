package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.PropertyPages
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderPages extends StObject {
  
  val Folder: typings.activexOutlook.Outlook.Folder
  
  val Pages: PropertyPages
}
object FolderPages {
  
  inline def apply(Folder: typings.activexOutlook.Outlook.Folder, Pages: PropertyPages): FolderPages = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any], Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderPages]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderPages] (val x: Self) extends AnyVal {
    
    inline def setFolder(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
    
    inline def setPages(value: PropertyPages): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
  }
}
