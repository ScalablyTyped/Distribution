package typings.activexIwshruntimelibrary

import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshNetwork
import typings.activexIwshruntimelibrary.IWshRuntimeLibrary.WshShell
import typings.activexIwshruntimelibrary.ScriptSigner.Signer
import typings.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveXObjectNameMap extends StObject {
  
  @JSName("Scripting.Signer")
  var ScriptingDotSigner: Signer
  
  var WSHController: typings.activexIwshruntimelibrary.WSHControllerLibrary.WSHController
  
  @JSName("WScript.Network")
  var WScriptDotNetwork: WshNetwork
  
  @JSName("WScript.Shell")
  var WScriptDotShell: WshShell
}
object ActiveXObjectNameMap {
  
  inline def apply(
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
  
  extension [Self <: ActiveXObjectNameMap](x: Self) {
    
    inline def setScriptingDotSigner(value: Signer): Self = StObject.set(x, "Scripting.Signer", value.asInstanceOf[js.Any])
    
    inline def setWSHController(value: WSHController): Self = StObject.set(x, "WSHController", value.asInstanceOf[js.Any])
    
    inline def setWScriptDotNetwork(value: WshNetwork): Self = StObject.set(x, "WScript.Network", value.asInstanceOf[js.Any])
    
    inline def setWScriptDotShell(value: WshShell): Self = StObject.set(x, "WScript.Shell", value.asInstanceOf[js.Any])
  }
}
