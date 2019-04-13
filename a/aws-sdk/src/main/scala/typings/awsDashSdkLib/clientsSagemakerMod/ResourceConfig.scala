package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConfig extends js.Object {
  /**
    * The number of ML compute instances to use. For distributed training, provide a value greater than 1. 
    */
  var InstanceCount: TrainingInstanceCount
  /**
    * The ML compute instance type. 
    */
  var InstanceType: TrainingInstanceType
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the training job. The VolumeKmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The size of the ML storage volume that you want to provision.  ML storage volumes store model artifacts and incremental states. Training algorithms might also use the ML storage volume for scratch space. If you want to store the training data in the ML storage volume, choose File as the TrainingInputMode in the algorithm specification.  You must specify sufficient ML storage for your scenario.    Amazon SageMaker supports only the General Purpose SSD (gp2) ML storage volume type.  
    */
  var VolumeSizeInGB: awsDashSdkLib.clientsSagemakerMod.VolumeSizeInGB
}

object ResourceConfig {
  @scala.inline
  def apply(
    InstanceCount: TrainingInstanceCount,
    InstanceType: TrainingInstanceType,
    VolumeSizeInGB: VolumeSizeInGB,
    VolumeKmsKeyId: KmsKeyId = null
  ): ResourceConfig = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, InstanceType = InstanceType.asInstanceOf[js.Any], VolumeSizeInGB = VolumeSizeInGB)
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    __obj.asInstanceOf[ResourceConfig]
  }
}

