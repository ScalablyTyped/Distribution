package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Folder extends StObject {
  
  val Folder: typings.activexOutlook.Outlook.Folder
}
object Folder {
  
  @scala.inline
  def apply(Folder: typings.activexOutlook.Outlook.Folder): Folder = {
    val __obj = js.Dynamic.literal(Folder = Folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[Folder]
  }
  
  @scala.inline
  implicit class FolderMutableBuilder[Self <: Folder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFolder(value: typings.activexOutlook.Outlook.Folder): Self = StObject.set(x, "Folder", value.asInstanceOf[js.Any])
  }
}
