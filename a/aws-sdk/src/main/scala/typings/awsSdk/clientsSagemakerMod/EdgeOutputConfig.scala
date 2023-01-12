package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdgeOutputConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data on the storage volume after compilation job. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The configuration used to create deployment artifacts. Specify configuration options with a JSON string. The available configuration options for each type are:    ComponentName (optional) - Name of the GreenGrass V2 component. If not specified, the default name generated consists of "SagemakerEdgeManager" and the name of your SageMaker Edge Manager packaging job.    ComponentDescription (optional) - Description of the component.    ComponentVersion (optional) - The version of the component.  Amazon Web Services IoT Greengrass uses semantic versions for components. Semantic versions follow a major.minor.patch number system. For example, version 1.0.0 represents the first major release for a component. For more information, see the semantic version specification.     PlatformOS (optional) - The name of the operating system for the platform. Supported platforms include Windows and Linux.    PlatformArchitecture (optional) - The processor architecture for the platform.  Supported architectures Windows include: Windows32_x86, Windows64_x64. Supported architectures for Linux include: Linux x86_64, Linux ARMV8.  
    */
  var PresetDeploymentConfig: js.UndefOr[String] = js.undefined
  
  /**
    * The deployment type SageMaker Edge Manager will create. Currently only supports Amazon Web Services IoT Greengrass Version 2 components.
    */
  var PresetDeploymentType: js.UndefOr[EdgePresetDeploymentType] = js.undefined
  
  /**
    * The Amazon Simple Storage (S3) bucker URI.
    */
  var S3OutputLocation: S3Uri
}
object EdgeOutputConfig {
  
  inline def apply(S3OutputLocation: S3Uri): EdgeOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputLocation = S3OutputLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeOutputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EdgeOutputConfig] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setPresetDeploymentConfig(value: String): Self = StObject.set(x, "PresetDeploymentConfig", value.asInstanceOf[js.Any])
    
    inline def setPresetDeploymentConfigUndefined: Self = StObject.set(x, "PresetDeploymentConfig", js.undefined)
    
    inline def setPresetDeploymentType(value: EdgePresetDeploymentType): Self = StObject.set(x, "PresetDeploymentType", value.asInstanceOf[js.Any])
    
    inline def setPresetDeploymentTypeUndefined: Self = StObject.set(x, "PresetDeploymentType", js.undefined)
    
    inline def setS3OutputLocation(value: S3Uri): Self = StObject.set(x, "S3OutputLocation", value.asInstanceOf[js.Any])
  }
}
