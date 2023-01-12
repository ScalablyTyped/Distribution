package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernelGatewayAppSettings extends StObject {
  
  /**
    * A list of custom SageMaker images that are configured to run as a KernelGateway app.
    */
  var CustomImages: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CustomImages] = js.undefined
  
  /**
    * The default instance type and the Amazon Resource Name (ARN) of the default SageMaker image used by the KernelGateway app.  The Amazon SageMaker Studio UI does not use the default instance type value set here. The default instance type set here is used when Apps are created using the Amazon Web Services Command Line Interface or Amazon Web Services CloudFormation and the instance type parameter value is not passed. 
    */
  var DefaultResourceSpec: js.UndefOr[ResourceSpec] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Lifecycle Configurations attached to the the user profile or domain.  To remove a Lifecycle Config, you must set LifecycleConfigArns to an empty list. 
    */
  var LifecycleConfigArns: js.UndefOr[typings.awsSdk.clientsSagemakerMod.LifecycleConfigArns] = js.undefined
}
object KernelGatewayAppSettings {
  
  inline def apply(): KernelGatewayAppSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KernelGatewayAppSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KernelGatewayAppSettings] (val x: Self) extends AnyVal {
    
    inline def setCustomImages(value: CustomImages): Self = StObject.set(x, "CustomImages", value.asInstanceOf[js.Any])
    
    inline def setCustomImagesUndefined: Self = StObject.set(x, "CustomImages", js.undefined)
    
    inline def setCustomImagesVarargs(value: CustomImage*): Self = StObject.set(x, "CustomImages", js.Array(value*))
    
    inline def setDefaultResourceSpec(value: ResourceSpec): Self = StObject.set(x, "DefaultResourceSpec", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceSpecUndefined: Self = StObject.set(x, "DefaultResourceSpec", js.undefined)
    
    inline def setLifecycleConfigArns(value: LifecycleConfigArns): Self = StObject.set(x, "LifecycleConfigArns", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigArnsUndefined: Self = StObject.set(x, "LifecycleConfigArns", js.undefined)
    
    inline def setLifecycleConfigArnsVarargs(value: StudioLifecycleConfigArn*): Self = StObject.set(x, "LifecycleConfigArns", js.Array(value*))
  }
}
