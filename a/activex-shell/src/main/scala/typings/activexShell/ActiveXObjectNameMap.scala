package typings.activexShell

import typings.activexShell.Shell32.Shell
import typings.activexShell.Shell32.ShellFolderViewOC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Shell.Application")
  var ShellDotApplication: Shell
  
  @JSName("Shell.FolderView")
  var ShellDotFolderView: ShellFolderViewOC
}
object ActiveXObjectNameMap {
  
  inline def apply(ShellDotApplication: Shell, ShellDotFolderView: ShellFolderViewOC): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Shell.Application")(ShellDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.FolderView")(ShellDotFolderView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setShellDotApplication(value: Shell): Self = StObject.set(x, "Shell.Application", value.asInstanceOf[js.Any])
    
    inline def setShellDotFolderView(value: ShellFolderViewOC): Self = StObject.set(x, "Shell.FolderView", value.asInstanceOf[js.Any])
  }
}
