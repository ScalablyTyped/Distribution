package typings
package activexDashIwshruntimelibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Scripting.Signer`: activexDashIwshruntimelibraryLib.ScriptSignerNs.Signer
  var WSHController: activexDashIwshruntimelibraryLib.WSHControllerLibraryNs.WSHController
  var `WScript.Network`: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshNetwork
  var `WScript.Shell`: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshShell
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Scripting.Signer`: activexDashIwshruntimelibraryLib.ScriptSignerNs.Signer,
    WSHController: activexDashIwshruntimelibraryLib.WSHControllerLibraryNs.WSHController,
    `WScript.Network`: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshNetwork,
    `WScript.Shell`: activexDashIwshruntimelibraryLib.IWshRuntimeLibraryNs.WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(`Scripting.Signer` = `Scripting.Signer`, `WScript.Network` = `WScript.Network`, `WScript.Shell` = `WScript.Shell`)
    __obj.updateDynamic("WSHController")(WSHController)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

