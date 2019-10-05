package typings.activexDashIwshruntimelibrary

import typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typings.activexDashIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typings.activexDashIwshruntimelibrary.ScriptSigner.Signer
import typings.activexDashIwshruntimelibrary.WSHControllerLibrary.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `Scripting.Signer`: Signer
  var WSHController: typings.activexDashIwshruntimelibrary.WSHControllerLibrary.WSHController
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

