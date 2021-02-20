package typings.activexShell

import typings.activexShell.Shell32.Shell
import typings.activexShell.Shell32.ShellFolderViewOC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Shell.Application")
  var ShellDotApplication: Shell = js.native
  
  @JSName("Shell.FolderView")
  var ShellDotFolderView: ShellFolderViewOC = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(ShellDotApplication: Shell, ShellDotFolderView: ShellFolderViewOC): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(ShellDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.FolderView")(ShellDotFolderView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShellDotApplication(value: Shell): Self = StObject.set(x, "Shell.Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellDotFolderView(value: ShellFolderViewOC): Self = StObject.set(x, "Shell.FolderView", value.asInstanceOf[js.Any])
  }
}
