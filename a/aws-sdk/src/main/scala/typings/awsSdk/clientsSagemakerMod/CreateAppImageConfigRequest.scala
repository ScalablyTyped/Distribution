package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig. Must be unique to your account.
    */
  var AppImageConfigName: typings.awsSdk.clientsSagemakerMod.AppImageConfigName
  
  /**
    * The KernelGatewayImageConfig. You can only specify one image kernel in the AppImageConfig API. This kernel will be shown to users before the image starts. Once the image runs, all kernels are visible in JupyterLab.
    */
  var KernelGatewayImageConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KernelGatewayImageConfig] = js.undefined
  
  /**
    * A list of tags to apply to the AppImageConfig.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateAppImageConfigRequest {
  
  inline def apply(AppImageConfigName: AppImageConfigName): CreateAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppImageConfigRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAppImageConfigRequest] (val x: Self) extends AnyVal {
    
    inline def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfig(value: KernelGatewayImageConfig): Self = StObject.set(x, "KernelGatewayImageConfig", value.asInstanceOf[js.Any])
    
    inline def setKernelGatewayImageConfigUndefined: Self = StObject.set(x, "KernelGatewayImageConfig", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
