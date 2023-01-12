package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig to update.
    */
  var AppImageConfigName: typings.awsSdk.clientsSagemakerMod.AppImageConfigName
  
  /**
    * The new KernelGateway app to run on the image.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KernelGatewayImageConfig] = js.undefined
}
object UpdateAppImageConfigRequest {
  
  inline def apply(AppImageConfigName: AppImageConfigName): UpdateAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAppImageConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAppImageConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
  }
}
