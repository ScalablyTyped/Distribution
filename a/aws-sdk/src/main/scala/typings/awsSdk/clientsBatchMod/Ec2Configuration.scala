package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ec2Configuration extends StObject {
  
  /**
    * The AMI ID used for instances launched in the compute environment that match the image type. This setting overrides the imageId set in the computeResource object.  The AMI that you choose for a compute environment must match the architecture of the instance types that you intend to use for that compute environment. For example, if your compute environment uses A1 instance types, the compute resource AMI that you choose must support ARM instances. Amazon ECS vends both x86 and ARM versions of the Amazon ECS-optimized Amazon Linux 2 AMI. For more information, see Amazon ECS-optimized Amazon Linux 2 AMI in the Amazon Elastic Container Service Developer Guide. 
    */
  var imageIdOverride: js.UndefOr[ImageIdOverride] = js.undefined
  
  /**
    * The Kubernetes version for the compute environment. If you don't specify a value, the latest version that Batch supports is used.
    */
  var imageKubernetesVersion: js.UndefOr[KubernetesVersion] = js.undefined
  
  /**
    * The image type to match with the instance type to select an AMI. The supported values are different for ECS and EKS resources.  ECS  If the imageIdOverride parameter isn't specified, then a recent Amazon ECS-optimized Amazon Linux 2 AMI (ECS_AL2) is used. If a new image type is specified in an update, but neither an imageId nor a imageIdOverride parameter is specified, then the latest Amazon ECS optimized AMI for that image type that's supported by Batch is used.  ECS_AL2   Amazon Linux 2: Default for all non-GPU instance families.  ECS_AL2_NVIDIA   Amazon Linux 2 (GPU): Default for all GPU instance families (for example P4 and G4) and can be used for all non Amazon Web Services Graviton-based instance types.  ECS_AL1   Amazon Linux. Amazon Linux has reached the end-of-life of standard support. For more information, see Amazon Linux AMI.    EKS  If the imageIdOverride parameter isn't specified, then a recent Amazon EKS-optimized Amazon Linux AMI (EKS_AL2) is used. If a new image type is specified in an update, but neither an imageId nor a imageIdOverride parameter is specified, then the latest Amazon EKS optimized AMI for that image type that Batch supports is used.  EKS_AL2   Amazon Linux 2: Default for all non-GPU instance families.  EKS_AL2_NVIDIA   Amazon Linux 2 (accelerated): Default for all GPU instance families (for example, P4 and G4) and can be used for all non Amazon Web Services Graviton-based instance types.    
    */
  var imageType: ImageType
}
object Ec2Configuration {
  
  inline def apply(imageType: ImageType): Ec2Configuration = {
    val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ec2Configuration]
  }
  
  extension [Self <: Ec2Configuration](x: Self) {
    
    inline def setImageIdOverride(value: ImageIdOverride): Self = StObject.set(x, "imageIdOverride", value.asInstanceOf[js.Any])
    
    inline def setImageIdOverrideUndefined: Self = StObject.set(x, "imageIdOverride", js.undefined)
    
    inline def setImageKubernetesVersion(value: KubernetesVersion): Self = StObject.set(x, "imageKubernetesVersion", value.asInstanceOf[js.Any])
    
    inline def setImageKubernetesVersionUndefined: Self = StObject.set(x, "imageKubernetesVersion", js.undefined)
    
    inline def setImageType(value: ImageType): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
  }
}
