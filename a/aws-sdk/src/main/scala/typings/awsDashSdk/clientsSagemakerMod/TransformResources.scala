package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformResources extends js.Object {
  /**
    * The number of ML compute instances to use in the transform job. For distributed transform jobs, specify a value greater than 1. The default value is 1.
    */
  var InstanceCount: TransformInstanceCount
  /**
    * The ML compute instance type for the transform job. If you are using built-in algorithms to transform moderately sized datasets, we recommend using ml.m4.xlarge or ml.m5.large instance types.
    */
  var InstanceType: TransformInstanceType
  /**
    * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance(s) that run the batch transform job. The VolumeKmsKeyId can be any of the following formats:   // KMS Key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    // Amazon Resource Name (ARN) of a KMS Key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
}

object TransformResources {
  @scala.inline
  def apply(
    InstanceCount: TransformInstanceCount,
    InstanceType: TransformInstanceType,
    VolumeKmsKeyId: KmsKeyId = null
  ): TransformResources = {
    val __obj = js.Dynamic.literal(InstanceCount = InstanceCount, InstanceType = InstanceType.asInstanceOf[js.Any])
    if (VolumeKmsKeyId != null) __obj.updateDynamic("VolumeKmsKeyId")(VolumeKmsKeyId)
    __obj.asInstanceOf[TransformResources]
  }
}

