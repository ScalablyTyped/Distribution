package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpaceSettings extends StObject {
  
  var JupyterServerAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.JupyterServerAppSettings] = js.undefined
  
  var KernelGatewayAppSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KernelGatewayAppSettings] = js.undefined
}
object SpaceSettings {
  
  inline def apply(): SpaceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpaceSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpaceSettings] (val x: Self) extends AnyVal {
    
    inline def setJupyterServerAppSettings(value: JupyterServerAppSettings): Self = StObject.set(x, "JupyterServerAppSettings", value.asInstanceOf[js.Any])
    
    inline def setJupyterServerAppSettingsUndefined: Self = StObject.set(x, "JupyterServerAppSettings", js.undefined)
    
    inline def setKernelGatewayAppSettings(value: KernelGatewayAppSettings): Self = StObject.set(x, "KernelGatewayAppSettings", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayAppSettingsUndefined: Self = StObject.set(x, "KernelGatewayAppSettings", js.undefined)
  }
}
