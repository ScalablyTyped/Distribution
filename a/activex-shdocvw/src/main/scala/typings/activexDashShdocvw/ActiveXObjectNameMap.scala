package typings.activexDashShdocvw

import typings.activexDashShdocvw.SHDocVw.InternetExplorer
import typings.activexDashShdocvw.SHDocVw.ShellNameSpace
import typings.activexDashShdocvw.SHDocVw.ShellUIHelper
import typings.activexDashShdocvw.SHDocVw.WebBrowser
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
    __obj.updateDynamic("InternetExplorer.Application")(`InternetExplorer.Application`.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.Explorer")(`Shell.Explorer`.asInstanceOf[js.Any])
    __obj.updateDynamic("Shell.UIHelper")(`Shell.UIHelper`.asInstanceOf[js.Any])
    __obj.updateDynamic("ShellNameSpace.ShellNameSpace")(`ShellNameSpace.ShellNameSpace`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

