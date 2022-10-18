package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingClusterConfig extends StObject {
  
  /**
    * The number of ML compute instances to use in the processing job. For distributed processing jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: ProcessingInstanceCount
  
  /**
    * The ML compute instance type for the processing job.
    */
  var InstanceType: ProcessingInstanceType
  
  /**
    * The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the processing job.   Certain Nitro-based instances include local storage, dependent on the instance type. Local storage volumes are encrypted using a hardware module on the instance. You can't request a VolumeKmsKeyId when using an instance type with local storage. For a list of instance types that support local instance storage, see Instance Store Volumes. For more information about local instance storage encryption, see SSD Instance Store Volumes. 
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The size of the ML storage volume in gigabytes that you want to provision. You must specify sufficient ML storage for your scenario.  Certain Nitro-based instances include local storage with a fixed total size, dependent on the instance type. When using these instances for processing, Amazon SageMaker mounts the local instance storage instead of Amazon EBS gp2 storage. You can't request a VolumeSizeInGB greater than the total size of the local instance storage. For a list of instance types that support local instance storage, including the total size per instance type, see Instance Store Volumes. 
    */
  var VolumeSizeInGB: ProcessingVolumeSizeInGB
}
object ProcessingClusterConfig {
  
  inline def apply(
    InstanceCount: ProcessingInstanceCount,
    InstanceType: ProcessingInstanceType,
    VolumeSizeInGB: ProcessingVolumeSizeInGB
  ): ProcessingClusterConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], VolumeSizeInGB = VolumeSizeInGB.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessingClusterConfig]
  }
  
  extension [Self <: ProcessingClusterConfig](x: Self) {
    
    inline def setInstanceCount(value: ProcessingInstanceCount): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: ProcessingInstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVolumeSizeInGB(value: ProcessingVolumeSizeInGB): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
  }
}
