package typings.activexDashIwshruntimelibrary

import typings.activexDashIwshruntimelibrary.IWshRuntimeLibraryNs.WshNetwork
import typings.activexDashIwshruntimelibrary.IWshRuntimeLibraryNs.WshShell
import typings.activexDashIwshruntimelibrary.ScriptSignerNs.Signer
import typings.activexDashIwshruntimelibrary.WSHControllerLibraryNs.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Scripting.Signer`: Signer
  var WSHController: typings.activexDashIwshruntimelibrary.WSHControllerLibraryNs.WSHController
  var `WScript.Network`: WshNetwork
  var `WScript.Shell`: WshShell
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `Scripting.Signer`: Signer,
    WSHController: WSHController,
    `WScript.Network`: WshNetwork,
    `WScript.Shell`: WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(WSHController = WSHController)
    __obj.updateDynamic("Scripting.Signer")(`Scripting.Signer`)
    __obj.updateDynamic("WScript.Network")(`WScript.Network`)
    __obj.updateDynamic("WScript.Shell")(`WScript.Shell`)
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

