package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceSpec extends StObject {
  
  /**
    * The instance type that the image version runs on.   JupyterServer apps only support the system value. For KernelGateway apps, the system value is translated to ml.t3.medium. KernelGateway apps also support all other values for available instance types. 
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) of the Lifecycle Configuration attached to the Resource.
    */
  var LifecycleConfigArn: js.UndefOr[StudioLifecycleConfigArn] = js.undefined
  
  /**
    * The ARN of the SageMaker image that the image version belongs to.
    */
  var SageMakerImageArn: js.UndefOr[ImageArn] = js.undefined
  
  /**
    * The ARN of the image version created on the instance.
    */
  var SageMakerImageVersionArn: js.UndefOr[ImageVersionArn] = js.undefined
}
object ResourceSpec {
  
  inline def apply(): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpec]
  }
  
  extension [Self <: ResourceSpec](x: Self) {
    
    inline def setInstanceType(value: AppInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLifecycleConfigArn(value: StudioLifecycleConfigArn): Self = StObject.set(x, "LifecycleConfigArn", value.asInstanceOf[js.Any])
    
    inline def setLifecycleConfigArnUndefined: Self = StObject.set(x, "LifecycleConfigArn", js.undefined)
    
    inline def setSageMakerImageArn(value: ImageArn): Self = StObject.set(x, "SageMakerImageArn", value.asInstanceOf[js.Any])
    
    inline def setSageMakerImageArnUndefined: Self = StObject.set(x, "SageMakerImageArn", js.undefined)
    
    inline def setSageMakerImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "SageMakerImageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setSageMakerImageVersionArnUndefined: Self = StObject.set(x, "SageMakerImageVersionArn", js.undefined)
  }
}
