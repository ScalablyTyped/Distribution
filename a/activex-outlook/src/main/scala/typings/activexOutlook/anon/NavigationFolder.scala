package typings.activexOutlook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationFolder extends js.Object {
  
  val NavigationFolder: typings.activexOutlook.Outlook.NavigationFolder = js.native
}
object NavigationFolder {
  
  @scala.inline
  def apply(NavigationFolder: typings.activexOutlook.Outlook.NavigationFolder): NavigationFolder = {
    val __obj = js.Dynamic.literal(NavigationFolder = NavigationFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFolder]
  }
  
  @scala.inline
  implicit class NavigationFolderOps[Self <: NavigationFolder] (val x: Self) extends AnyVal {
    
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
    def setNavigationFolder(value: typings.activexOutlook.Outlook.NavigationFolder): Self = this.set("NavigationFolder", value.asInstanceOf[js.Any])
  }
}
