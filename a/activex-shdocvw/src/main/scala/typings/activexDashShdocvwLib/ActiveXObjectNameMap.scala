package typings
package activexDashShdocvwLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `InternetExplorer.Application`: activexDashShdocvwLib.SHDocVwNs.InternetExplorer
  var `Shell.Explorer`: activexDashShdocvwLib.SHDocVwNs.WebBrowser
  var `Shell.UIHelper`: activexDashShdocvwLib.SHDocVwNs.ShellUIHelper
  var `ShellNameSpace.ShellNameSpace`: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `InternetExplorer.Application`: activexDashShdocvwLib.SHDocVwNs.InternetExplorer,
    `Shell.Explorer`: activexDashShdocvwLib.SHDocVwNs.WebBrowser,
    `Shell.UIHelper`: activexDashShdocvwLib.SHDocVwNs.ShellUIHelper,
    `ShellNameSpace.ShellNameSpace`: activexDashShdocvwLib.SHDocVwNs.ShellNameSpace
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InternetExplorer.Application")(`InternetExplorer.Application`)
    __obj.updateDynamic("Shell.Explorer")(`Shell.Explorer`)
    __obj.updateDynamic("Shell.UIHelper")(`Shell.UIHelper`)
    __obj.updateDynamic("ShellNameSpace.ShellNameSpace")(`ShellNameSpace.ShellNameSpace`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

