package typings.activexShdocvw

import typings.activexShdocvw.SHDocVw.InternetExplorer
import typings.activexShdocvw.SHDocVw.ShellNameSpace
import typings.activexShdocvw.SHDocVw.ShellUIHelper
import typings.activexShdocvw.SHDocVw.WebBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("InternetExplorer.Application")
  var InternetExplorerDotApplication: InternetExplorer
  
  @JSName("Shell.Explorer")
  var ShellDotExplorer: WebBrowser
  
  @JSName("Shell.UIHelper")
  var ShellDotUIHelper: ShellUIHelper
  
  @JSName("ShellNameSpace.ShellNameSpace")
  var ShellNameSpaceDotShellNameSpace: ShellNameSpace
}
object ActiveXObjectNameMap {
  
  inline def apply(
    InternetExplorerDotApplication: InternetExplorer,
    ShellDotExplorer: WebBrowser,
    ShellDotUIHelper: ShellUIHelper,
    ShellNameSpaceDotShellNameSpace: ShellNameSpace
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InternetExplorer.Application")(InternetExplorerDotApplication.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.Explorer")(ShellDotExplorer.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.UIHelper")(ShellDotUIHelper.asInstanceOf[js.Any])
    __obj.updateDynamic("ShellNameSpace.ShellNameSpace")(ShellNameSpaceDotShellNameSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    inline def setInternetExplorerDotApplication(value: InternetExplorer): Self = StObject.set(x, "InternetExplorer.Application", value.asInstanceOf[js.Any])
    
    inline def setShellDotExplorer(value: WebBrowser): Self = StObject.set(x, "Shell.Explorer", value.asInstanceOf[js.Any])
    
    inline def setShellDotUIHelper(value: ShellUIHelper): Self = StObject.set(x, "Shell.UIHelper", value.asInstanceOf[js.Any])
    
    inline def setShellNameSpaceDotShellNameSpace(value: ShellNameSpace): Self = StObject.set(x, "ShellNameSpace.ShellNameSpace", value.asInstanceOf[js.Any])
  }
}
