package typings.activexDashShdocvw

import typings.activexDashShdocvw.SHDocVwNs.InternetExplorer
import typings.activexDashShdocvw.SHDocVwNs.ShellNameSpace
import typings.activexDashShdocvw.SHDocVwNs.ShellUIHelper
import typings.activexDashShdocvw.SHDocVwNs.WebBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `InternetExplorer.Application`: InternetExplorer
  var `Shell.Explorer`: WebBrowser
  var `Shell.UIHelper`: ShellUIHelper
  var `ShellNameSpace.ShellNameSpace`: ShellNameSpace
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `InternetExplorer.Application`: InternetExplorer,
    `Shell.Explorer`: WebBrowser,
    `Shell.UIHelper`: ShellUIHelper,
    `ShellNameSpace.ShellNameSpace`: ShellNameSpace
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InternetExplorer.Application")(`InternetExplorer.Application`)
    __obj.updateDynamic("Shell.Explorer")(`Shell.Explorer`)
    __obj.updateDynamic("Shell.UIHelper")(`Shell.UIHelper`)
    __obj.updateDynamic("ShellNameSpace.ShellNameSpace")(`ShellNameSpace.ShellNameSpace`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

