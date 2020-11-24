package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typings.activexIwshruntimelibrary.ScriptSigner.Signer
import typings.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends js.Object {
  
  @JSName("Scripting.Signer")
  var ScriptingDotSigner: Signer = js.native
  
  var WSHController: typings.activexIwshruntimelibrary.WSHControllerLibrary.WSHController = js.native
  
  @JSName("WScript.Network")
  var WScriptDotNetwork: WshNetwork = js.native
  
  @JSName("WScript.Shell")
  var WScriptDotShell: WshShell = js.native
}
object ActiveXObjectNameMap {
  
  @scala.inline
  def apply(
    ScriptingDotSigner: Signer,
    WSHController: WSHController,
    WScriptDotNetwork: WshNetwork,
    WScriptDotShell: WshShell
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(WSHController = WSHController.asInstanceOf[js.Any])
    __obj.updateDynamic("Scripting.Signer")(ScriptingDotSigner.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Network")(WScriptDotNetwork.asInstanceOf[js.Any])
    __obj.updateDynamic("WScript.Shell")(WScriptDotShell.asInstanceOf[js.Any])
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
    def setScriptingDotSigner(value: Signer): Self = this.set("Scripting.Signer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWSHController(value: WSHController): Self = this.set("WSHController", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWScriptDotNetwork(value: WshNetwork): Self = this.set("WScript.Network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWScriptDotShell(value: WshShell): Self = this.set("WScript.Shell", value.asInstanceOf[js.Any])
  }
}
