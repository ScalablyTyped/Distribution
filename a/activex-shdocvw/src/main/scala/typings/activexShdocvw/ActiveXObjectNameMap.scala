package typings.activexShdocvw

import typings.activexShdocvw.SHDocVw.InternetExplorer
import typings.activexShdocvw.SHDocVw.ShellNameSpace
import typings.activexShdocvw.SHDocVw.ShellUIHelper
import typings.activexShdocvw.SHDocVw.WebBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("InternetExplorer.Application")
  var InternetExplorerDotApplication: InternetExplorer = js.native
  @JSName("Shell.Explorer")
  var ShellDotExplorer: WebBrowser = js.native
  @JSName("Shell.UIHelper")
  var ShellDotUIHelper: ShellUIHelper = js.native
  @JSName("ShellNameSpace.ShellNameSpace")
  var ShellNameSpaceDotShellNameSpace: ShellNameSpace = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
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
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
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
    def setInternetExplorerDotApplication(value: InternetExplorer): Self = this.set("InternetExplorer.Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setShellDotExplorer(value: WebBrowser): Self = this.set("Shell.Explorer", value.asInstanceOf[js.Any])
    @scala.inline
    def setShellDotUIHelper(value: ShellUIHelper): Self = this.set("Shell.UIHelper", value.asInstanceOf[js.Any])
    @scala.inline
    def setShellNameSpaceDotShellNameSpace(value: ShellNameSpace): Self = this.set("ShellNameSpace.ShellNameSpace", value.asInstanceOf[js.Any])
  }
  
}

